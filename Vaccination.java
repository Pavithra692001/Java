import java.util.Scanner;

public class Vaccination {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the   current age: ");
		 int age=sc.nextInt();
		 if(age<18) {
			 System.out.println("not eligible to vaccinate...");
		 }
			 
		 
		 else {
			 System.out.println("eligible to vaccinate...");
			 System.out.println("take rest and take the tablet... take care!");
			 
		 }
	}
	
}
