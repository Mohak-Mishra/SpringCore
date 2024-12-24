package in.oracle.mohak.test;

import in.oracle.mohak.bean.WishMessageGenerator;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WishMessageGenerator wishMessageGenerator1 = (WishMessageGenerator) context.getBean("wmg1",WishMessageGenerator.class);
        WishMessageGenerator wishMessageGenerator2 = (WishMessageGenerator) context.getBean("wmg2",WishMessageGenerator.class);
        System.out.println(wishMessageGenerator1.hashCode());
        System.out.println(wishMessageGenerator2.hashCode());
    }
}
