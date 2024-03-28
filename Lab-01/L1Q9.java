// 9. Write a program in java that ask user to enter remainder and quotient as an
// integers and find the divisor

import java.util.Scanner;
public class L1Q9{
    public static void main(String ar[]) {
		Scanner input_scanner= new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		int D =input_scanner.nextInt();
		System.out.println("Enter Quotient: ");
		int Q=input_scanner.nextInt();
		System.out.println("Enter Remainder: ");
		int R=input_scanner.nextInt();
		int divisor=(D-R)/Q;
		System.out.println("Divisor = " + divisor);
		input_scanner.close();
	}
}