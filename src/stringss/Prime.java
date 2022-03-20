package stringss;

import java.util.Scanner;

public class Prime {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int c = 0;
		System.out.println("Please enter the no :");
		int n = sc.nextInt();

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				c++;
			}
		}

		if (c == 0)
			System.out.println(n+" is Prime");
		else
			System.out.println(n+" Not Prime");

	}

}
