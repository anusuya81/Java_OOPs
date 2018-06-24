package programs;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operationtype;
		
		System.out.println("What operation you want to");
		Scanner inputop=new Scanner(System.in);
		operationtype = inputop.nextLine();
		
		//Calculate operations=new Calculate();
		Mathoperation mymath=new Mathoperation();
		int x=5;
		int y=5;
		
		if(operationtype.equalsIgnoreCase("add"))
		{
			System.out.println(mymath.add(x, y));//x,y are the arguments
		}
		else if(operationtype.equalsIgnoreCase("sub"))
		{
			System.out.println(mymath.sub(x, y));
		}
		else if(operationtype.equalsIgnoreCase("multiple"))
		{
			System.out.println(mymath.mul(x, y));
			
		}
		else if(operationtype.equalsIgnoreCase("div"))
		{
			System.out.println(mymath.div(x, y));
		}
		else
		{
			System.out.println("It is not clear ");
		}
		
		
	}

}
