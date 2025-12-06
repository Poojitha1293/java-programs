import java.util.*;
public class EqualsAndEqualsSymbolDifference {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1 : ");
		String s1 = sc.nextLine();
		System.out.print("Enter string2 : ");
		String s2 = sc.nextLine();
		if(s1==s2){
		    System.out.println("s1 and s2 are same");
		}
		else{
		    System.out.println("s1 and s2 are not same");
		}
		
		if(s1.equals(s2)){
		    System.out.println("s1 and s2 are same");
		}
		else{
		    System.out.println("s1 and s2 are not same");
		}
		sc.close();
	}
}
