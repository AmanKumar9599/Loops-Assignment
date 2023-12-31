package loops;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=sc.next();
		String s1="";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		if(s1.equals(s)){
			System.out.println("Pallindrome");
		}else System.out.println("Not a pallindrome");
		sc.close();
	}

}
