package in.oracle.mohak.bean;

import org.springframework.stereotype.Component;

@Component
public class Ekart implements ICourier{
    @Override
    public String deliveringVendor(Integer courier_Id){
        return "Ekart is the delivering vendor "+courier_Id;
    }
}