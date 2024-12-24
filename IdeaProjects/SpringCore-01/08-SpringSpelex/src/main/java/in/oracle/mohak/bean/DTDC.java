package in.oracle.mohak.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class DTDC implements ICourier{
    @Override
    public String deliveringVendor(Integer courier_Id){
        return "DTDC is the delivering vendor "+courier_Id;
    }
}
