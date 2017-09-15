/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author lahir
 */
public class Cheques {
    private int ID;
    private String recName = null, recDate, postDate;
    private double amt;

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Cheques() {
    }

    public Cheques(String recName, String recDate, String postDate, double amt) {
        this.recName = recName;
        this.recDate = recDate;
        this.postDate = postDate;
        this.amt = amt;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
       if(recName.isEmpty()) 
       {
           JOptionPane.showMessageDialog(null, "Please enter reciever's name");
       } 
       else
       {
            this.recName = recName;
       }
    }

    public String getRecDate() {
        return recDate;
    }

    public void setRecDate(String recDate) {
        if(recDate.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter recieved date");
        }
        else
        {
            this.recDate = recDate;
        }
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
    
    
}
