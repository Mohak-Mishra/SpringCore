package in.oracle.mohak.replacer;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component("interestReplacer")
public class BankCalculateSimpleInterest implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("BankCalculateSimpleInterest.reimplement()");

        double pamt = (double) args[0];
        double rate = (double) args[1];
        double time = (double) args[2];

        return (pamt * rate * time) / 100;
    }

}