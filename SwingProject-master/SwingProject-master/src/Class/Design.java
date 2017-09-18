
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class Design {
    private String DesignID;
    private String DesignName;
    private String DesignFeatures;
    private String DesignColor;
    private String DesignMaterial;
    private int UnitPrice;
    private javax.swing.JTable DesignDetails;
    
 
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
   
    //test
    public Design( ){
        
       connection = DBconnect.connect();
       
    }
    
    public Design( javax.swing.JTable pDesignDetails){
        
       connection = DBconnect.connect();
       DesignDetails = pDesignDetails;
        
    }
    
    public Design(String pDesignID, String pDesignName, String pDesignFeatures, String pDesignColor, String pDesignMaterial, int pUnitPrice){
        DesignID = pDesignID;
        DesignName = pDesignName;
        DesignFeatures = pDesignFeatures;
        DesignColor = pDesignColor;
        DesignMaterial = pDesignMaterial;
        UnitPrice = pUnitPrice;
        
        connection = DBconnect.connect();
    }
    
    
    public void addDesign(){
        try
        {
            String q = "INSERT INTO design(DesignID, DesignName, DesignFeatures, DesignColor, DesignMaterial, UnitPrice) values ('"+ DesignID +"', '"+ DesignName +"', '"+ DesignFeatures +"', '"+ DesignColor +"', '"+ DesignMaterial +"', '"+ UnitPrice +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    public void updateDesign( ){
         try 
         {
             String sql = "UPDATE design SET  DesignName = '"+ DesignName +"', DesignFeatures = '"+ DesignFeatures +"', DesignColor = '"+ DesignColor +"', DesignMaterial = '"+ DesignMaterial +"', UnitPrice = '"+ UnitPrice +"' WHERE DesignID = '"+ DesignID +"' " ;
             pst = connection.prepareStatement(sql);
             pst.execute();  
         } 
         catch (Exception e) 
         {
             System.out.println(e);
         }
            
    }
    
    public void searchDesign(javax.swing.JTable Table, int pResultBy, String pResult)
     {
          try
         {
            String sql = (pResultBy==1)? "SELECT DesignID, DesignName, DesignFeatures, DesignColor, DesignMaterial, UnitPrice FROM design WHERE DesignName = '"+pResult+"'" : "SELECT DesignID, DesignName, DesignFeatures, DesignColor, DesignMaterial FROM design WHERE DesignID = '"+pResult+"'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            Table.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(SQLException e)
         {
            System.out.println(e);
         }
    }
    
    /*
    public void selectDetails(){
         AddUpdateRemoveDesign a1  = new AddUpdateRemoveDesign();
         a1.setDesignID(DesignID);
         a1.setDesignName(DesignName);
         a1.setDesignFeatures(DesignFeatures);
         a1.setDesignColor(DesignColor);
         a1.setDesignMaterial(DesignMaterial);
     }
    
    
    public void clearDetails(){
         AddUpdateRemoveDesign a2  = new AddUpdateRemoveDesign();
         a2.setDesignID("");
         a2.setDesignName("");
         a2.setDesignFeatures("");
         a2.setDesignColor("");
         a2.setDesignMaterial("");
     }
    */
    
    public void tableLoad()
    {
        try
        {
            String q = "SELECT DesignID, DesignName, DesignFeatures, DesignColor, DesignMaterial, UnitPrice FROM design ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            DesignDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
     
}
