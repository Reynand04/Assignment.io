public class BMI {
	public static void main(String[] args) {

		double weight = 44;
		double height = 1.52;
		double BMI = weight / (height*height);
		System.out.println("BMI result= " + BMI);

		if (BMI<18.5){
			System.out.println("Underweight");
	
	}else if (BMI >= 18.5 && BMI<25.0){
			System.out.println("Normal");
	
	}else if (BMI >= 25.0 && BMI<30.0){
				System.out.println("Overweight");	

	}else if (BMI >= 30.0){
			System.out.println("Obese");
		}		
	}
}