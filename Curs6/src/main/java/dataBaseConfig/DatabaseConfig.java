package dataBaseConfig;

import org.hibernate.persister.walking.spi.EntityIdentifierDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories({"repository"})
@ComponentScan({"repository"})


public class DatabaseConfig {

    @Bean
    DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");

        return dataSource;

    }

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean  = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());

        entityManagerFactoryBean.setPackagesToScan("entities");

        JpaVendorAdapter VendorAdapter = new HibernateJpaVendorAdapter();
        entityManagerFactoryBean.setJpaVendorAdapter(VendorAdapter);

        return entityManagerFactoryBean;

    }

    @Bean
    PlatformTransactionManager platformTransactionManager(EntityManagerFactory entityManagerFactory){

        JpaTransactionManager TransactionManager  = new JpaTransactionManager();
        TransactionManager.setEntityManagerFactory(entityManagerFactory);
        return TransactionManager;

    }
}
