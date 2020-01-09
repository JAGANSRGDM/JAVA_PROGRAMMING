//sum 0f 2 numbers with parameter and without return type

import java.util.*;

class sj{
	void sum(int s, int r){
		
		System.out.println("sum of "+s+" and "+r+" is "+ (s+r));
	}
}

class sum_with_para{
public static void main(String args[]){
	int m,k;
	System.out.print("Enter the values: ");
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	k=in.nextInt();
	sj j=new sj();
	j.sum(m,k);
}
}
