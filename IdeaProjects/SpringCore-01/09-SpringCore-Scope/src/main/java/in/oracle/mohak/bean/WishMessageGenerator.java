package in.oracle.mohak.bean;

import java.time.LocalDateTime;

public class WishMessageGenerator {

    private LocalDateTime ldt;
    private String name;

    public void message(){
        System.out.println(ldt);
        System.out.println("hello :: "+this.name);
    }
    public LocalDateTime getLdt() {
        return ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
