// Q13. Write a java program that contain a 4 digit variable the program should separate 4 digits of a number according to their indices and print them individually.

import java.util.Scanner;
public class L1Q13{
    public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 4 digit number: ");
		int d = scanner.nextInt();
		int d4 = d%10;
		d = d/10;
		int d3 = d%10;
		d = d/10;
		int d2 = d%10;
		d = d/10;
		int d1 = d;
		System.out.println("Digit 1: " + d1);
		System.out.println("Digit 2: " + d2);
		System.out.println("Digit 3: " + d3);
		System.out.println("Digit 4: " + d4);

        scanner.close();
	}
}