import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 value : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 value : ");
		int n2 = sc.nextInt();
		System.out.println("Sum = "+(n1+n2));
		sc.close();
	}
}
