package stringss;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "My name is khan", s1 = "";
		char ch;
		int count = 0;
		System.out.print("Original word: ");
		// System.out.println("Geeks"); // Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			s1 = ch + s1; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + s1);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
