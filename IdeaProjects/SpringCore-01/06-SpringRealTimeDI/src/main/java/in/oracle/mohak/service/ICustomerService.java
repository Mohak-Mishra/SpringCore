package in.oracle.mohak.service;

import in.oracle.mohak.beans.CustomerDTO;

import java.sql.SQLException;

public interface ICustomerService {
    public String calculateSimpleIntrest(CustomerDTO dto) throws SQLException;
}
