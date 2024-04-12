package com.jonas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * TransactionConfiguration
 *
 * @author shenjy
 * @time 2024/4/12 10:24
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfiguration {

    /**
     * 关联 datasource 到 spring 的 PlatformTransactionManager（没有直接使用 jdbc 原生事务）
     */
    @Bean
    public PlatformTransactionManager transactionManager(final DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
