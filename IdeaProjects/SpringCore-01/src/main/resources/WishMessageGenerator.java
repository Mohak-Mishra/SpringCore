package in.oracle.mohak.bean;

import java.time.LocalDateTime;
public class WishMessageGenerator {
    static {
        System.out.println("WishMessageGenerator.static initializer");
    }
    public WishMessageGenerator(){}
    private LocalDateTime localDate;
    public WishMessageGenerator(LocalDateTime date){
        this.localDate=date;
    }
    // business logic
    public String generateWishMessage(String user) {
    int hour = localDate.getHour();
    int minute = localDate.getMinute();
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

    public void setLocalDate(LocalDateTime localDate) {
        this.localDate = localDate;
    }
    @Override
    public String toString() {
        return "WishMessageGenerator [localDate=" + localDate + "]";
    }
}
