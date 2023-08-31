import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.println(i);
		}
		
	}

}
