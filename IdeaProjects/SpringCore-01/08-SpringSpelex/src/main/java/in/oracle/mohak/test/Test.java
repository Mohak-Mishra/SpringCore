package in.oracle.mohak.test;

import in.oracle.mohak.bean.Employee;
import in.oracle.mohak.bean.Flipkart;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Flipkart employee=context.getBean("flipkart", Flipkart.class);
        System.out.println(employee);
        System.out.println(employee);
        System.out.println(employee);

        ((AbstractApplicationContext)context).close();
    }
}
