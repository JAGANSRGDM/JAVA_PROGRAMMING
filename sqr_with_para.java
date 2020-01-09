//sqr of a number with parameter and without return type

import java.util.*;

class sj{
	void sqr(int k){
		
		System.out.println("square of "+k+" is "+(k*k) );
	}
}

class sqr_with_para{
public static void main(String args[]){
	int m;
	System.out.print("Enter the values: ");
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	sj j=new sj();
	j.sqr(m);
}
}
