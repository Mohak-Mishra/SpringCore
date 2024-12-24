package in.oracle.mohak.bean;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {
    public int scoreRun() {
        System.out.println("batsmen scored the runs");
        return new java.util.Random().nextInt(200);
    }

}
