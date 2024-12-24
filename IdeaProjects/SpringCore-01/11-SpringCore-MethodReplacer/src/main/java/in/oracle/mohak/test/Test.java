package in.oracle.mohak.test;

import in.oracle.mohak.bean.Bank;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Bank bank=context.getBean("bank",Bank.class);
        System.out.println(bank.calculateCompoundInterest(150000,15,15));
        ((AbstractApplicationContext)context).close();
    }
}
