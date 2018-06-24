package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give a String");
		Scanner input=new Scanner(System.in);
		String GivStr = input.next();
	    String reverse="";
	    for(int i=GivStr.length()-1;i>=0;i--)
	    {
	    	reverse=reverse+GivStr.charAt(i);
	    }
	    System.out.println("Reverse String is "+reverse);
	    if(reverse.equalsIgnoreCase(GivStr))
	    {
	    	System.out.println(GivStr + " is a Palindrome");
	    }
	    else
	    {
	    	System.out.println(GivStr + " is not a Palindrome");
	    }
		/*char[] ch=GivStr.toCharArray();
	
		for(int i =ch.length-1;i>=0;i--)
		{
			reverse = reverse +ch[i];
		}
		System.out.println(reverse);
		if(GivStr.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}*/
		
	}

}
