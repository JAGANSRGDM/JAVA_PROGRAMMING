//sqr of a number with parameter and with return type

import java.util.*;

class sj{
	int sqr(int j){
	int k;	
	k= j*j;	
	return k;
	}
}

class sqr_with_para_return{
public static void main(String args[]){
	int s,m;
	System.out.print("Enter the values: ");
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	sj j=new sj();
	s=j.sqr(m);
	System.out.println("square of a number is "+s);
}
}
