### 一. 环境搭建
#### 1.创建数据库
```sql
CREATE DATABASE IF NOT EXISTS sharding1;
CREATE DATABASE IF NOT EXISTS sharding2;
```
#### 2. 在数据库创建表
```sql
CREATE TABLE IF NOT EXISTS `order`
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

#### 3. 约定规则：如果订单id是奇数把数据添加sharding1,如果偶数添加到sharding2