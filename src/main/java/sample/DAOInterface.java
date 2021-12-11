package sample;

import java.sql.SQLException;

public interface DAOInterface {

    void add(InvestmentSaving saving1) throws ClassNotFoundException, SQLException;

    InvestmentSaving edit(InvestmentSaving custNo, String custName, double cDep, int nyears, String savType) throws SQLException, ClassNotFoundException;

    void delete(String var1) throws SQLException;

    void display() throws ClassNotFoundException,SQLException;
}
