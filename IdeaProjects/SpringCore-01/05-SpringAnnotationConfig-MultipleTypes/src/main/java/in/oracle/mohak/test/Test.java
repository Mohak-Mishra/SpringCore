package in.oracle.mohak.test;

import in.oracle.mohak.bean.Flipkart;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        String[] definition=context.getBeanDefinitionNames();
        for(String bean:definition){
            System.out.println(bean);
        }
        String[] price={"iphone","aipods","macbook"};
        Flipkart flipkart=(Flipkart) context.getBean("flipkart",Flipkart.class);
        System.out.println(flipkart.shopping(price,new float[]{149000.9f,25000f,500000f}));
        ((AbstractApplicationContext)context).close();
    }
}
