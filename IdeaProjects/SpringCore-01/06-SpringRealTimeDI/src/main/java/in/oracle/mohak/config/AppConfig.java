package in.oracle.mohak.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "in.oracle.mohak")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Autowired
    private Environment environment;
    public AppConfig() {
        System.out.println("AppConfig constructor called");
    }
    @Bean(name = "dataSource")
    public DataSource dataSource() {
      DriverManagerDataSource dmds= new DriverManagerDataSource();
      dmds.setUrl(environment.getProperty("db.mysql.url"));
      dmds.setUsername(environment.getProperty("db.mysql.username"));
      dmds.setPassword(environment.getProperty("db.mysql.password"));
        return dmds;
    }
}
