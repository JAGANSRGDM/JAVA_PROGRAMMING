//print the number of days in a month

import java.util.*;

class month_days{
public static void main(String args[]){
	int n;
	System.out.print("Enter the month value: ");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	switch(n)
	{
		case 1:System.out.println("31 days in jan");break;
		case 2:System.out.println("28 days in feb");break;
		case 3:System.out.println("31 days in march");break;
		case 4:System.out.println("30 days in april");break;
		case 5:System.out.println("31 days in may");break;
		case 6:System.out.println("30 days in june");break;
		case 7:System.out.println("31 days in july");break;
		case 8:System.out.println("31 days in august");break;
		case 9:System.out.println("30 days in sep");break;
		case 10:System.out.println("31 days in oct");break;
		case 11:System.out.println("30 days in nov");break;
		case 12:System.out.println("31 days in dec");break;
		default:System.out.println("enter the correct month value");break;
	}
}
}
