
package Class;


public class deliveryValidation {
    
    boolean result;
    
    public deliveryValidation(){
    
    }
    
    public boolean emailValidation(String email){
    
        char emailArray[] = email.toCharArray();
        int letter = 0, whiteSpace=0, atSign=0, test;
        
        for(char ch:emailArray){
            
             test = (Character.isWhitespace(ch)? whiteSpace++: (ch=='@')?atSign++ : letter++);
        }
    result = ((whiteSpace==0 && atSign==1)? true: false);
    return result;
    }
    
    public boolean nicValidation(String nic){
    
        char nicArray[] = nic.toCharArray();
        int letter = 0, whiteSpace = 0, number =0, test =0;
        
        for(char ch:nicArray){
        
            test = (Character.isWhitespace(ch)? whiteSpace++: (Character.isLetter(ch))? letter++ : number++);
        }
        
        if((number == 9 || number==14)&& nic.endsWith("v") && letter==1 ){
                    
            result = true;
        }
        else{
            result = false;
        }
    return result;    
    }
    
    public boolean tpValidation(String tp){
    
        char tpArray[] = tp.toCharArray();
        int number = 0, whiteSpace =0, letter=0,test=0;
        
        for(char ch:tpArray){
            test = (Character.isWhitespace(ch)? whiteSpace++ : (Character.isDigit(ch))? number++ :letter++ );
        }
        
        if(whiteSpace==0 && number ==10){
            result = true;
        }
        else{
            result = false;
        }
    return result;    
    
    }
    
}
