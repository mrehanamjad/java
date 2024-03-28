// 6. Write a java program to declare two variables i.e n1 = 15, n2 = 30 after simple
// execution it will exchange values of both the variables.
// Hint: You can use extra variables to exchange the values of both variables.

public class L1Q6{
    public static void main(String ar[]) {
		int n1 = 15;
        int n2 = 30;
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
	}
}