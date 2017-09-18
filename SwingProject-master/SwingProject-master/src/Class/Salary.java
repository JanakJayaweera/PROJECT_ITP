/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Salary {
    
        private javax.swing.JTable Table1;
        private String FName,LName;
        private int id,month;
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
      /*  public Salary(int pid, int pmonth)
        {
            
            //Constructor for remove driver part
            
            con = DBconnect.connect();
            
            id = pid;
            month=pmonth;
           
           
            removeAttendance(pid,pmonth);
        }
        
        public void removeAttendance(int pid, String pdate){
        
            try 
            {
                String sql = "UPDATE attendance SET remove = 0 WHERE EID = '"+pid+"' and Date = '"+pdate+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
                
        }
        
        
        public Salary(String pfname,String plname,String pdate,String pon,String poff, int pid, int presult){
             con = DBconnect.connect();
             
             id = pid;
             FName = pfname;
             LName = plname;
             Date = pdate;
             On = pon;
             Off = poff;
            
             
             updateAttendance(presult);
             
             
        }
        
        public void updateAttendance(int presult){
            if(presult==0){
                try {
                String sql = "UPDATE attendance SET Date = '"+Date+"', ONTime = '"+On+"', OFFTime = '"+Off+"' where EID = '"+id+"' and Date = '"+Date+"' " ;
                pst = con.prepareStatement(sql);
                pst.execute();
                
            } catch (Exception e) {
                System.out.println(e);
            }
            }
            
        }
        
        public Salary(String EID,String pfname,String plname,String pdate,String pon,String poff, javax.swing.JTable pTable1)
        {
            con = DBconnect.connect();
           
             FName = pfname;
             LName = plname;
             Date = pdate;
             On = pon;
             Off = poff;
            
             Table1 = pTable1;
           
             addAttendance();
        }
        
        
        public void addAttendance(){   
           try 
            {
                String q = "INSERT INTO attendance (EID,FName,LName,Date,ONTime,OFFTime) values ('"+id+"'"+ FName +"','"+ LName +"','"+ Date +"','"+ On +"','"+ Off +"')";
                pst = con.prepareStatement(q);
                pst.execute();
                
            } 
        
            catch (SQLException e) {
                System.out.println(e);
            }
        }*/
    
}
