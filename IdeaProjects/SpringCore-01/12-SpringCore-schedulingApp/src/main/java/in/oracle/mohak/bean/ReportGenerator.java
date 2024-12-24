package in.oracle.mohak.bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ReportGenerator {

   // @Scheduled(initialDelay = 2000, fixedDelay= 3000)
    @Scheduled(cron = " 59 59 23 3 JAN *")
    public void generateSalesReport() {
        System.out.println("Generating Sales Report..."+new Date());
    }
}
