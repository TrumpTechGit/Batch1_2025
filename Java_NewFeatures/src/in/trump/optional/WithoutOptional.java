package in.trump.optional;

public class WithoutOptional {

	public static void main(String[] args) {
		String[] words = new String[10];
		String word = words[5].toLowerCase();
		System.out.println(word);

	}

}
