
package Coding;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Driver {
        
        Connection con = null;
        PreparedStatement pst = null;
        
        String fname,lname,NIC,drvlicence,day,month,year,telephone,address,email;
        
        public Driver(String pfname,String plname,String pNIC,String pdrvlicence,String pday,String pmonth,String pyear,String ptelephone,String paddress,String pemail)
        {
           con = DBconnect.connect();
           
           fname = pfname;
           lname = plname;
           NIC = pNIC;
           drvlicence = pdrvlicence;
           day = pday;
           month = pmonth;
           year = pyear;
           telephone = ptelephone;
           address = paddress;
           email = pemail;
           
           try 
        {
        String q = "INSERT INTO driver (fname,lname,nic,licenceno,birthdate,birthmonth,birthyear,telephone,address,email) values ('"+ fname +"','"+ lname +"','"+ NIC +"','"+ drvlicence +"','"+ day +"','"+ month +"','"+ year +"','"+ telephone +"','"+ address +"','"+ email +"')";
        pst = con.prepareStatement(q);
        pst.execute();
        } 
        
        catch (SQLException e) {
            
        }
                 
        }
}
