/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.SQLException;

/**
 *
 * @author lahir
 */
public class PaidChq extends Cheques{

    /**
     *
     */
    public void addPaidChq()
    {
        try
        {
            conn = DB.DBconnect.connect();
            String sql;

            if(getRecName() != null)
            {
            sql = "INSERT INTO paidchq(Name, Amount, IsdDate, PostDate) values (?,?,?,?); ";
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, getRecName());
            pst.setDouble(2, getAmt());
            pst.setString(3, getRecDate());
            pst.setString(4, getPostDate());
            
            pst.execute();
            }
        }
        catch(SQLException e)
        {
            System.out.println("Could not insert data to the recievedchq");
            System.out.println(e);
        }       
    }
}
