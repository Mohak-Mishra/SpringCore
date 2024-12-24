package in.oracle.mohak.test;

import in.oracle.mohak.beans.CustomerVo;
import in.oracle.mohak.config.AppConfig;
import in.oracle.mohak.controller.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner sc=new Scanner(System.in);
        CustomerVo vo=new CustomerVo();
        System.out.print("enter name :: ");
        String name=sc.nextLine();

        System.out.print("enter address :: ");
        String address=sc.nextLine();
        System.out.print("enter principal amount :: ");
        String principal=sc.nextLine();
        System.out.print("enter interest rate :: ");
        String rate=sc.nextLine();
        System.out.print("enter tenure :: ");
        String tenure=sc.nextLine();
        vo.setCustomerName(name);
        System.out.println(vo.getCustomerName());
        vo.setCustomerAddress(address);
        vo.setPrincipalAmount(principal);
        vo.setRateOfInterest(rate);
        vo.setTimePeriod(tenure);

       CustomerController cc= (CustomerController)context.getBean("customerController", CustomerController.class);
        System.out.println(cc.processCostumer(vo));
        ((AbstractApplicationContext)context).close();
    }
}
