package in.oracle.mohak.test;

import in.oracle.mohak.bean.VoterVerifier;
import in.oracle.mohak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        VoterVerifier vv=context.getBean("voterVerifier", VoterVerifier.class);
        vv.eligibilityVerification();
        ((AbstractApplicationContext)context).close();
    }
}
