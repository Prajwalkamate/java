
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int a=0;
		int b=1;
		int c=1;
		System.out.print(a+" "+b+" ");
		
		for (int i=3;i<=n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
