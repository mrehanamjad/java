// 4. Write a java program to declare variable n1 and n2 find addition, subtraction,
// multiplication, division and modulus of the numbers.
public class L1Q4{
    public static void main(String ar[]) {
		int n1 = 20;
        int n2 = 5;

        int sum = n1 + n2;
        System.out.println("Addition: " + sum);

        int difference = n1 - n2;
        System.out.println("Subtraction: " + difference);

        int product = n1 * n2;
        System.out.println("Multiplication: " + product);
		
		int div = n1 / n2;
		System.out.println("Division: " + div);
		
		int mod = n1 % n2;
		System.out.println("Modulus: " + mod);

	}
}