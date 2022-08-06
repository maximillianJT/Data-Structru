
import java.io.IOException;



public class mainClass {
    

    //Global variables 
    
    public static String infix ;
    
    

    public static void main(String[] args) throws IOException {
        
        
           //Type converter 
           converter input = new converter();
        
            
            // User input
            try {
              infix = input.enterInfix2();
              
              
            } catch (Exception e) {
              System.err.println("Occured error while entering infix");
              e.printStackTrace();
            }
            
            // outputs the user input
            input.testInput();
            System.out.println(infix);
            input.pConverter(infix);
        
        //<--------------------------------------------------------------------------- Start OLD CODE--------------------------------------------------------------------------------------->
        //variables
        //final int LIMIT = 20; 
        //SingleyLinkedList<String> mylist = new SingleyLinkedList<>(); 
        //Stack<String> myStack = new Stack<String>(); 
        //String infix; 
        
        //Takes user input. uses scanner for user input (maximum 20 characters)
        //Scanner myObj = new Scanner(System.in); 
        //System.out.println("Enter infix (maximum 20 characters)");
        //String s = myObj.nextLine();
        
        // if (s.length() > LIMIT) {
        //       s = s.substring(0, LIMIT);
        //       System.out.printf("You typed in more than 20 characters", LIMIT, s);
        //    }
        // else if (s=="") {
        //     System.out.println("No user input");
             
        // }
        // else {
             
           // System.out.println("infix is " + s);
            
         //}
         //user input method from converter class   
         //split the characters and save as array
         
         
         //String[] array = s.split("");
         
        // System.out.println(array[0]+"");
        //System.out.println(array[1]+"");
        // System.out.println(array[2]+"");
         
         //Adds array in order to stack (testing input)
         
        //mylist.addFirst(array[1]);
        //mylist.addFirst(array[2]);
        //mylist.addFirst(array[3]);
        //mylist.addFirst(array[4]);
        
         
         //<--------------------------------------------------------------------------- END OLD CODE--------------------------------------------------------------------------------------->
         
    
            
    }    


    }



