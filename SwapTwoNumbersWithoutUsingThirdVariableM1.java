import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariableM1 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a value : ");
	    int a = sc.nextInt();
	    System.out.print("Enter b value : ");
	    int b = sc.nextInt();
	    System.out.println("Before Swapping a and b values are : " + a + " " + b);
	    a = a ^ b;
	    b = a ^ b;
	    a = a ^ b;
	    System.out.println("After Swapping a and b values are : " + a + " " + b);
		sc.close();
	}
}
