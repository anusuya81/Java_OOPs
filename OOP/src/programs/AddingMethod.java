package programs;

import java.util.Scanner;

public class AddingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the main method");
		//call static method
		int a;
		a = displaygrades();
		
		if (a<10)
		{
		System.out.println(a);
		}
		else
		{
			System.out.println("a is greater than 10");
			System.out.println(a);
		}
		//System.out.println(displaygrades());
		//call non static method create object
		String cartype;
		AddingMethod anything=new AddingMethod();
		cartype = anything.displayname();
		System.out.println(cartype);
	}
	//static integer return method
	public static int displaygrades()
	{	System.out.println("Hello");
		int i=5;
		int j=6;
		return i+j;
		
	}
	//non static method
	public String displayname()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("what is your cartype");
		String car=reader.nextLine();
		//System.out.println("your name is "+name);
		
		//System.out.println("This is from Names");
		return car;
	}
	

}
