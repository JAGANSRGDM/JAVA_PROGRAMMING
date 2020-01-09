//sum 0f 2 numbers with parameter and with return type

import java.util.*;

class sj{
	int sum(int j,int s){	
		j+=s;
		return j;		
	}
}

class sum_with_para_return{
public static void main(String args[]){
	int s,m,k;
	System.out.print("Enter the values: ");
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	k=in.nextInt();
	sj j=new sj();
	s=j.sum(m,k);
	System.out.println("sum of 2 numbers is "+s);
}
}
