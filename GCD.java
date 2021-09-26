
public class GCD {
	static int gcd(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b) {
			return a;
			if(a>b)
				return gcd(a-b,b);
			return gcd(a,b-a);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45,b=98;
		sysout 
		

	}

}
