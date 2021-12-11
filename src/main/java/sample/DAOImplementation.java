package sample;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DAOImplementation implements DAOInterface {
    public Connection123 con1;

    public DAOImplementation(Connection123 con1) throws SQLException{
        this.con1=con1;
    }

    @Override
    public String add(InvestmentSaving investmentSaving) throws ClassNotFoundException,SQLException{
        String quer1="INSERT INTO SAVINGSTABLE VALUES(?,?,?,?,?)";
        PreparedStatement query=con1.connect().prepareStatement(quer1);

        query.setString(1,investmentSaving.getCustNo());
        query.setString(2,investmentSaving.getCustName());
        query.setDouble(3,investmentSaving.getcDep());
        query.setInt(4,investmentSaving.getnYears());
        query.setString(5,investmentSaving.getSavType());


        query.executeUpdate();

        return "One record added";
    }
    @Override
    public InvestmentSaving edit(InvestmentSaving investmentSaving) throws SQLException,ClassNotFoundException{
        PreparedStatement query;
        query=con1.connect().prepareStatement("Update SAVINGSTABLE set custno=?,custname=?, cdep=?, nyears=?, savtype=? where custno=?");
        query.setString(1,investmentSaving.getCustNo());
        query.setString(2,investmentSaving.getCustName());
        query.setDouble(3,investmentSaving.getcDep());
        query.setInt(4,investmentSaving.getnYears());
        query.setString(5,investmentSaving.getSavType());

        query.executeUpdate();

        System.out.println("One record edited");

        return investmentSaving;
    }
    @Override
    public String delete(String custNo) throws SQLException, ClassNotFoundException {
        String quer1="Delete from SAVINGSTABLE where custno=?";
        PreparedStatement query=con1.connect().prepareStatement(quer1);
        query.setString(1,custNo);
        query.executeUpdate();

        return "One record deleted";
    }
    @Override
    public int getDetails(String custNo) throws SQLException, ClassNotFoundException {
        String quer1="select * from SAVINGSTABLE where custno=?";
        PreparedStatement query=con1.connect().prepareStatement(quer1);
        query.setString(1,custNo);
        ResultSet rs=query.executeQuery();
        int row = 0;
        if(rs.next())
            row = rs.getRow();

        return row;

    }
    @Override
    public List<InvestmentSaving> display() throws ClassNotFoundException,SQLException{
        String quer1="Select * from SAVINGSTABLE";
        PreparedStatement query=con1.connect().prepareStatement(quer1);

        ResultSet rs=query.executeQuery();
        List<InvestmentSaving> invList = new ArrayList<InvestmentSaving>();

        InvestmentSaving inv1;

        while(rs.next()){
            inv1=new InvestmentSaving(rs.getString("custno"), rs.getString("custname"), rs.getDouble("cdep"), rs.getInt("nyears"), rs.getString("savtype"));
            invList.add(inv1);
        }
        return invList;
    }


}
