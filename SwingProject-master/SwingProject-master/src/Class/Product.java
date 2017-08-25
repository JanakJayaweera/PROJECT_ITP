/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import DB.DBconnect;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JTable;


/**
 *
 * @author PASAN
 */
public class Product 
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rt = null;
    
    private javax.swing.JTable CreateProdutT;
    private String PID,Pname,TypeofP,SizeofP,Color,Ftype,Fquantity,Btype,Bquantity,Wtype,Wquantity,Etype,Equantity,NumberofP;

    public String getNumberofP() {
        return NumberofP;
    }

    public void setNumberofP(String NumberofP) {
        this.NumberofP = NumberofP;
    }


    public JTable getCreateProdutT() {
        return CreateProdutT;
    }

    public void setCreateProdutT(JTable CreateProdutT) {
        this.CreateProdutT = CreateProdutT;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getTypeofP() {
        return TypeofP;
    }

    public void setTypeofP(String TypeofP) {
        this.TypeofP = TypeofP;
    }

    public String getSizeofP() {
        return SizeofP;
    }

    public void setSizeofP(String SizeofP) {
        this.SizeofP = SizeofP;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getFtype() {
        return Ftype;
    }

    public void setFtype(String Ftype) {
        this.Ftype = Ftype;
    }

    public String getFquantity() {
        return Fquantity;
    }

    public void setFquantity(String Fquantity) {
        this.Fquantity = Fquantity;
    }

    public String getBtype() {
        return Btype;
    }

    public void setBtype(String Btype) {
        this.Btype = Btype;
    }

    public String getBquantity() {
        return Bquantity;
    }

    public void setBquantity(String Bquantity) {
        this.Bquantity = Bquantity;
    }

    public String getWtype() {
        return Wtype;
    }

    public void setWtype(String Wtype) {
        this.Wtype = Wtype;
    }

    public String getWquantity() {
        return Wquantity;
    }

    public void setWquantity(String Wquantity) {
        this.Wquantity = Wquantity;
    }

    public String getEtype() {
        return Etype;
    }

    public void setEtype(String Etype) {
        this.Etype = Etype;
    }

    public String getEquantity() {
        return Equantity;
    }

    public void setEquantity(String Equantity) {
        this.Equantity = Equantity;
    }

    public Product()
    {
      //con = DBconnect.connect();
    }


    
    
    public void createnewProduct()
    {
        con = DBconnect.connect();
        try 
        {
            String s  = "INSERT INTO createproduct(PID,Pname,PType,SizeofP,NumberofP,Color,Ftype,FQuantity,BType,BQuantity,WType,WQuantity,Elastic,EQuantity) values ('"+PID+"','"+Pname+"','"+TypeofP+"','"+SizeofP+"','"+NumberofP+"','"+Color+"','"+Ftype+"','"+Fquantity+"','"+Btype+"','"+Bquantity+"','"+Wtype+"','"+Wquantity+"','"+Etype+"','"+Equantity+"')";
            ps = con.prepareStatement(s);
            ps.execute();
                  
        } 
        catch (Exception e) 
        {
            System.out.println(e+"this is method");
        }
    }
    
}
