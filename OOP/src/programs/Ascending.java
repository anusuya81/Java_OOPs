package programs;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me a first number");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("give me a second number");
		Scanner input1=new Scanner(System.in);
		int b=input1.nextInt();
	System.out.println("the numbers are " + a + " " + b);
		
			for(int i=a;i<=b;i++)
			{
			System.out.println(i);
			}
			
		
			for(int j=b;j<=a;j++)
			{
			System.out.println(j);
			}
		
		
	}

}
