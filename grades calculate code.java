import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter your grade for sub1: ");
	double gradeOne=sc.nextDouble();
	System.out.print("Enter your grade for sub2: ");
	double gradeTwo=sc.nextDouble();
	System.out.print("Enter your grade for sub3: ");
	double gradeThree=sc.nextDouble();
		System.out.println(calculate(gradeOne, gradeTwo, gradeThree));
	}

public static String calculate (double gradeOne, double gradeTwo, double gradeThree) {
	double ave = (gradeOne + gradeTwo + gradeThree) / 3;
	System.out.println("Average: " + ave);
	
	if (ave>= 85) {
		return ("Passed!");
	} else {
		return ("Failed");	
		}
	}
}