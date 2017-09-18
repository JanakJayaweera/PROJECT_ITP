/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author sumedha
 */
import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Job {
    
        private javax.swing.JTable Table1;
        private String Title,Description,BasicSalary,OTRate,Allowance;
      //  private float BasicSalary,OTRate,Allowance;
        private int jid;
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
            public Job(int pid, String ptitle)
        {
            
            //Constructor for remove employee part
            
            con = DBconnect.connect();
            
            jid = pid;
            Title = ptitle;
           // lname = plname;
            removeJob(pid);
        }
        
    public void removeJob(int pid){
        
            try 
            {
                String sql = "UPDATE jobDetails SET employment = 0, availability= 0 WHERE JID = '"+pid+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
                System.out.println("removeJob");
            }
                
        }
    
    
    public Job(String ptitle,String pbasic,String pot,String pallowance,String pdesc,int pid,int presult){
        
             con = DBconnect.connect();
             
             jid = pid;
             Title = ptitle;
             BasicSalary = pbasic;
             OTRate = pot;
             Allowance = pallowance;
             Description = pdesc;
             
             
             updateJob(presult);
             
             
        }
        
        public void updateJob(int presult){
            if(presult==0){
                try {
                String sql = "UPDATE jobdetails SET Title = '"+Title+"',BasicSalary = '"+BasicSalary+"',OTRate = '"+OTRate+"', Allowance = '"+Allowance+"', Description = '"+Description+"' where JID = '"+jid+"' " ;
                pst = con.prepareStatement(sql);
                pst.execute();
                
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("updateEmp");
            }
            }
            
        }
        
        public Job(String ptitle,String pbasic,String pot,String pallowance,String pdesc, javax.swing.JTable pTable1)
        {
            con = DBconnect.connect();
           
             Title = ptitle;
             BasicSalary = pbasic;
             OTRate = pot;
             Allowance = pallowance;
             Description = pdesc;
            
             Table1 = pTable1;
           
             addJob();
        }
        
        
        public void addJob(){   
           try 
            {
                String q = "INSERT INTO jobdetails (Title,BasicSalary,OTRate,Allowance,Description) values ('"+ Title +"','"+ BasicSalary +"','"+ OTRate +"','"+ Allowance +"','"+ Description +"')";
                pst = con.prepareStatement(q);
                pst.execute();
                
            } 
        
            catch (SQLException e) {
                System.out.println(e);
                System.out.println("addEmp");
            }
        }
    
    
    
}

