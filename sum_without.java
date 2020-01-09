//sum 0f 2 numbers without parameter and without return type

import java.util.*;

class sj{
	void sum(){
		int m,k;
		System.out.print("Enter the values: ");
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		k=in.nextInt();
		System.out.println("sum of"+m+" and "+k+" is "+ (m+k));
	}
}

class sum_without{
public static void main(String args[]){
	sj j=new sj();
	j.sum();
}
}
