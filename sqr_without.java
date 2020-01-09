//sqr of a number without parameter and without return type

import java.util.*;

class sj{
	void sum(){
		int m;
		System.out.print("Enter the values: ");
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		System.out.println("square of "+m+" is "+(m*m) );
	}
}

class sqr_without{
public static void main(String args[]){
	sj j=new sj();
	j.sum();
}
}
