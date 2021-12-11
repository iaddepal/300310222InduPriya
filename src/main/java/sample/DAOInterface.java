package sample;

import java.sql.SQLException;
import java.util.List;

public interface DAOInterface {

    public String add(InvestmentSaving investmentSaving) throws ClassNotFoundException, SQLException;
    public InvestmentSaving edit(InvestmentSaving inv) throws SQLException,ClassNotFoundException;
    public String delete(String custNo) throws SQLException, ClassNotFoundException;
    public List<InvestmentSaving> display() throws ClassNotFoundException,SQLException;
    public int getDetails(String custNo) throws SQLException, ClassNotFoundException;
}