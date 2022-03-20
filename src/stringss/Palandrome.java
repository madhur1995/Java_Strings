package stringss;

public class Palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r, sum = 0, temp;
		int n = 4547;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
		
		int a=12;
		int b=5;
		int c=a+(~b+1);
		System.out.println(c);

	}

}
