// Q11. Perform following conversions of Currencies and Units by taking appropriate input statement in java program.
// •	GB to Bytes
// •	Dollar to Rupees
// •	Feet to Inches
// •	Meter to Centimeter
// •	Hours to seconds


import java.util.Scanner;
public class L1Q11{
    public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the amount in GB: ");
        double gb = scanner.nextDouble();
        double bytes = gb * 1024 * 1024 * 1024;
        System.out.println(gb + " GB = " + bytes + " Bytes");

        System.out.print("Enter the amount in Dollar: ");
        double dollar = scanner.nextDouble();
        double rupees = dollar * 277.95; 
        System.out.println(dollar + " Dollars = " + rupees + " Rupees");

        System.out.print("Enter the length in Feet: ");
        double feet = scanner.nextDouble();
        double inches = feet * 12;
        System.out.println(feet + " Feet = " + inches + " Inches");

        System.out.print("Enter the length in Meter: ");
        double meter = scanner.nextDouble();
        double centimeter = meter * 100;
        System.out.println(meter + " Meter = " + centimeter + " Centimeters");

        System.out.print("Enter the time in Hours: ");
        double hours = scanner.nextDouble();
        double seconds = hours * 3600;
        System.out.println(hours + " Hours = " + seconds + " Seconds");

        scanner.close();
	}
}