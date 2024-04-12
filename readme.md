### 一. 环境搭建

>spring-boot: 2.7.6
> 
>shardingsphere-jdbc-core-spring-boot-starter: 5.1.0

#### 1.创建数据库
```sql
CREATE DATABASE IF NOT EXISTS sharding0;
CREATE DATABASE IF NOT EXISTS sharding1;
```
#### 2. 在数据库创建表
```sql
CREATE TABLE IF NOT EXISTS `t_order`
(
    `order_id` bigint NOT NULL COMMENT '订单ID',
    `user_id`  bigint NOT NULL COMMENT '用户ID',
    `ctime`    bigint NOT NULL COMMENT '创建时间',
    `utime`    bigint NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`order_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='订单表'
```

#### 3. 约定规则：如果订单id是奇数把数据添加sharding1,如果偶数添加到sharding0

### 二. 问题
#### 1.`org.yaml.snakeyaml.representer.Representer: method 'void <init>()' not found`
解决方案：重写`org.yaml.snakeyaml.representer.Representer`，添加默认构造函数

#### 2. `You have an error in your SQL syntax`
解决方案：表名不能为`order`，属于关键词

#### 3. 测试XA事务时，`com.atomikos.icatch.jta.JtaTransactionServicePlugin does not define or inherit an implementation of the resolved method 'abstract void beforeInit()' of interface com.atomikos.icatch.TransactionServicePlugin`
解决方案：`shardingsphere-transaction-xa-core` 版本调整为 5.0.0

#### 4. `org.hibernate.LazyInitializationException - could not initialize proxy - no Session`
解决方案：在方法上或者类上添加 `org.springframework.transaction.annotation.Transactional`