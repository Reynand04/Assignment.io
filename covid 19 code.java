import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Q1, Q2, Q3, review;
		
		do {
		   System.out.print("Do you have a fever?(yes/no)");
		   Q1 = sc.next();
		   System.out.print("Do you have cough?(yes/no)");
	 	  Q2 = sc.next();
		   System.out.print("Do you have difficulty in breathing?(yes/no) ");
		   Q3 = sc.next();
		    
		    if (Q1.equalsIgnoreCase("Yes") || Q2.equalsIgnoreCase("Yes") || Q3.equalsIgnoreCase("Yes")) {
		    System.out.println("You may have COVID-19 symptoms. Please consult on a healtcare professional.");
		        
	}else {
		        System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");
		    }
		    
		        System.out.println("Do you want to check symptoms again (yes/no)");
		    review = sc.next();
		    
		   
		} while (review.equalsIgnoreCase("yes"));
		    

	}
}