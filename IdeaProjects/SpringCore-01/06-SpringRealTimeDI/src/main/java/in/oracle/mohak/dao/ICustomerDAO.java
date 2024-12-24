package in.oracle.mohak.dao;


import in.oracle.mohak.beans.CustomerBO;

import java.sql.SQLException;

public interface ICustomerDAO {
    public Integer insert(CustomerBO bo) throws SQLException;
}
