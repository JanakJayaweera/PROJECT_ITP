package DB;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Execute_Query {

        
    Connection conn = null;
    PreparedStatement pst = null; 
    ResultSet rs = null;

    public Execute_Query() {
        conn = DBconnect.connect();
    }
    
    public void execute_query(String query)
    {
        try{
           
            pst = conn.prepareStatement(query);
            pst.execute();
        }
        catch(Exception e){
            System.out.println(" Error :execute_query method : execute_query class : "+e);
        }
        /*finally {
            try { rs.close(); } catch (Exception e) {   }
            try { pst.close(); } catch (Exception e) {   }
            try { conn.close(); } catch (Exception e) {   }
        }*/
    }  
    
    public int execute_output_query(String query, String colName)
    {
        int result = 0;
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

        while(rs.next()){
                result = Integer.parseInt(rs.getString(colName));
            }
        }
        catch(Exception e){
            System.out.println("error : execute_output_query(int) : " +e);
        }
        return result;
    }
    
    public String execute_output_query_string(String query, String colName)
    {
        String result = "";
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

        while(rs.next()){
                result = rs.getString(colName);
            }
        }
        catch(Exception e){
            System.out.println("error : execute_output_query(int) : " +e);
        }
        return result;
    }
    
    public ResultSet table_load(String query)
    {
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        }
            
            catch(SQLException e){
                System.out.println("problem with table load" +e);
            }
       return rs; 
    }
}
