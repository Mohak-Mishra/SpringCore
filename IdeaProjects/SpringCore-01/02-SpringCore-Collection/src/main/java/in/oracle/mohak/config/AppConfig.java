package in.oracle.mohak.config;

import in.oracle.mohak.bean.Employee;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppConfig {
    static{
        System.out.println("AppConfig initialized");
    }
    public AppConfig() {
        System.out.println("AppConfig constructor called");
    }
    @Bean(name = "asd")
    public Employee empObj(){
        Employee emp = new Employee(List.of("Rahul","Tanmay","Mohit","Gaurav","Prakhar"), Set.of("9999887766","6666554444"), Map.of("HDFC","2022005100222"),12,"Mohak",500000);
        return emp;
    }
}
