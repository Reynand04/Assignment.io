import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	   
	   char input;
			System.out.println("Enter any character: ");
			 input = sc.next().charAt(0);
			
		if ((input >= 'A'  && input <= 'Z') || (input >= 'a'  && input <= 'z')){
	System.out.println("display " + input + " is a letter");
		}else if (input >='0' && input <='9'){
			System.out.println("display " + input + " is a number");

				}else{
			System.out.println("It is not a letter and also not a digit.");
			
			}
	}
}