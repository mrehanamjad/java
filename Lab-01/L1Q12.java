// 12. Write a java program to compute the gross salary of the employee using following
// criteria:
// Gross Salary = Basic + sum of all the allowances
// note:
// Medical Allowance 20% Basic Salary
// Teaching Allowance Fixed 5000
// Conveyance Allowance 15% of Basic Salary
// Adhoc 35% of Basic Salary

import java.util.Scanner;
public class L1Q12{
    public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        double medicalAllowance = 0.20 * basicSalary;
        double teachingAllowance = 5000;
        double conveyanceAllowance = 0.15 * basicSalary;
        double adhocAllowance = 0.35 * basicSalary;

        double grossSalary = basicSalary + medicalAllowance + teachingAllowance + conveyanceAllowance + adhocAllowance;

        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
	}
}