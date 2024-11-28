public class Main {
	public static void main(String[] args) {
		int[]sourceArray={2,3,1,4,5};
		int[]copyArray=new int[sourceArray.length];
		for (int i = 0; i<sourceArray.length; i++){
			copyArray[i]=sourceArray[i];
		}
		System.out.println("source array");
		for(int source:sourceArray){
			System.out.println(source);
		}
		System.out.println("copied array");
		for(int copy:copyArray){
			System.out.println(copy);
		}
	}
}