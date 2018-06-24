package programs;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass objectXY = new MainClass();
		objectXY.printme();

		abc();
		int xy;
		xy = abc() + 500;
		System.out.println("==============");
		System.out.println(xy);
		
	 System.out.println("Hello " + userInput() );
		int abc = 10;
		echo(abc);
		
		Secondclass secondObject = new Secondclass();
		secondObject.helloPrint();
	
	}
	
	public  void printme(){
		System.out.println("I am printing");
	}
	
	
	public static String userInput(){	
		Scanner input = new Scanner(System.in);
		System.out.println("What is you name?");
		String name;
		name = input.nextLine();
		return name;
	}
	
	public static int abc(){
		return 5+5*2;
	}
	
	public static void echo(int y){
		System.out.println(y);
	}
// AT 9:30 CST // 10:30 EST
}

