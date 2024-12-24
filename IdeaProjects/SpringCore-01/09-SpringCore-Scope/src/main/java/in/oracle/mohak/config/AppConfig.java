package in.oracle.mohak.config;

import in.oracle.mohak.bean.WishMessageGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;

public class AppConfig {
    @Bean(name = "wmg1")
    @Scope("singleton")
    public WishMessageGenerator messageGenerator1() {
        WishMessageGenerator Generator = new WishMessageGenerator();
        Generator.setLdt(LocalDateTime.now());
        Generator.setName("Sachin Tendulkar");
        Generator.message();
        return Generator;
    }
    @Bean(name = "wmg2")
    @Scope("singleton")
    public WishMessageGenerator messageGenerator2() {
        WishMessageGenerator Generator = new WishMessageGenerator();
        Generator.setLdt(LocalDateTime.now());
        Generator.setName("Sachin Tendulkar");
        Generator.message();
        return Generator;
    }
}
