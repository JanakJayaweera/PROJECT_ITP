
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import GUI.Internal.Driver.addEditDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver {
        
        private javax.swing.JTable Table1;
        private String fname,lname,NIC,drvlicence,DOB,telephone,address,email;
        private int id;
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        
        public Driver(int pid, String pfname, String plname)
        {
            
            //Constructor for remove driver part
            
            con = DBconnect.connect();
            
            id = pid;
            fname = pfname;
            lname = plname;
            removeDriver(pid);
        }
        
        public void removeDriver(int pid){
        
            try 
            {
                String sql = "UPDATE driver SET employment = 0, availability= 0 WHERE driverID = '"+pid+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
                
        }
        
        
        public Driver(String pfname,String plname,String pNIC,String pdrvlicence,String pDOB,String ptelephone,String paddress,String pemail, int pid, int presult){
             con = DBconnect.connect();
             
             id = pid;
             fname = pfname;
             lname = plname;
             NIC = pNIC;
             drvlicence = pdrvlicence;
             DOB = pDOB;
             telephone = ptelephone;
             address = paddress;
             email = pemail;
             
             updateDriver(presult);
             
             
        }
        
        public void updateDriver(int presult){
            if(presult==0){
                try {
                String sql = "UPDATE driver SET fname = '"+fname+"',lname = '"+lname+"',nic = '"+NIC+"', licenceno = '"+drvlicence+"', DOB = '"+DOB+"', telephone = '"+telephone+"', address = '"+address+"', email = '"+email+"' where driverID = '"+id+"' " ;
                pst = con.prepareStatement(sql);
                pst.execute();
                
            } catch (Exception e) {
                System.out.println(e);
            }
            }
            
        }
        
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
                
            } 
        
            catch (SQLException e) {
                System.out.println(e);
            }
        }
        
        

        
        
        
        
}
