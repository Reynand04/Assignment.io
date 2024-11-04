import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String firstname=sc.nextLine();
		String lastname=sc.nextLine();
		
			System.out.println(Name(firstname,lastname));
			
		
	}
	public static String Name(String firstname, String lastname){
		return "my name is "+ firstname +" "+lastname;
		
	}
}