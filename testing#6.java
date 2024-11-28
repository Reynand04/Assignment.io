import java.util.Array;

public class Main {
	public static void main(String[] args) {
		int[]sourceArray={2,3,1,4,5};
		int[]copyArray=Array.copyOf(sourceArray, sourceArray.length);
		for (int copy:copyArray){
			System.out.println(copy);
		}
	}
}