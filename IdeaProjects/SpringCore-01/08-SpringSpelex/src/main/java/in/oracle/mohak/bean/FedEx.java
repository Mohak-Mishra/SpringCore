package in.oracle.mohak.bean;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements ICourier{
    @Override
    public String deliveringVendor(Integer courier_Id){
        return "FedEx is the delivering vendor "+courier_Id;
    }
}
