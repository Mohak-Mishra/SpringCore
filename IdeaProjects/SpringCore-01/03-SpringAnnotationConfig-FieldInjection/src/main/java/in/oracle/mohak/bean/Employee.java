package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
@PropertySource("application.properties")
public class Employee implements Serializable {
    @Value("${info.emp.name}")
    private String name;
    @Value("${info.emp.id}")
    private Integer id;
    @Value("${info.emp.age}")
    private Float age;
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
