package Logical;

import java.util.Scanner;

public class ReverseNumbers {
public static void main(String[] args) {
	
	System.out.println("Enter the digits");
	Scanner s=new Scanner(System.in);
int num=s.nextInt();
String str=Integer.toString(num);
	StringBuffer buff=new StringBuffer(str);
StringBuffer s1=buff.reverse();
String value=new String(s1);
int ans=Integer.parseInt(value);
System.out.println(ans);
}
}
