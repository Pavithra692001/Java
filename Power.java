
public class Power {

	public static void main(String[] args) {
		int base=4, exponent=8;
		int result=1;
		while(exponent !=0) {
			result*=base;
			--exponent;
		}
		System.out.println("power of given val"+result);
	}

}
