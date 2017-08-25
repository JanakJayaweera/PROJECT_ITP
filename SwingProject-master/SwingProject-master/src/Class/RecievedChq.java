/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import DB.DBconnect;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author lahir
 */

//@Entity //telling the hibernate to treat this class as an entity

public class RecievedChq implements Serializable {
//    @Id
    private int ID;
    private String recName, recDate, postDate;
    private double amt;
    private javax.swing.JTable jTable1;
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getRecDate() {
        return recDate;
    }

    public void setRecDate(String recDate) {
        this.recDate = recDate;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public RecievedChq(String recName, String recDate, String postDate, double amt, javax.swing.JTable jTable1) {
        
        con = DBconnect.connect();
        
        
        
        this.recName = recName;
        this.recDate = recDate;
        this.postDate = postDate;
        this.amt = amt;
        this.jTable1 = jTable1;
        
        addRecChq();
    }

    public void addRecChq()
    {
        try
        {
        String q = "INSERT INTO recievedchq(recName, amt, recDate, postDate) values('"+ recName +"', '"+ amt +"', '"+ recDate +"', '"+ postDate +"')";
        pst = con.prepareStatement(q);
        pst.execute();
        
        }
        catch(SQLException e)
        {
            System.out.println("Could not insert data to the recievedchq");
        }       
    }
    

    public RecievedChq() {
       
    }
    
    
    
}
