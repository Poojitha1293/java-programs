import java.util.Scanner;

public class MaxAndMinValuesOfThreeNumbers {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 value : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 value : ");
		int n2 = sc.nextInt();
		System.out.print("Enter n3 value : ");
		int n3 = sc.nextInt();
		int min = n1;
		int max = n1;
		if(n2<min){ 
		min = n2;
		}
		if(n3<min){
		min = n3;
		}
		if(n2>max){ 
		max = n2;
		}
		if(n3>max){ 
		max = n3;
		}
		System.out.println("Maximum Value : " + max);
		System.out.println("Minimum Value : " + min);
		sc.close();
	}
}
