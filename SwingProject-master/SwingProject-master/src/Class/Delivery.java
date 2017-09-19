
package Class;

import DB.DBconnect;
import GUI.Internal.Driver.doDelivery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Delivery {
    
    String cName, product, address, dName, vnumber, dStatus ;
    int quantity, dtp, orderID, driverID, vehicleID, fCost, meter, deliveryID ;
    
    double price, fConsumption, distance;
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Delivery(int porderID, String pcName, String pproduct, int pquantity, String paddress, String pdName,int pdtp, String pvnumber,int pdriverID,int pvehicleID, int presult){
    //Constructor for add delivery
        con = DBconnect.connect();
        
        orderID = porderID;
        driverID = pdriverID;
        vehicleID = pvehicleID;
        cName = pcName;
        product = pproduct;
        quantity = pquantity;
        address = paddress;
        dName = pdName;
        dtp = pdtp;
        vnumber = pvnumber;
        
        addDelivery(presult);
    }
    
    public void addDelivery(int presult){
    
        if(presult==0){
        try{
            String sql = "INSERT INTO deliveryallocation (orderID,customer,product,quantity,address,driverName,driverTP,vehicleNumber,driverID,vehicleID) VALUES ('"+orderID+"','"+cName+"','"+product+"','"+quantity+"','"+address+"','"+dName+"','"+dtp+"','"+vnumber+"','"+driverID+"','"+vehicleID+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
    //To get the newly added record's ID
            String sql2 = "SELECT deliveryID FROM deliveryAllocation WHERE orderID = '"+orderID+"' AND quantity = '"+quantity+"'";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            rs.next();
            int ndeliveryID = Integer.parseInt(rs.getString(1));
            
            JOptionPane.showMessageDialog(null, "Delivery Record Successfully added!\nDelivery ID : "+ndeliveryID);
            
           
    //Set availability of Driver & vehicle to busy
                                   
            String sql3 = "UPDATE driver SET availability = 'Busy' WHERE driverID = '"+driverID+"' ";
            pst = con.prepareStatement(sql3);
            pst.execute();
            
            String sql4 = "UPDATE vehicle SET availability = 'Busy' WHERE vehicleID = '"+vehicleID+"' ";
            pst = con.prepareStatement(sql4);
            pst.execute();
    
    //Set order status to Delivering
            
            String sql5 = "UPDATE deliverydetails SET status = 'Delivering' WHERE orderID = '"+orderID+"' ";
            pst = con.prepareStatement(sql5);
            pst.execute();
        }
        catch(Exception e){
            System.out.println(e);
        }
       }
    }
    
    public Delivery(int pdeliveryID, int porderID, int pdriverID,int pvehicleID, int presult,int pfCost, int pmeter, String pdStatus){
    //Constructor for update Delivery
    
        con = DBconnect.connect();
        
        deliveryID = pdeliveryID;
        orderID = porderID;
        driverID = pdriverID;
        vehicleID = pvehicleID;
        fCost = pfCost;
        meter = pmeter;
        dStatus = pdStatus;
        
        updateDelivery(presult);
    }
    
    public void updateDelivery(int presult){
        try{
    //Update delivery table        
        String sql1 = "UPDATE deliveryallocation SET status = '"+dStatus+"', fuelCost = '"+fCost+"' WHERE deliveryID = '"+deliveryID+"' AND orderID = '"+orderID+"' ";
        pst = con.prepareStatement(sql1);
        pst.execute();
        
    //Release driver    
        String sql2 = "UPDATE driver SET availability = 'Available' WHERE driverID = '"+driverID+"' ";
        pst = con.prepareStatement(sql2);
        pst.execute();
        
    //Release vehicle & update meter   
        String sql3 = "UPDATE vehicle SET availability = 'Available' WHERE vehicleID = '"+vehicleID+"' ";
        pst = con.prepareStatement(sql3);
        pst.execute();
        
        String sql4 = "UPDATE vehicle SET cMeterReading = '"+meter+"' WHERE vehicleID = '"+vehicleID+"' ";
        pst = con.prepareStatement(sql4);
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Delivery updation successfully completed!");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    public Delivery(double pprice, double pfConsumption, double pdistance){
    //Constructor for cal appx fuel cost in doDelivery interface
        price = pprice;
        fConsumption = pfConsumption;
        distance = pdistance;
     
    }
    
    public String calAppx(){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        String cost = numberFormat.format((distance/fConsumption)*price);
        
        return cost;
        
    }
    
    
    
}
