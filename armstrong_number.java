package day1;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number=");
		int n,a,b,r=0;
		n=sc.nextInt();
		a=n;
		while(a!=0)
		{
			b=a%10;
			r=r+(b*b*b);
			a=a/10;
		}
		if(n==r)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Not armstrong number");
		}
		sc.close();
	}

}
