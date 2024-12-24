package in.oracle.mohak.config;

import in.oracle.mohak.bean.WishMessageGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class AppConfig {
    @Bean(name="wmg")
    public WishMessageGenerator wmgObj(){
        WishMessageGenerator wmgObj = new WishMessageGenerator( LocalDateTime.now());
        System.out.println(wmgObj.generateWishMessage("Sachin"));
        return wmgObj;
    }
}
