public class Main {
	public static void main(String[] args) {
		int[] numbers={1,2,3};
		double total=0;
		for (int i=0; i < numbers.length;i++){
		total+=numbers[i];
		}
		System.out.println("the result is: "+ total);
	}
}