
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Delivery {
    
    String cName, product, address, dName, vnumber;
    int quantity, dtp, orderID ;
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Delivery(int porderID, String pcName, String pproduct, int pquantity, String paddress, String pdName,int pdtp, String pvnumber, int presult){
    
        con = DBconnect.connect();
        
        orderID = porderID;
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
            String sql = "INSERT INTO delivery (orderID,customer,product,quantity,address,driverName,driverTP,vehicleNumber) VALUES ('"+orderID+"','"+cName+"','"+product+"','"+quantity+"','"+address+"','"+dName+"','"+dtp+"','"+vnumber+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            //To get the newly added record's ID
            String sql2 = "SELECT deliveryID FROM delivery WHERE orderID = '"+orderID+"'";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            rs.next();
            int ndeliveryID = Integer.parseInt(rs.getString(1));
            
            JOptionPane.showMessageDialog(null, "Delivery Record Successfully added!\nDelivery ID : "+ndeliveryID);
        }
        catch(Exception e){
            System.out.println(e);
        }
       }
    }
    
    
    
}
