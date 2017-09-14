
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class Retailer {
    private int RetailerID;
    private String Name;
    private String RetailerType;
    private int TelephoneNo1;
    private int TelephoneNo2;
    private int FaxNo;
    private String Address;
    private String Email;
    private javax.swing.JTable RetailerDetails;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    //Constuctors
    public Retailer(){
        connection = DBconnect.connect();
    }
    
    
    public Retailer( javax.swing.JTable pRetailerDetails){
        
       connection = DBconnect.connect();
       RetailerDetails = pRetailerDetails;
        
    }
    
    
    public Retailer(int pRetailerID, String pName, String pRetailerType, int pTelephoneNo1, int pTelephoneNo2, int pFaxNo, String pAddress, String pEmail){
        RetailerID = pRetailerID;
        Name = pName;
        RetailerType = pRetailerType;
        TelephoneNo1 = pTelephoneNo1;
        TelephoneNo2 = pTelephoneNo2;
        FaxNo = pFaxNo;
        Address = pAddress;
        Email = pEmail;
        
        connection = DBconnect.connect();
    }
   
    
    public Retailer(String pName, String pRetailerType, int pTelephoneNo1, int pTelephoneNo2, int pFaxNo, String pAddress, String pEmail){
        Name = pName;
        RetailerType = pRetailerType;
        TelephoneNo1 = pTelephoneNo1;
        TelephoneNo2 = pTelephoneNo2;
        FaxNo = pFaxNo;
        Address = pAddress;
        Email = pEmail;
        
        connection = DBconnect.connect();
    }
    
    
    //Methods
    public void tableLoad()
    {
        try
        {
            String q = "SELECT RetailerID, RetailerName, RetailerType, TelephoneNo1, TelephoneNo2, FaxNo, Address, Email FROM retailer ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            RetailerDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    
     public void addRetailer(){
        try
        {
            String q = "INSERT INTO retailer(RetailerName, RetailerType, TelephoneNo1, TelephoneNo2, FaxNo, Address, Email) values ('"+ Name +"', '"+ RetailerType +"', '"+ TelephoneNo1+"', '"+ TelephoneNo2 +"', '"+ FaxNo +"', '"+ Address +"', '"+ Email +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
     
     public void updateRetailer( ){
         try 
         {
             String sql = "UPDATE retailer SET RetailerName = '"+ Name +"', RetailerType = '"+ RetailerType +"', TelephoneNo1 = '"+ TelephoneNo1 +"', TelephoneNo2 = '"+ TelephoneNo2 +"', FaxNo = '"+ FaxNo +"', Address = '"+ Address +"', Email = '"+ Email +"' where RetailerID = '"+ RetailerID +"' " ;
             pst = connection.prepareStatement(sql);
             pst.execute();  
         } 
         catch (Exception e) 
         {
             System.out.println(e);
         }  
    }
     

     public void searchRetailer(javax.swing.JTable Table, int pResultBy, String pResult)
     {
         try
         {
            String sql = (pResultBy==1)?"SELECT RetailerID, RetailerName, RetailerType, TelephoneNo1, TelephoneNo2, FaxNo, Address, Email FROM retailer WHERE RetailerName = '"+ pResult +"' " : "SELECT RetailerID, RetailerName, RetailerType, TelephoneNo1, TelephoneNo2, FaxNo, Address, Email FROM retailer WHERE RetailerID = '"+ pResult +"' ";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            Table.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(SQLException e)
         {
            System.out.println(e);
         }
    }
     
}
