// 5. Write a java program to compute the area and circumference of a rectangle 3
// inches wide by 5 inches long. What changes must be made to the program, so it
// works for a rectangle 6.8 inches wide by 2.3 inches long?
// Note: formula is sum of all sides

public class L1Q5{
    public static void main(String ar[]) {
        int width1 = 3; 
        int length1 = 5; 
        int area1 = width1 * length1;
        int circumference1 = 2 * (width1 + length1);
        System.out.println("For the rectangle 3 inches wide by 5 inches long:");
        System.out.println("Area: " + area1);
        System.out.println("Circumference: " + circumference1 + "\n");

        double width2 = 6.8; 
        double length2 = 2.3;
        double area2 = width2 * length2;
        double circumference2 = 2 * (width2 + length2);
        System.out.println("For the rectangle 6.8 inches wide by 2.3 inches long:");
        System.out.println("Area: " + area2);
        System.out.println("Circumference: " + circumference2);

	}
}