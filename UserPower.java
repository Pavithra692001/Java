import java.util.Scanner;

public class UserPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base val");
		int base=sc.nextInt();
		System.out.println("enter the exponent");
		int exponent=sc.nextInt();
		System.out.println("enter the result");
		int result=sc.nextInt();
		while(exponent!=0) {
			result*=base;
			--exponent;
			
		}
		System.out.println("Power of given number"+result);
	}

}
