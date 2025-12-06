import java.util.Scanner;

public class EvenOrOddWithoutUsingModulusOperatorM1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if((n >> 1) << 1 == n){
		    System.out.println(n + " is a even number");
		}
		else{
		    System.out.println(n + " is a odd number");
		}
		sc.close();
	}
}
