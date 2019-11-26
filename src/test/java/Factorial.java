import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();

		if (num == 0 || num == 1) {
			System.out.println("value of factorial nos " + num + " is: " + fact);
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of number " + num + " is: " + fact);
		}

	}

}
