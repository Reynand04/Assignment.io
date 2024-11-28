import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] numbers = {1,2,3,4,5};
		System.out.println("original list of numbers");
		for (int num:numbers){
			System.out.println(num+":");
		}
		System.out.println("updated list of numbers ");
		for (int i=0; i<numbers.length; i++){
			numbers[i]=sc.nextInt();
		}
		for (int num:numbers){
			System.out.println(num+":");
		}
	}
}