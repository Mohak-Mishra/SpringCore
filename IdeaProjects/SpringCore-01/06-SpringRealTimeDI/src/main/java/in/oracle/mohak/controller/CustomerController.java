package in.oracle.mohak.controller;

import in.oracle.mohak.beans.CustomerDTO;
import in.oracle.mohak.beans.CustomerVo;
import in.oracle.mohak.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component(value="customerController")
public final class CustomerController {
    @Autowired
    private ICustomerService customerService;
    CustomerDTO dto=new CustomerDTO();
    public String processCostumer(CustomerVo vo) throws SQLException {
        System.out.println(customerService);
        dto.setName(vo.getCustomerName());

        dto.setAddress(vo.getCustomerAddress());
        dto.setPrincipalAmount(Float.parseFloat(vo.getPrincipalAmount()));
        dto.setInterestRate(Float.parseFloat(vo.getRateOfInterest()));
        dto.setTimePeriod(Float.parseFloat(vo.getTimePeriod()));
        return customerService.calculateSimpleIntrest(dto);
    }
}
