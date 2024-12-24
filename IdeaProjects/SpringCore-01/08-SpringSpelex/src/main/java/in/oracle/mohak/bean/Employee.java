package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component(value = "employe")
@PropertySource("application.properties")
public class Employee {
    @Value("${info.emp.name}")
    private String name;
    @Value("${info.emp.age}")
    private Integer age;
    @Value("${info.emp.id}")
    private Integer id;
    @Value("${info.emp.phoneNo}")
    private Set<String> phoneNo;
    @Value("#{${info.emp.accounts}}")
    private Map<String ,Long>accounts;
    @Value("${info.emp.friends}")
    private List<String> friends;
    @Value("#{new java.util.Random().nextFloat(100000,2000000)}")
    private Float salary;
    @Value("#{T (java.time.LocalDate).of(2004,7,22)}")
    private LocalDate dateOfBirth;
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Set<String> phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Map<String, Long> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Long> accounts) {
        this.accounts = accounts;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phoneNo=" + phoneNo +
                ", accounts=" + accounts +
                ", friends=" + friends +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
