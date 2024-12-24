package in.oracle.mohak.bean;

import org.springframework.stereotype.Component;

//@Component(value = "courier") not a good practice
@Component
public class FedEx implements ICourier {
    @Override
    public String deliver(Integer orderId) {
        return "FedEx will deliver order no. " + orderId;
    }
}
