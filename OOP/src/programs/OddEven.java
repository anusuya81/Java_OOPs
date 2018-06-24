package programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Give a Number");
		int check=input.nextInt();
		//boolean b;
		if ((check % 2)==0)
		{
			System.out.println("The number is Even " + check);
		}
		else
		{
			System.out.println("The numer is Odd " + check);
		}
	}

}
