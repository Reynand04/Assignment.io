package CountVowels;
public class CountVowel {
	public static void main(String[] args) {
		String text="reyrey ";
		System.out.println("The number of vowels in " +  text + " are : " +countVowels(text));
	}
	
	public static int countVowels(String text){
		int count=0;
		for (int i = 0; i<text.length(); i++) {
			char ch=text.toLowerCase().charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			 count++;
		}
	}


	return count;
		}
}