package stringclassPrograms;

import java.util.Arrays;

public class StringMethods {
public static void main(String[] args) {
	System.out.println("-----------charAt(intIndex)------------");
	String s="hello";
	System.out.println(s.charAt(0));
	
	System.out.println("-----------length()------------");
	System.out.println(s.length());
	
	System.out.println("-----------subString(int beginingindex)------------");
	String s1="java program";
	System.out.println(s1.substring(5));
	
	System.out.println("-----------subString(int beginingindex,endingindex)------------");
	String s2="java is a programming language";
	System.out.println(s2.substring(10, 21));
	
	System.out.println("-----------concat(string str)------------");
	String s3="hello";
	String s4="world";
	System.out.println(s3.concat(s4));
	System.out.println(s3.concat(" bye"));//-->we also create like this too
	
	System.out.println("-----------toUpperCase()------------");
	System.out.println(s2.toUpperCase());
	
	System.out.println("-----------toLowerCase()------------");
	String s5="ROBERT@GMAIL.Com";
	System.out.println(s5.toLowerCase());//-->it will used in email verification&only convert the characters
	
	System.out.println("-----------trim()------------");
	String s6="    Hello     World       ";
	System.out.println(s6.trim());
	
	System.out.println("-----------indexof()------------");
	String s7="Programming Language";
	System.out.println(s7.indexOf("a"));
	
	System.out.println("-----------lastindexof()------------");
	System.out.println(s7.lastIndexOf("a"));
	
	System.out.println("-----------split()------------");
	String s8="java is a programming language";
	String [] a=s8.split(" ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("--------with foreach loop");
//	for each loop
	for(String x:a) {
		System.out.println(x);
	}
	
	System.out.println("-----------isEmpty()------------");
	String s9="hii";
	String s10="";
	System.out.println(s9.isEmpty());
	System.out.println(s10.isEmpty());//space is also a character
	
	System.out.println("-----------DoubleEqual(==)------------");
	String s11="hello";
	String s12="hello";
	System.out.println(s11==s12);//true-->pointing same address
	String s13=new String("hello");
	String s14=new String("hello");
	System.out.println(s13==s14);//false-->pointing different address
	
	System.out.println("-----------equals(String str)------------");
	System.out.println(s13.equals(s14));
	
	System.out.println("-----------equalsignorecase(String str)------------");
	String s15="hello";
	String s16="HeLlO";
	System.out.println(s15.equalsIgnoreCase(s16));
	
	System.out.println("-----------tocharArray()------------");
	String s17="welcome";
	char [] arr=s17.toCharArray();
	System.out.println(Arrays.toString(arr));
	
}
}
