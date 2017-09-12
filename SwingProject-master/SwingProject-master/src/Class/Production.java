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
    
     private javax.swing.JTable productionTable, orderTable;

    private String date,fType,bType,wType,eTtype,status;
    private double fQuantity,bQuantity,wQuantity,eQuantity;
    private Integer pID,cutters,machineOperators,supervisor,ironer,helper;
    
    public JTable getProductionTable() {
        return productionTable;
    }

    public void setProductionTable(JTable ProductionTable) {
        this.productionTable = ProductionTable;
    }
    
    public JTable getOrderTable() {
        return orderTable;
    }

    public void setOrderTable(JTable OrderTable) {
        this.orderTable = OrderTable;
    }

    public int getPID() {
        return pID;
    }

    public void setPID(int PID) {
        this.pID = PID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public String getFtype() {
        return fType;
    }

    public void setFtype(String Ftype) {
        this.fType = Ftype;
    }

    public double getFQuantity() {
        return fQuantity;
    }

    public void setFQuantity(double FQuantity) {
        this.fQuantity = FQuantity;
    }

    public String getBtype() {
        return bType;
    }

    public void setBtype(String Btype) {
        this.bType = Btype;
    }

    public double getBQuantity() {
        return bQuantity;
    }

    public void setBQuantity(double BQuantity) {
        this.bQuantity = BQuantity;
    }

    public String getWtype() {
        return wType;
    }

    public void setWtype(String Wtype) {
        this.wType = Wtype;
    }

    public double getWQuantity() {
        return wQuantity;
    }

    public void setWQuantity(double WQuantity) {
        this.wQuantity = WQuantity;
    }

    public String getEtype() {
        return eTtype;
    }

    public void setEtype(String Etype) {
        this.eTtype = Etype;
    }

    public double getEQuantity() {
        return eQuantity;
    }

    public void setEQuantity(double EQuantity) {
        this.eQuantity = EQuantity;
    }

    public int getCutters() {
        return cutters;
    }

    public void setCutters(int Cutters) {
        this.cutters = Cutters;
    }

    public int getMachineOperators() {
        return machineOperators;
    }

    public void setMachineOperators(int MachineOperators) {
        this.machineOperators = MachineOperators;
    }

    public int getIroner() {
        return ironer;
    }

    public Integer getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Integer supervisor) {
        this.supervisor = supervisor;
    }

    public Integer getHelper() {
        return helper;
    }

    public void setHelper(Integer helper) {
        this.helper = helper;
    }
    

    public void setIroner(int Ironer) {
        this.ironer = Ironer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Production() {
    }
    

    public void createnewProduction()//add new production details to DB
    {
        con = DBconnect.connect();
        try 
        {
            String s  = "INSERT INTO dbproduction(Date, FType, Fquantity, BType, Bquantity, WType, Wquantity, EType, Equantity, Cutters, MachineOperator, Supervisor, Ironer, Helper, Status) values ('"+ getDate() +"','"+ getFtype() +"','"+ getFQuantity() +"','"+ getBtype() +"','"+ getBQuantity() +"','"+ getWtype() +"','"+ getWQuantity() +"','"+ getEtype() +"','"+ getEQuantity() +"','"+ getCutters() +"','"+ getMachineOperators() +"','"+ getSupervisor() +"','"+ getIroner() +"','"+ getHelper() +"','"+ getStatus() +"');";
            ps = con.prepareStatement(s);
            ps.execute();
                  
        } 
        catch (Exception e) 
        {
            System.out.println("this is production method");
            System.out.println(e);
        }
    }
    
    public void productionTableload()//load data into production table from DB
        {           
            try
            { 
                con = DBconnect.connect();
                
                String sql = "SELECT PID,Date,FType,Fquantity,BType,Bquantity,WType,Wquantity,EType,Equantity,Cutters,MachineOperator,Supervisor,Ironer,Helper,Status FROM dbproduction";
                ps = con.prepareStatement(sql);
                rt = ps.executeQuery();
                productionTable.setModel(DbUtils.resultSetToTableModel(rt));
            }
            
            catch(SQLException e)
            {
                System.out.println();
                System.out.println("Could not load from production");
            }
        }  
    
     public void orderTableload()//load data into ordertable from db
        {           
            try
            { 
                con = DBconnect.connect();
                String sql = "SELECT orderID,ordername,otype,size,numberofp,color FROM ordertable";
                ps = con.prepareStatement(sql);
                rt = ps.executeQuery();
                orderTable.setModel(DbUtils.resultSetToTableModel(rt));
            }
            
            catch(SQLException e)
            {
                System.out.println(e);
                System.out.println("Could not load from ordertable");
            }
        }
    
}
