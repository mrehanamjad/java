// 7. Modify problem No.6 solves the problem without using extra variable.

public class L1Q7{
    public static void main(String ar[]) {
		int n1 = 15;
        int n2 = 30;
		n1 = n2+n1;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
	}
}