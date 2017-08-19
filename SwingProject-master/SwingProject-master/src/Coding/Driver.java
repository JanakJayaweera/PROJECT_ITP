
package Coding;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import GUI.Internal.Driver.addDriver;

public class Driver {
        
        private javax.swing.JTable Table1;
        private String fname,lname,NIC,drvlicence,DOB,telephone,address,email;
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        public Driver(String pfname,String plname,String pNIC,String pdrvlicence,String pDOB,String ptelephone,String paddress,String pemail, javax.swing.JTable pTable1)
        {
            con = DBconnect.connect();
           
             fname = pfname;
             lname = plname;
             NIC = pNIC;
             drvlicence = pdrvlicence;
             DOB = pDOB;
             telephone = ptelephone;
             address = paddress;
             email = pemail;
             Table1 = pTable1;
           
             addDriver();
        }
        
        
        public void addDriver(){   
           try 
            {
                String q = "INSERT INTO driver (fname,lname,nic,licenceno,DOB,telephone,address,email) values ('"+ fname +"','"+ lname +"','"+ NIC +"','"+ drvlicence +"','"+ DOB +"','"+ telephone +"','"+ address +"','"+ email +"')";
                pst = con.prepareStatement(q);
                pst.execute();
                tableLoad();
            } 
        
            catch (SQLException e) {
                System.out.println(e);
            }
        }        
        
        
        public void tableLoad()
        {           
            
            try{
            
                String sql = "SELECT driverID,fname,lname,nic,licenceno,DOB,telephone,address,email FROM driver";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                Table1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            
            catch(SQLException e){
                System.out.println(e);
            }
        }
}
