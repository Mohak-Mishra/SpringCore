package in.oracle.mohak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages = "in.oracle.mohak.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig constructor called");
    }
    @Bean( name = "ldt")
    public LocalDateTime localDateTime() {
        System.out.println( "name is ldt");
        return LocalDateTime.now(); // or any other specific time you want
    }

}
