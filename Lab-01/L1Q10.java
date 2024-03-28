//  Q10.Write a java program to solve the following mathematics expressions.
//  •	a = 2, b = 4, c = 8 d=16
//  •	(a² + b² + c²) / 16
//  •	√(b² - 4ac)
//  •	(4 / (a - 1)) + (3.14 / (3 * a * b))


import java.lang.Math;

public class L1Q10{
    public static void main(String[] args) {
        double a = 2, b = 4, c = 8;
        System.out.println("(a² + b² + c²) / 16 = " + (((a * a) + (b * b) + (c * c)) / 16));
        System.out.println("√(b² - 4ac) = " + Math.sqrt((b * b) - (4 * a * c)));
        System.out.println("(4 / (a - 1)) + (3.14 / (3 * a * b)) = " + ((4 / (a - 1)) + (3.14 / (3 * a * b))));
    }
}
