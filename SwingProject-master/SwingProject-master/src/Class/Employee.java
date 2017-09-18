

package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee{
        
        private javax.swing.JTable Table1;
        private String fname,lname,NIC,drvlicence,DOB,telephone,address,email,position;
        private int id;
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        
    public Employee(int pid, String pfname, String plname)
        {
            
            //Constructor for remove employee part
            
            con = DBconnect.connect();
            
            id = pid;
            fname = pfname;
            lname = plname;
            removeEmployee(pid);
        }
        
    public void removeEmployee(int pid){
        
            try 
            {
                String sql = "UPDATE employee SET employment = 0, availability= 0 WHERE EID = '"+pid+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
                System.out.println("removeEmp");
            }
                
        }
        
        
        public Employee(String pfname,String plname,String pNIC,String pdrvlicence,String pDOB,String pPosition,String ptelephone,String paddress,String pemail, int pid, int presult){
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
             position=pPosition;
             
             updateEmployee(presult);
             
             
        }
        
        public void updateEmployee(int presult){
            if(presult==0){
                try {
                String sql = "UPDATE Employee SET fname = '"+fname+"',lname = '"+lname+"',nic = '"+NIC+"', licenceno = '"+drvlicence+"', DOB = '"+DOB+"', position = '"+position+"'telephone = '"+telephone+"', address = '"+address+"', email = '"+email+"' where driverID = '"+id+"' " ;
                pst = con.prepareStatement(sql);
                pst.execute();
                
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("updateEmp");
            }
            }
            
        }
        
        public Employee(String pfname,String plname,String pNIC,String pdrvlicence,String pDOB,String pPosition,String ptelephone,String paddress,String pemail, javax.swing.JTable pTable1)
        {
            con = DBconnect.connect();
           
             fname = pfname;
             lname = plname;
             NIC = pNIC;
             drvlicence = pdrvlicence;
             DOB = pDOB;
             position=pPosition;
             telephone = ptelephone;
             address = paddress;
             email = pemail;
             Table1 = pTable1;
           
             addEmployee();
        }
        
        
        public void addEmployee(){   
           try 
            {
                String q = "INSERT INTO Employee (fname,lname,nic,licenceno,DOB,position,telephone,address,email) values ('"+ fname +"','"+ lname +"','"+ NIC +"','"+ drvlicence +"','"+ DOB +"','"+ telephone +"','"+ address +"','"+ email +"')";
                pst = con.prepareStatement(q);
                pst.execute();
                
            } 
        
            catch (SQLException e) {
                System.out.println(e);
                System.out.println("addEmp");
            }
        }
        
        

        
        
        
        
}


    

