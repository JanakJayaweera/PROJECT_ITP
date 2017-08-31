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
import java.sql.SQLException;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author PASAN
 */
public class Production 
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rt = null;
    
    private javax.swing.JTable ProductionTable;
    private String Date,Ftype,Btype,Wtype,Etype;
    private double FQuantity,BQuantity,WQuantity,EQuantity;
    private Integer PID,Cutters,MachineOperators,PatternMakers,Ironer;
    
    public JTable getProductionTable() {
        return ProductionTable;
    }

    public void setProductionTable(JTable ProductionTable) {
        this.ProductionTable = ProductionTable;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getFtype() {
        return Ftype;
    }

    public void setFtype(String Ftype) {
        this.Ftype = Ftype;
    }

    public double getFQuantity() {
        return FQuantity;
    }

    public void setFQuantity(double FQuantity) {
        this.FQuantity = FQuantity;
    }

    public String getBtype() {
        return Btype;
    }

    public void setBtype(String Btype) {
        this.Btype = Btype;
    }

    public double getBQuantity() {
        return BQuantity;
    }

    public void setBQuantity(double BQuantity) {
        this.BQuantity = BQuantity;
    }

    public String getWtype() {
        return Wtype;
    }

    public void setWtype(String Wtype) {
        this.Wtype = Wtype;
    }

    public double getWQuantity() {
        return WQuantity;
    }

    public void setWQuantity(double WQuantity) {
        this.WQuantity = WQuantity;
    }

    public String getEtype() {
        return Etype;
    }

    public void setEtype(String Etype) {
        this.Etype = Etype;
    }

    public double getEQuantity() {
        return EQuantity;
    }

    public void setEQuantity(double EQuantity) {
        this.EQuantity = EQuantity;
    }

    public int getCutters() {
        return Cutters;
    }

    public void setCutters(int Cutters) {
        this.Cutters = Cutters;
    }

    public int getMachineOperators() {
        return MachineOperators;
    }

    public void setMachineOperators(int MachineOperators) {
        this.MachineOperators = MachineOperators;
    }

    public int getPatternMakers() {
        return PatternMakers;
    }

    public void setPatternMakers(int PatternMakers) {
        this.PatternMakers = PatternMakers;
    }

    public int getIroner() {
        return Ironer;
    }

    public void setIroner(int Ironer) {
        this.Ironer = Ironer;
    }

    
    
    public void createnewProduction()
    {
        con = DBconnect.connect();
        try 
        {
            String s  = "INSERT INTO dbproduction(Date,FType,Fquantity,Btype,Bquantity,Wtype,Wquantity,Etype,Equantity,Cutters,MachineOperators,PatternMakers,Ironer) values ('"+Date+"',"+Ftype+"','"+FQuantity+"','"+Btype+"','"+BQuantity+"','"+Wtype+"','"+WQuantity+"','"+Etype+"','"+EQuantity+"','"+Cutters+"','"+MachineOperators+"','"+PatternMakers+"','"+Ironer+"')";
            ps = con.prepareStatement(s);
            ps.execute();
                  
        } 
        catch (Exception e) 
        {
            System.out.println(e+"this is production method");
        }
    }
    
    public void CreateProTableLoad()
        {           
            con = DBconnect.connect();
            try
            { 
                String sql = "SELECT PID,Pname,PType,SizeofP,NumberofP,Color,Ftype,FQuantity,BType,BQuantity,WType,WQuantity,Elastic,EQuantity FROM createproduct";
                ps = con.prepareStatement(sql);
                rt = ps.executeQuery();
                ProductionTable.setModel(DbUtils.resultSetToTableModel(rt));
            }
            
            catch(SQLException e)
            {
                System.out.println("Could not load from production");
            }
        }   
    
}
