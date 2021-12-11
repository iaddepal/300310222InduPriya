import org.junit.Test;
import org.junit.runner.RunWith;
import sample.DAOImplementation;
import sample.InvestmentSaving;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;



class DAOImplementationTests {

/**
    private DAOImplementation panelDao;

    @Mock
    private Connection connection;

    @Mock
    private ResultSet result;

    @Mock
    private PreparedStatement stmt;

    InvestmentSaving inv;

    public void setup() throws SQLException,ClassNotFoundException{
        MockitoAnnotations.openMocks(this);

        when(connection.prepareStatement(any(String.class))).thenReturn(stmt);

        inv=new InvestmentSaving("101","Jhon", 15000.0, 5, "Savings_Deluxe");
    }

    @Test
    void add() throws SQLException,ClassNotFoundException{
        panelDao.add(inv);
        Mockito.verify(stmt).executeUpdate();
    }

    @Test
    void edit() throws SQLException,ClassNotFoundException{
        panelDao.add(inv);

        inv=new InvestmentSaving("101","Jhony", 15000.0, 5, "Savings_Deluxe");
        InvestmentSaving pp=panelDao.edit(inv,"101");

        assertEquals("Johny",pp.getCustName());
    }

    @Test
    void delete() throws SQLException,ClassNotFoundException{
        panelDao.add(inv);
        panelDao.delete(inv.getCustNo());
        Mockito.verify(stmt, Mockito.times(2)).executeUpdate();
    }


**/

}

