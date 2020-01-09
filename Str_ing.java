import java.util.*;

class Str_ing{
public static void main(String args[]){
int i=4;
double d=4.0;
String s="Hackerrank ";

Scanner scan=new Scanner(System.in);

int I=scan.nextInt();
double D=scan.nextDouble();
Scanner in=new Scanner(System.in);
String S=in.nextLine();

System.out.println(i+I);
System.out.println(d+D);
System.out.println(s.concat(S));
}
}
