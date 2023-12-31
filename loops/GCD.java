package loops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number:");
		int b = sc.nextInt();
		int gcd=0;
		int min = (a<b)?a:b;
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		if(a==0||b==0) {
			gcd=(a>=b)?a:b;
		}
		System.out.println("GCD: "+gcd);
		sc.close();
	}

}
