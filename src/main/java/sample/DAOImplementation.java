package sample;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOImplementation implements DAOInterface{
    public Connection123 con1;

    public DAOImplementation(Connection123 con1) throws SQLException{
        this.con1 = con1;
    }

    @Override
    public void add(InvestmentSaving investmentSaving)throws ClassNotFoundException,SQLException{

        String query1 = "INSERT INTO SAVINGS VALUES(?,?,?,?,?)";
        PreparedStatement query = con1.connect().prepareStatement(query1);

        query.setString(1,investmentSaving.getCustNo());
        query.setString(2,investmentSaving.getCustName());
        query.setDouble(3,investmentSaving.getcDep());
        query.setInt(4,investmentSaving.getnYears());
        query.setString(5,investmentSaving.getSavType());

        query.executeUpdate();
        //System.out.println("One record added");
    }

    @Override
    public InvestmentSaving edit(InvestmentSaving custNo,  String custName, double cDep, int nyears, String savType) throws SQLException, ClassNotFoundException{

        PreparedStatement query = this.con1.connect().prepareStatement("Update savings set custNo=?,custName=?,cDep=?,nYears=?,savType=? where custno=?");
        query.setString(1,);
    }


}
