package programs;

import java.util.Scanner;

public class NumPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give a Number");
		Scanner input=new Scanner(System.in);
		int GivNum = input.nextInt();
	    int reverse=0;
	    int reminder=0;
	    int q = GivNum;
	    while(q>0)
	    {
	    reminder = q % 10;
	    reverse = (reverse*10) + reminder;
	    q = q/10;
	    }
	    
	    //System.out.println(q);
	   
	   // System.out.println(reminder);
	   // System.out.println("Reverse for "+GivNum+" is " +reverse);
	    
	   
	    if(reverse==GivNum)
	    {
	    	System.out.println(GivNum + " is a Palindrome");
	    }
	    else
	    {
	    	System.out.println(GivNum + " is not a Palindrome");
	    }
	}

}
