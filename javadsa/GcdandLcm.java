import java.util.Scanner;

public class GcdandLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(findGCD(a, b));
	}

	static int findGCD(int a, int b) {
		if (a < 0)
			a = a * -1;
		if (b < 0)
			b = b * -1;
		if (a == b)
			return a;
		if (a == 0 && b == 0)
			return 0;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
