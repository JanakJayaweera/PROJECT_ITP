

package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Vehicle {
    
        private javax.swing.JTable Table1;
        private String vname,vtype,vnumber,fuelConsumption,meterReading,serviceDistance;
        private int vid;
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
 
    public Vehicle(String pvname,String pvtype,String pvnumber,String pfuelConsumption, String pmeterReading,String pserviceDistance, javax.swing.JTable pTable1)
    {
        con = DBconnect.connect();
        
        vname = pvname;
        vtype = pvtype;
        vnumber = pvnumber;
        fuelConsumption = pfuelConsumption;
        meterReading = pmeterReading;
        serviceDistance = pserviceDistance;
        Table1 = pTable1;
        
        addVehicle();
    }  

    public void addVehicle(){
        try 
            {
                String sql = "INSERT INTO vehicle (name,type,number,serviceKM,fuelConsumption,cMeterReading) VALUES ('"+ vname +"','"+ vtype +"','"+ vnumber +"','"+ fuelConsumption +"','"+ meterReading +"','"+ serviceDistance +"')";
                pst = con.prepareStatement(sql);
                pst.execute();
                
            } 
        
            catch (SQLException e) {
                System.out.println(e);
            }
    
    }
    
    public Vehicle(String pvname, String pvtype, String pvnumber, String pfuelConsumption, String pmeterReading, String pServiceDistance, int pvid, int presult) {
            
             con = DBconnect.connect();
             
             vid = pvid;
             vname = pvname;
             vtype = pvtype;
             vnumber = pvnumber;
             fuelConsumption = pfuelConsumption;
             meterReading = pmeterReading;
             serviceDistance = pServiceDistance;
             
             updateVehicle(presult);
    }
    
    public void updateVehicle(int presult){
        
        if(presult==0){
                try {
                String sql = "UPDATE vehicle SET name = '"+vname+"', type = '"+vtype+"', number = '"+vnumber+"', serviceKM = '"+serviceDistance+"', fuelConsumption = '"+fuelConsumption+"', cMeterReading = '"+meterReading+"' where vehicleID = '"+vid+"' " ;
                pst = con.prepareStatement(sql);
                pst.execute();
                
            } catch (Exception e) {
                System.out.println(e);
            }
            }
    
    }
    
    public Vehicle(int pvid, String pvname, String pvnumber)
        {
        //Constructor for remove vehicle part
            
            con = DBconnect.connect();
            
            vid = pvid;
            vname = pvname;
            vnumber = pvnumber;
            removeDriver(pvid);
        }
    
    public void removeDriver(int pvid){
        
            try 
            {
                String sql = "UPDATE vehicle SET status = 0 WHERE vehicleID = '"+pvid+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
                
        }
        
        
}

