package programs;

import java.util.Scanner;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Give a Sting");
		String check=input.nextLine();
		System.out.println(check);
		int charlength;
		charlength=check.length();
		System.out.println(charlength);
	}

}
