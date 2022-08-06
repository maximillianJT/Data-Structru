import java.util.Scanner;
public class converter {
	
	Stack<Character> myStack = new Stack<Character>(); //Stack declared with type character from class: "stack"
	public String postfix;
	public String s;
	public String iS;
	
	 // Gets user input infix with validation
	 // Max 20 Characters and no spaces
	 // (+) & (*) & (/) are the only valid operators 
	
public String enterInfix2() throws Exception {
	
	final int LIMIT = 20;
	
	Scanner scanner = null;
	scanner = new Scanner(System.in);
	System.out.println("Please enter infix expression");
	System.out.println("Max 20 Characters");
	System.out.println("Leave no spaces");
	String input = scanner.next(); // Read user input
	
	     if (input.length() > LIMIT) {
		       input = input.substring(0, LIMIT);
		      
		       System.out.printf("You typed in more than 20 characters", LIMIT, input);
		      
		    }
		 
		 else if (isInvalid(input)==false){
		   
		    System.out.println("infix is invalid");
		    System.out.println("Must contain: Valid operators  ");
		    System.out.println("Input Must have no spaces");
		    
		 }
	
		 else {
			 
			System.out.println("Vaild input. Infix = " + input );
			s = input;
			System.out.println("global String S = "+ s);
			scanner.close();
			
		 }
	
	return s;
	
	
	
}

//Method to check if input values are false
public boolean isInvalid(String s1) {
	
	
	if  (s1.matches(".*[a-z].*") && (s1.contains("+")) | (s1.contains("/")) | (s1.contains("*"))) {
		return true;
	
	}else  if   (s1.contains("")) {
		return false;
	}else {
		return false;
	}
}


//shows/tests user input 
public void testInput() {
	
	System.out.println("this is the input = " + s);
	
}

//Gets input to use in conversion method.
public String getInput() {
	System.out.println("The return from the get method was :" + s);
	return s;
}

//Converts infix to postfix
public void pConverter (String iString) {
	s = iString ;
	String outputString = "";
	//char outChar = 0;
	
	boolean fI = false;
	for(int i = 0;i < s.length();i++) {
		char curChar = s.charAt(i);
		if(!isOperator(curChar)) { //checks if an operator is present
			outputString += Character.toString(curChar); //Gets first letter
			// outChar = outputString.charAt(0); //converts String to char 
			
			if (i == s.length()-1){ //
				while (!myStack.isEmpty()) { //if the stack is empty. Output what is in the stack
					outputString += myStack.pop(); 
				}
			}
		}else {
			if(fI) { // The Current value matches whats at the the of the stack then the char is added to the string 
				if(pMin(curChar) && pMin((Character)myStack.top())) {                
					outputString += myStack.pop();
					myStack.push(curChar);
					if(i == (s.length()-1)) {
						while(!myStack.isEmpty()) {
							outputString += myStack.pop();
						}
					}
					
				}else if (mDiv(curChar) && mDiv((Character)myStack.top()))
                  outputString += myStack.pop();
                   myStack.push(curChar);
                     if(i == (s.length()-1)) {
	                    while(!myStack.isEmpty()) {
		                outputString += myStack.pop();
	                     }
				
				
			        }
                     
		        }else if (mDiv(curChar) && pMin((Character)myStack.top()))
                 outputString += myStack.pop();
                 myStack.push(curChar);
                 if(i == (s.length()-1)) {
                 while(!myStack.isEmpty()) {
                 outputString += myStack.pop();
                      }
	
                   }
		
				
		         
                 else {
              	   outputString += Character.toString(curChar);
              	   if(i == (s.length()-1)) {
                         while(!myStack.isEmpty()) {
                         outputString += myStack.pop();
                 }
              	   
			}
              	   else {
              		   myStack.push(curChar);
              		   fI = true;
              		  //System output of Postfix along with the use of delimiter 
              		   System.out.println("This is the postfix value ");
              		   System.out.println( outputString);
              		   Scanner scan = new Scanner(outputString);
              		   scan.useDelimiter("(" + ")");
              		   System.out.println("the Delimiter used is " + scan.delimiter());
              		 while(scan.hasNext()){
             			System.out.println(scan.next());
             		}
             		// closing the scanner stream
             		scan.close();

              		   
              		   
              	   }
                 }		
			
		}
    }
	}
 
					
			
		
	     //Checks if Operator is present 
public boolean isOperator(char op ) {
	switch(op) {
	case '+':
	       return true;	
	case '/':
	       return true;
	case '*':
	       return true;
	case ')':
		   return true;
	case '(':
		   return true;
	     default:
	     return false;
	}
}

       //Checks if these characters are present
public boolean pMin(char op) {
	switch(op) {
	case '+':
	       return true;
	case '-':
	       return true;
	     default:
	     return false;
	
	}
	
}
        //Checks if these are present
public boolean mDiv(char op) {
	switch(op) {
	case '*':
	       return true;
	case '/':
	       return true;
	     default:
	     return false;

}
}
}



//<--------------------------------------------------------------------------- START OLD CODE--------------------------------------------------------------------------------------->
//user input
//public void userInput() {
	
	//final int LIMIT = 20;
	//Scanner myObj = new Scanner(System.in); 
	//System.out.println("Enter infix (maximum 20 characters)");
	//String s1 = myObj.nextLine();
	
	//s1 = s;
	// if (s1.length() > LIMIT) {
	//       s1 = s1.substring(0, LIMIT);
	//       System.out.printf("You typed in more than 20 characters", LIMIT, s1);
	//    }
	// else if (s1=="") {
	//	 System.out.println("No user input");
		 
	// }
	// else {
	     
	 //   System.out.println("infix is " + s1);
	// }
    //}


	
	//Gets user input (infix)
//public String enterInfix() throws Exception {
      // Scanner scanner = null;
     //  try {
       //  scanner = new Scanner(System.in);
       //  System.out.print("Please enter inxfix ");
        // String input = scanner.next(); // Read user input
        // System.out.print("infix = " + input);
       //  s = input;
        // return input;
      //  }catch (Exception e) {
       //  throw e;
       // }finally {
       //  if (scanner != null) {
        //    scanner.close();
     //    }
     //   }
//}
	
	
	

//<--------------------------------------------------------------------------- END OLD CODE--------------------------------------------------------------------------------------->
	
	








