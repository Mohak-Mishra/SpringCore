package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDate;
@Component(value = "voterVerifier")
@PropertySource("application.properties")
public class VoterVerifier {
    @Value("${info.voter.name}")
    private String name;
    @Value("${info.voter.age}")
    private Integer age;

    private LocalDate date;
    @PostConstruct
    public void myInit(){
        System.out.println("Initialized");
        if(name == null||age<=0){
            throw new IllegalArgumentException("Invalid voter details");
        }
        date = LocalDate.now();
    }
    public void eligibilityVerification(){
        if(age>=18){
            System.out.println("name : "+name);
            System.out.println("age : "+age);
            System.out.println("date : "+date);
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("name : "+name);
            System.out.println("age : "+age);
            System.out.println("date : "+date);
            System.out.println("you are not eligible to vote");
        }
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println("destroyed");
        name=null;
        age=0;
        date=null;
    }
}
