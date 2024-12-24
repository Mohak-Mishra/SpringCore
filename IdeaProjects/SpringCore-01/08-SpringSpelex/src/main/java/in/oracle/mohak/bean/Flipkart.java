package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
    @Value("#{fedEx}")
    ICourier courier;
    @Override
    public String toString() {
        return "Flipkart [courier=" + courier.deliveringVendor(new java.util.Random().nextInt(1000)) + "]";
    }
}
