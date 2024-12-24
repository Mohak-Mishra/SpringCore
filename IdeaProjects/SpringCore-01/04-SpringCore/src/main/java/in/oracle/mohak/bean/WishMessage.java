package in.oracle.mohak.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component(value = "wishMessage")
public class WishMessage {
    @Autowired
    private LocalDateTime ldt;
    public WishMessage() {}
    public String generateWishMessage(String user) {
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        if (hour < 12) {
            return "GoodMorning :: "+user;
        } else if (hour<16) {
            return "GoodAfternoon :: "+user;
        } else if (hour<20) {
            return "GoodEvening :: "+user;
        }
        else{
            return "GoodNight :: "+user;
        }
    }
    @Override
    public String toString() {
        return "WishMessage [ldt=" + ldt + "]";
    }
}
