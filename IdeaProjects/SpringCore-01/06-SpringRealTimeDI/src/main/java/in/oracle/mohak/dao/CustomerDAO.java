package in.oracle.mohak.dao;

import in.oracle.mohak.beans.CustomerBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component(value = "customerDAO")
public final class CustomerDAO implements ICustomerDAO {
    @Autowired
    private DataSource dataSource;
    private static final String SQL_INSERT="insert into customerDetails(`name`,`address`,`amount`,`roi`,`tenure`,`interest`) values(?,?,?,?,?,?)";
    @Override
    public Integer insert(CustomerBO bo) throws SQLException {
        int rv=0;
        try(Connection connection= dataSource.getConnection();){
          PreparedStatement preparedStatement= connection.prepareStatement(SQL_INSERT);
            System.out.println(bo.getIntrestAmount());
          preparedStatement.setString(1,bo.getName());
          preparedStatement.setString(2,bo.getAddress());
          preparedStatement.setFloat(3,bo.getAmount());
          preparedStatement.setFloat(4,bo.getIntrestRate());
          preparedStatement.setFloat(5,bo.getTimePeriod());
          preparedStatement.setFloat(6,bo.getIntrestAmount());
          rv=preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return rv;
    }
}
