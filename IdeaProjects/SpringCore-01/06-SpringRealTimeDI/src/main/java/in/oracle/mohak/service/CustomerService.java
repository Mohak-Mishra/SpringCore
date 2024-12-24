package in.oracle.mohak.service;

import in.oracle.mohak.beans.CustomerBO;
import in.oracle.mohak.beans.CustomerDTO;
import in.oracle.mohak.dao.ICustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component(value = "customerService")
public final class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerDAO customerDAO;
    @Override
    public String calculateSimpleIntrest(CustomerDTO dto) throws SQLException {
        System.out.println(customerDAO);
        CustomerBO bo=new CustomerBO();
        bo.setName(dto.getName());

        bo.setAddress(dto.getAddress());
        bo.setAmount(dto.getPrincipalAmount());
        bo.setIntrestRate(dto.getInterestRate());
        bo.setTimePeriod(dto.getTimePeriod());
        bo.setIntrestAmount((dto.getPrincipalAmount()*dto.getInterestRate()*dto.getTimePeriod())/100);
        int count=customerDAO.insert(bo);
        return count==1? "Customer registered sucessfully  :: ": "registration failed";
    }
}
