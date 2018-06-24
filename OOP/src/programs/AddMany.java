package programs;

import java.util.Scanner;

public class AddMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers you want to add");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("give me a number one by one");
		int c=0;
		for (int i=0;i<a;i++)
		{
		Scanner input1=new Scanner(System.in);
		int b=input1.nextInt();
		c=c+b;
		}
		System.out.println(c);
		
	}

}
