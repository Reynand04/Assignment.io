       
       import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String username = "Rich";
		int password = 1234;
		
		System.out.println ("Enter username: ");
		String typeUsername = scan.nextLine();
		
		if (typeUsername.equals(username)) {
        System.out.println ("Enter password: ");
        int typePassword = scan.nextInt();
     
     switch(typePassword){
        case 1234:
        
        System.out.println ("WELCOME TO MATH CALCULATOR");
        System.out.println ("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println ("enter the expressions (-,+,*,/):");
        String operator = scan.next();
        System.out.println ("enter the second number");
        int num2 = scan.nextInt();
        
        int result = 8;
        
        switch (operator) {
        	case "-":
        	         result=num1 - num2;
        	         break;
        	  
        	case "+":
        	         result=num1 + num2;
        	         break;
        	         
            case "*":
                     result=num1 * num2;
                     break;
                     
             case "/":
                              if (num2 !=0){
                      result = num1 / num2;
                      
        }else{
        	System.out.println ("Error: Division by 0 !");
        	return;
        }
        break;
        
        default:
        System.out.println ("result:" + result);
        return;
        
        }
        System.out.println ("Result:" + result);
       
        break;
		
         default:
		System.out.println ("wrong password");
		
		}

		}else{
			     System.out.println ("user name not found");
		
		
		
		
	      }
	}
}