

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
//add Vehicle constructor        
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
                String sql = "INSERT INTO vehicle (name,type,number,serviceKM,fuelConsumption,cMeterReading) VALUES ('"+ vname +"','"+ vtype +"','"+ vnumber +"','"+ serviceDistance +"','"+ fuelConsumption +"','"+ meterReading +"')";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                String sql1 = "SELECT vehicleID FROM vehicle WHERE number = '"+vnumber+"' ";
                pst = con.prepareStatement(sql1);
                ResultSet rs = pst.executeQuery();
                rs.next();
                int vehicleID = Integer.parseInt(rs.getString(1));
                String n = "NEW";
                
                String sql2 = "INSERT INTO servicedetails (vehicleID,meterReading,serviceCost,serviceDate) VALUES ('"+vehicleID+"','"+meterReading+"','"+0+"','"+n+"')";
                pst = con.prepareStatement(sql2);
                pst.execute();
            } 
        
            catch (SQLException e) {
                System.out.println(e);
            }
    
    }
    
    public Vehicle(String pvname, String pvtype, String pvnumber, String pfuelConsumption, String pmeterReading, String pServiceDistance, int pvid, int presult) {
//update vehicle constructor            
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
            removeVehicle(pvid);
        }
    
    public void removeVehicle(int pvid){
        
            try 
            {
                String sql = "UPDATE vehicle SET status = 0, availability = 0 WHERE vehicleID = '"+pvid+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
                
        }
    public Vehicle(int pvehicleID){
//Constructor to get current meter read of a vehicle        
        con = DBconnect.connect();
        
        vid = pvehicleID;
        getMeterRead();
    }
    
    public int getMeterRead(){
        try{
            String sql = "SELECT cMeterReading FROM vehicle WHERE vehicleID = '"+vid+"' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            int meterRead = Integer.parseInt(rs.getString(1));
            
            return meterRead;
        }
        catch(Exception e){
            System.out.println(e);
            return -999;
        }
    }
        
        
}

