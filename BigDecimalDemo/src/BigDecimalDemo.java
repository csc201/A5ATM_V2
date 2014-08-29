import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer y;
		BigDecimal amount = new BigDecimal(1000.00);
		Scanner scan = new Scanner(System.in);
		/*
		 * x=scan.nextInt(); y=100;
		 * 
		 * System.out.println(x); System.out.println(y);
		 * System.out.println(amount.toString());
		 */
		// x=5
		// x==5 ->true
		// x==6 ->false

		int opt=0;
		do {
			System.out.println("Pick the following option(s).");
			System.out.println("1. PC Computer");
			System.out.println("2. Mac");
			System.out.println("0. EXIT");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("You pick pc");
				break;
			case 2:
				System.out.println("You pick Mac");
				break;
			default:
				System.out.println("Invalid");
			}
		} while(opt != 0);

		/*
		 * if (opt==1) { System.out.println("You pick pc"); } else if (opt==2) {
		 * System.out.println("You pick Mac"); } else {
		 * System.out.println("Invalid"); }
		 */

		// System.out.printf("%-25s %-25s %-25s %-25s %s\n", "Component",
		// "Component Type", "Price", "Test", "James");
		/*
		 * int score = 100; int grade = 80; if (score >= 90 ^ grade <= 100) {
		 * System.out.println("You earn:"); System.out.print("A"); } else if
		 * (score >= 80) System.out.print("B");
		 * 
		 * boolean test = false;
		 * 
		 * System.out.println(score>>1); System.out.println(score<<1);
		 */
	}
}
