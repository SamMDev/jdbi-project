package com.example.jdbiproject.jdbi;

import com.example.jdbiproject.db.model.EntityBinaryObject;
import com.example.jdbiproject.db.model.EntityProduct;
import com.example.jdbiproject.db.model.EntityUser;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapperFactory;
import org.jdbi.v3.postgres.PostgresPlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbiConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource driverManagerDataSource() {
        return new DriverManagerDataSource();
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public Jdbi jdbi(DataSource dataSource) {
        return Jdbi.create(dataSource)
                .installPlugin(new SqlObjectPlugin())
                .installPlugin(new PostgresPlugin())
                // here goes all the row mappers
                .registerRowMapper(RowMapperFactory.of(EntityUser.class, new EntityRowMapper<>(EntityUser.class)))
                .registerRowMapper(RowMapperFactory.of(EntityBinaryObject.class, new EntityRowMapper<>(EntityBinaryObject.class)))
                .registerRowMapper(RowMapperFactory.of(EntityProduct.class, new EntityRowMapper<>(EntityProduct.class)))
                ;
    }

}
