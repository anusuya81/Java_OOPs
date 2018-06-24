package programs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me a first number");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("give me a second number");
		Scanner input1=new Scanner(System.in);
		int b=input1.nextInt();
	
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

}
