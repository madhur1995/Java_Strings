package stringss;

public class FirstUpperCase {

	public static void main(String[] args) {
		String s = "my name is khan";
		char a[] = s.toCharArray();
		int size = a.length;

		a[0] = (char) (a[0] - 32);
		int i = 0;
		while (i != size) {
			if (a[i] == ' ') {
				a[i + 1] = (char) (a[i + 1] - 32);
			}
			i++;
		}
		System.out.println(s);
		System.out.println(a);
	}
}
