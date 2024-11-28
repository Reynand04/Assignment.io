public class Main {
	public static void main(String[] args) {
		int [] numbers=new int[10];
		for (int i=0;i<numbers.length;i++){
			numbers[i]=(int)(Math.random()*10);
		}
		for (int random:numbers){
		System.out.println(random);
		}
	}
}