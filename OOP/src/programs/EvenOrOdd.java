package programs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Give a Number");
		int check=input.nextInt();
		//boolean b;
		if ((check % 2)==0)
		{
			System.out.println("The number "+ check + " is Even " );
		}
		else
		{
			System.out.println("The numer "+ check +" is Odd " );
		}
	}

}
