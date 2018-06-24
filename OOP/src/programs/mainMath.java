package programs;

import java.util.Scanner;

public class mainMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What you want to do");
		String check=input.nextLine();
		
		MathFunc operation=new MathFunc();
		
		Scanner input1=new Scanner(System.in);
		System.out.println("What is the number");
		int ab=input1.nextInt();
		
		if(check.equalsIgnoreCase("square"))
		{
			System.out.println(operation.square(ab));
		}
		else if(check.equalsIgnoreCase("cube"))
		{
			System.out.println(operation.cube(ab));
		}
		else
		{
			System.out.println("not match");
		}
		
		
		
	}

}
