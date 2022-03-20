package stringss;

public class Number extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Child Threaf");
		}
	}

}

class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number n = new Number();
		n.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
