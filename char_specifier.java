//accept char given number is uppercase,lowercase,digit or special char

import java.util.*;
class char_specifier{
public static void main(String args[]){
	char sj;
	System.out.print("enter the char:");
	Scanner in = new Scanner(System.in);
	sj= in.next().charAt(0);
	if(sj>=65 && sj<=90)
		System.out.println(sj+" is a uppercase letter");
	else if(sj>=97 && sj<=122)
		System.out.println(sj+" is a lowercase letter");
	else if(sj>=48 && sj<=57)
		System.out.println(sj+" is a digit");
	else
		System.out.println(sj+" is a special character");
	}
}
