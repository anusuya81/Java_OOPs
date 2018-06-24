package programs;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String GetStr[]=new String[10];
		GetStr[0]="Anu";
		GetStr[1]="Bala";
		GetStr[2]="Shaaran";
		GetStr[3]="Kp";
		GetStr[4]="Krishna";
		GetStr[5]="Ram";
		GetStr[6]="Arumugam";
		GetStr[7]="Anu";			
		GetStr[8]="Shanmugam";
		GetStr[9]="Jegatha";
		System.out.println("Give me a string");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		//flag or count
		int count=0;
		int position=0;
		for(int i=0;i<GetStr.length;i++)
		{
			if(name.equalsIgnoreCase(GetStr[i]))
			{
				
				count++;
				position=i;
				//System.out.println(position);
				System.out.println("The String " + name +" is already in the array,it is in the "+  position + " position" );
				
			}
		}
				
		if(count==0)
		{
			System.out.println("This String is not in the array"); 
		}
	/*	else
		{
			System.out.println("The String " + name +" is already in the array,it is in the "+  position + " position" );	
		
		}*/
		
	
		
	}

}
