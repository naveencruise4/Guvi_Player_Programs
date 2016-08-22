package Logical;

import java.util.Scanner;

public class ReverseRemoveVowels {
public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner s=new Scanner(System.in);
String str=s.next();
	StringBuffer buff=new StringBuffer(str);
StringBuffer s1=buff.reverse();
String value=new String(s1);
char c=' ';
String ans="";
for(int i=0;i<value.length();i++)
{
	c=value.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		c=' ';
	};
	ans=ans+c;
}
String answer[]=ans.split(" ");
String s2="";
for(int i=0;i<answer.length;i++)
{
s2=s2+answer[i];
}
System.out.println(s2);
}
}