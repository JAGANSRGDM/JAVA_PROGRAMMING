//sum 0f 2 numbers without parameter and with return type

import java.util.*;

class sj{
	int sum(){
		int m,k;
		System.out.print("Enter the values: ");
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		k=in.nextInt();	
		m+=k;
		return m;		
	}
}

class sum_with_return{
public static void main(String args[]){
	int s;
	sj j=new sj();
	s=j.sum();
	System.out.println("sum of 2 numbers is "+s);
}
}
