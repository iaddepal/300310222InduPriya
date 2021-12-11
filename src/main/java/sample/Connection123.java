package sample;

import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.DriverManager;

@Service
public class Connection123 {

        public Connection123(){

        }

        public java.sql.Connection connect() throws SQLException, ClassNotFoundException{
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/savings","root"," ");
            return con1;
        }


}
