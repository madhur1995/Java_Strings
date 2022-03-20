package stringss;

public class newString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is khan";
		char a[] = s.toCharArray();
		int size = s.length();
		String s1 = "";

		int i = 0;
		while (i != size) {
			if (a[i] != ' ') {
				s1 += a[i];
			}
		}

		while (i != size) {
			System.out.println(s1);
		}

		System.out.println("shshshsh");

	}

}
