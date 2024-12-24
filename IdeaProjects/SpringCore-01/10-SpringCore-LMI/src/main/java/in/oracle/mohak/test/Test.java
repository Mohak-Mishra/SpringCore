package in.oracle.mohak.test;

import in.oracle.mohak.bean.Cricketer;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Cricketer cricketer=context.getBean("cricketer", Cricketer.class);
        System.out.println(cricketer);// IOC container creates a proxy class of Cricketer
        cricketer.batting();
        cricketer.bowling();
        cricketer.wicketKeeping();
        cricketer.fielding();
    }
}
