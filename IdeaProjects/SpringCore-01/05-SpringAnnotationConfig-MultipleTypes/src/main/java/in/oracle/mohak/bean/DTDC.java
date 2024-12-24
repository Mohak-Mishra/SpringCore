package in.oracle.mohak.bean;

import org.springframework.stereotype.Component;

@Component
public class DTDC implements ICourier {
    @Override
    public String deliver(Integer orderId) {
        return "DTDC will deliver order no. " + orderId;
    }
}
