package Class;

import DB.Execute_Query;

public class ReturnStockItem {
    
    private String returnstockID;
    private String name;
    private int quantity;
    private String type;
    private String addedDate;
    private String status;
    private Execute_Query eq;
    
    public ReturnStockItem() {
        
        eq = new Execute_Query();

    }
    
    public void addItem(String Name, String Quantity,String Type, String AddedDate){
        
        String query = "INSERT INTO return_stock(ItemName, Quantity, "
                + "Type, AddedDate) VALUES('"+Name+"','"+Quantity+"','"+Type+"','"+AddedDate+"');";
        eq.execute_query(query);

    }
    
    public void updateItem(String RSID, String Name, String Quantity,String Type, String AddedDate){
        
        String query = "UPDATE return_stock SET ItemName = '"+Name+"', Quantity = '"+Quantity+"', "
                + "Type = '"+Type+"', AddedDate = '"+AddedDate+"' WHERE ReturnStkID = '"+RSID+"' ";
        eq.execute_query(query);
    }
    
    public void deleteItem(String RSID ){
        
        String query = "DELETE FROM return_stock WHERE ReturnStkID = '"+RSID+"' "; 
        eq.execute_query(query);        
    } 
 
}

