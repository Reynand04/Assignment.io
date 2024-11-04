import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        double bmi = calculateBMI(weight, height);
        if (bmi < 18.5){
    		System.out.println("underweight");
		}else if(bmi >= 18.5 &&  bmi < 25.0){
    		System.out.println("normal");
		}else if(bmi >= 25.0 && bmi < 30.0){
    		System.out.println( "overweight" );
		}else if(bmi >= 30.0){
    		System.out.println("obese");
		}
        
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);
        
        scanner.close();
    }
    
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
