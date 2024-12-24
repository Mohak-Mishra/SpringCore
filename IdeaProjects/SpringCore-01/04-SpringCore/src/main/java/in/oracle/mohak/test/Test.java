package in.oracle.mohak.test;

import in.oracle.mohak.bean.WishMessage;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        WishMessage wmg=(WishMessage) context.getBean("wishMessage", WishMessage.class);;
        System.out.println(wmg.generateWishMessage("akash"));
        System.out.println(wmg);
        // closing the resource
        ((AbstractApplicationContext)context).close();
    }
}
