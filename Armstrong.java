
public class Armstrong {

	public static void main(String[] args) {
		int number=346,original,result=0,remainder;
		original=number;
		while(original!=0) {
			remainder=original/10;
			result+=Math.pow(remainder,3);
			original/=3;
		}
			if(result==number) {
				System.out.println("is an armstrong.........");
			}
			else {
				System.out.println("is not an armstrong............");
			}
			
			
			
			
		}
	}


