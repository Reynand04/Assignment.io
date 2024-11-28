public class Main {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,56,89,10000};
		int max = numbers[0];
		for (int i=0; i < numbers.length;i++){
			if (numbers[i] > max){
				max=numbers[i];
			}
		}
		System.out.println("the largest number is "+ max);
	}
}