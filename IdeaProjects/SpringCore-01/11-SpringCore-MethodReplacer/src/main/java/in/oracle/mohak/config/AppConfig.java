package in.oracle.mohak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "in.oracle.mohak")
@ImportResource(locations = "applicationContext.xml")
public class AppConfig {
}
