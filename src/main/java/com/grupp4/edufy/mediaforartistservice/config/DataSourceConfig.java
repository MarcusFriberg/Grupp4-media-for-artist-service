package com.grupp4.edufy.mediaforartistservice.config;
// Imports
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import javax.sql.DataSource;
/**
 * Created by Marcus Friberg on 2022-10-02.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.grupp4.edufy.mediaforartistservice.repository"})
public class DataSourceConfig {
    // Configure the bean for the appDataSource
    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource appDataSource() {
        return DataSourceBuilder
                .create()
                .build();
    }

    // Configure the bean for entityManagerFactory
    @Bean
    @ConfigurationProperties(prefix = "spring.data.jpa.entity")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            DataSource appDataSource) {
        return builder
                .dataSource(appDataSource)
                .build();
    }
}
