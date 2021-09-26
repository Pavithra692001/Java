
public class LCM {
	static int gcd(int a, int b) {
		if(a==0) 
			return b;
			return gcd( b%a ,a);
			}
		static int LCM(int a,int b) {
			return (a/gcd(a,b))*b;
		}
	
	

	public static void main(String[] args) {
		int a=20,b=12;
		System.out.println("lcm"+LCM(a,b));
	
	
}

}

