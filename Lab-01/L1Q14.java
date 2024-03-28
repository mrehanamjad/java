// Q14. write a java program that contain a 2 digit variable. The program should exchange unit place of the variables. i.e int n = 73 output: 37

import java.util.Scanner;
public class L1Q14{
    public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 2 digit number: ");
		int d = scanner.nextInt();
		System.out.println("Exchanged digit: " + (((d%10)*10)+(d/10)));
        scanner.close();
	}
}