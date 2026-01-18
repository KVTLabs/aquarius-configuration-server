package com.github.kvtlabs.aquarius.configs;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConnection {
    @Value("${application.datasource.url}")
    private String jdbcUrl;
    @Value("${application.datasource.driver}")
    private String driverClassName;
    @Value("${application.datasource.user}")
    private String username;
    @Value("${application.datasource.pass}")
    private String password;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setPoolName("General database connection");
        config.setDriverClassName(this.driverClassName);
        config.setJdbcUrl(this.jdbcUrl);
        config.setUsername(this.username);
        config.setPassword(this.password);

        return new HikariDataSource(config);
    }
}
