package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		if (n==0) {
			System.out.println("Enter a valid number.");
		}
		else if(n==1) {
			System.out.println(0);
		}
		else if(n==2) {
			System.out.println(0+" "+1);
		}else {
			int a=0,b=1;
			System.out.print(0+" "+1+" ");
			for(int i=1;i<=n-2;i++) {
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
		sc.close();
	}

}
