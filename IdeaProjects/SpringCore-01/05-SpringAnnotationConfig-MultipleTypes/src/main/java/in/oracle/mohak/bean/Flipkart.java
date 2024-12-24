package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class Flipkart {
    @Qualifier("DTDC")
    @Autowired
    private ICourier courier;
    public String shopping(String[]items,float[] price){
        System.out.println(courier);
        System.out.println();
        float totalAmount=0;
        for(float i:price){
            totalAmount+=i;
        }
        String kourier=courier.deliver(new Random().nextInt(10000));

        return Arrays.toString(items)+" prices "+Arrays.toString(price)+" \n"+kourier+" and your total amount is "+totalAmount;
    }
    @Override
    public String toString() {
        return courier.deliver(100);
    }
}
