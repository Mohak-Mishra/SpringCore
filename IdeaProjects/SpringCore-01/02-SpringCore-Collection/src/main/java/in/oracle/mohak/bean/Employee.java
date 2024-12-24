package in.oracle.mohak.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee implements Serializable {
        private List<String> friends;
        private Set<String> phoneNo;
        private Map<String,String> accountNo;
        private int id;
        private String name;
        private double salary;
        public Employee() {}
        public Employee(List<String> friends, Set<String> phoneNo, Map<String, String> accountNo, int id, String name, double salary) {
            this.friends = friends;
            this.phoneNo = phoneNo;
            this.accountNo = accountNo;
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        @Override
    public String toString() {
            return "Employee [friends=" + friends + ", phoneNo=" + phoneNo + ", accountNo="+accountNo+", id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }
}
