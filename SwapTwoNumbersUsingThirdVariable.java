import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a value : ");
	    int a = sc.nextInt();
	    System.out.print("Enetr b value : ");
	    int b = sc.nextInt();
	    System.out.println("Before swapping a and b values are : "+ a + " " + b);
	    int temp = a;
	    a = b;
	    b = temp;
	    System.out.println("After swapping a and b values are : "+ a + " " + b);
		sc.close();
	}
}
