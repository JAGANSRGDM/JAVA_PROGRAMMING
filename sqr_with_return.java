//sqr of a number without parameter and with return type

import java.util.*;

class sj{
	int sqr(){
	int m,k;
	System.out.print("Enter the values: ");
	Scanner in=new Scanner(System.in);
	m=in.nextInt();	
	k= m*m;	
	return k;
	}
}

class sqr_with_return{
public static void main(String args[]){
	int s;
	sj j=new sj();
	s=j.sqr();
	System.out.println("square of a number is "+s);
}
}
