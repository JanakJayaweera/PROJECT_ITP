
package Class;

public class OrderHandlingValidation {
    
    
    public OrderHandlingValidation(){
        
    }
    
    public boolean emailValidation(String email){
        boolean result;
        char emailArray[] = email.toCharArray();
        int letter = 0, whiteSpace=0, atSign=0, test;
        
        for(char ch:emailArray){
             test = (Character.isWhitespace(ch)? whiteSpace++: (ch=='@')?atSign++ : letter++);
        }
        
        
        result = (whiteSpace==0 && atSign==1)? true: false;
        return result;
    }
    
    
    public boolean telephoneValidation(String telephone){
        boolean result;
        char telephoneArray[] = telephone.toCharArray();
        int number = 0, letter=0, test=0;
        
        for(char ch:telephoneArray){
            test = (Character.isDigit(ch))? number++ : letter++ ;
        }
        
        result = (number == 10)? true : false ;
        return result; 
    }
}
