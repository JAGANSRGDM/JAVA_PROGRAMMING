//Accept any number check leap year or not.

import java.util.*;

class leap_year{
public static void main(String args[]){
	int year;
	System.out.print("Enter the year: ");
	Scanner in=new Scanner(System.in);
	year = in.nextInt();
	if(year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(year+" is leap year");
			}
			else
				System.out.println(year+" is not a leap year");	
		}
		else
			System.out.println(year+" is leap year");
	}
	else
		System.out.println(year+" is not a leap year");
	}
}
