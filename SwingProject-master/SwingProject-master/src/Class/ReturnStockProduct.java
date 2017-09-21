package Class;

import DB.Execute_Query;

public class ReturnStockProduct extends ReturnStockItem {

    private Execute_Query eq;
    public int fixableItems;
    public int defectlessItems;
    public int nonFixableItems;
    
    public ReturnStockProduct() {
        eq = new Execute_Query();
    }


    public void addItem(String rsID, String orderID){
        
        String query = "INSERT INTO products(ReturnStkID,OrderID) VALUES('"+rsID+"','"+orderID+"');";
        eq.execute_query(query);

    }
    
    public void updateItem(String RSID, String orderID){
        
        String query = "UPDATE products SET OrderID = '"+orderID+"' WHERE ReturnStkID = '"+RSID+"'; ";
        eq.execute_query(query);
    }   
    
    /*public void deleteItem(String RSID ){
        
        String query = "DELETE FROM return_stock WHERE ReturnStkID = '"+RSID+"' "; 
        eq.execute_query(query);        
    }    
*/    
    public String getOrderID(String RSID, String ColName)
    {
        String ID = "";
        String query = "SELECT OrderID FROM products WHERE ReturnStkID = '"+RSID+"'; ";
        ID = ID + eq.execute_output_query(query, ColName);
        return ID;
    }
    
    //fuction defect_estimation
    
    public void defect_chk_tbl(String rsID, int quantity){
        
        String tableName = "defect_estimation" + rsID ;
        String query1 = "CREATE TABLE " + tableName + "(ReturnStkID CHAR(4), ItemID CHAR(4), Method1 CHAR(4),"
                + "Method2 CHAR(4), Method3 CHAR(4), Method4 CHAR(4), Method5 CHAR(4), Method6 CHAR(4),"
                + "Method7 CHAR(4),Method8 CHAR(4), Result INT(1), PRIMARY KEY(ReturnStkID, ItemID)) ENGINE = InnoDB;";
        eq.execute_query(query1);
        System.out.println(query1);
        for(int i = 1; i <= quantity; i++)
        {
            String query2 = "INSERT INTO " + tableName + " (ReturnStkID, ItemID) VALUES('"+rsID+"', '"+i+"'); ";
            eq.execute_query(query2);
        }
    }  
    
    public void defect_chk_tbl_del(String rsID)
    {
        
        String tableName = "defect_estimation" + rsID ;
        String query = "DELETE TABLE defect_estimation" + tableName + ";" ;
        eq.execute_query(query);
    }
    
    public String tbl_name (String rsID)
    {
        return "defect_estimation" + rsID ;
    }
    
    public void defect_estimation(String rsID)
    {

        String tableName = "defect_estimation" + rsID ;
        String query1 = "SELECT COUNT(RESULT) FROM " + tableName + " WHERE Result = 1";
        String query2 = "SELECT COUNT(RESULT) FROM " + tableName + " WHERE Result = 2";
        String query3 = "SELECT COUNT(RESULT) FROM " + tableName + " WHERE Result = 3";
        
        fixableItems = eq.execute_output_query(query1, "COUNT(RESULT)");
        defectlessItems = eq.execute_output_query(query2, "COUNT(RESULT)");
        nonFixableItems = eq.execute_output_query(query3, "COUNT(RESULT)");
    }
}


