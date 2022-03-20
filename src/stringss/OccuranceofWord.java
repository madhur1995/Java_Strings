package stringss;

public class OccuranceofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "my name is khan my name";
		String word = "my";

		// split the string by spaces in a
		String a[] = str.split(" ");

		// search for pattern in a
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			// if match found increase count
			if (word.equals(a[i]))
				count++;
		}
		
		String stringWithoutSpaces = str.replaceAll("\\s+", "");
		System.out.println(stringWithoutSpaces);
	

	}
}