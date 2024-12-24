package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public interface Cricketer {
    @Lookup
    CricketBat makeCricketBat();
    default void fielding(){
        System.out.println("Cricketer is doing fielding");
    }
    default void bowling(){
        System.out.println("Cricketer is doing bowling");
    }
    default void wicketKeeping(){
        System.out.println("Cricketer is doing wicket keeping");
    }
    default void batting(){
        System.out.println("Cricketer is doing batting");
       CricketBat cricketBat= makeCricketBat();
        System.out.println(cricketBat.scoreRun());

    }
}

