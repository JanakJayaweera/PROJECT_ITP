

package Class;

import DB.DBconnect;
import GUI.Internal.Driver.serviceVehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class vehicleService {
    
    private javax.swing.JTable Table1;
    private String serviceDate;
    private int vehicleID,meterReading,serviceCost;
    
        
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public vehicleService(int pvehicleID, int pmeterReading, int pserviceCost, String pserviceDate){
    //Constructor for serviceVehicle
        con = DBconnect.connect();
        
        vehicleID = pvehicleID;
        meterReading = pmeterReading;
        serviceCost = pserviceCost;
        serviceDate = pserviceDate;
        
        addService();
    }
    
    public void addService(){
        
        try {
            String sql = "INSERT INTO serviceinfo (vehicleID,meterReading,serviceCost,serviceDate) VALUES ('"+vehicleID +"','"+meterReading +"','"+serviceCost+"','"+serviceDate+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            String sql2 = "UPDATE vehicle SET cMeterReading = '"+meterReading+"' WHERE vehicleID = '"+vehicleID+"' ";
            pst = con.prepareStatement(sql2);
            pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(vehicleService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
