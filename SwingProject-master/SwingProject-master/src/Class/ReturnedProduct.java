package Class;

import DB.Execute_Query;

public class ReturnedProduct extends ReturnStockProduct {

    private Execute_Query eq;
    private String ReturnedDate;
        
    public ReturnedProduct() {
        eq = new Execute_Query();            
    }
 
public void send_to_fix()
{
    
}

public void send_to_reproduction()
{
    
}

public void send_to_finished()
{
    
}

public double calculate_fixing_cost(String Date)  
{
    double fixingCost = 0;
    return fixingCost;
}
    
    
    
    
    
 
    
}
