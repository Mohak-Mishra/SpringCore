package in.oracle.mohak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "in.oracle.mohak.bean")
@EnableScheduling
public class AppConfig {
}
