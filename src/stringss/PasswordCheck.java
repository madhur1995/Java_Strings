package stringss;

public class PasswordCheck {

	public static void main(String[] args) {

		String s = "Hel8@";
		int n = s.length();

		boolean pass = passwordCheck(s, n);
		if (pass)
			System.out.println("Strong Password");
		else
			System.out.println("Week Password");

	}

	private static boolean passwordCheck(String s, int n) {
		int i = 0;
		int small = 0;
		int capital = 0;
		int no = 0;
		int spe = 0;
		int len = 0;
		while (i != n) {
			if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
				small++;
			} else if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
				capital++;
			} else if (s.charAt(i) > '1' && s.charAt(i) < '9') {
				no++;
			}
			// !@#$%^&*()-+
			else if (s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '$' || s.charAt(i) == '%'
					|| s.charAt(i) == '^' || s.charAt(i) == '&' || s.charAt(i) == '*' || s.charAt(i) == '('
					|| s.charAt(i) == ')' || s.charAt(i) == '-' || s.charAt(i) == '+') {
				spe++;

			} else if (s.length() >= 8) {
				len++;
			}
			i++;

		}

		if (small >= 1 && capital >= 1 && no >= 1 && len >= 1 && spe >= 1)
			return true;
		else
			return false;
	}

}
