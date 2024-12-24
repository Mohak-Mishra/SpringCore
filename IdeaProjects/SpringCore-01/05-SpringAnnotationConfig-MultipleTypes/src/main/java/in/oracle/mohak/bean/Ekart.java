package in.oracle.mohak.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@Primary if the qualifier is not present the priority is given to @Primary
public class Ekart implements ICourier {
    @Override
    public String deliver(Integer orderId) {
        return "Ekart will deliver order no. " + orderId;
    }
}
