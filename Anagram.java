package stringclassPrograms;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="hello";
	String s2="oelhl";
	
//	Step 1: Convert String to Char Arrays
	char [] a=s1.toCharArray();
	char [] b=s2.toCharArray();

	
//	Step 2: Sort Char Arrays  (we can also use in-build methods)-->Arrays.sort(a);
//	(Bubble sort method)
	
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				char temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length-1;j++) {
			if(b[j]>b[j+1]) {
				char temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}
	}
	
//	Step 3:Convert Char Array to String
	String s3=new String(a);
	String s4=new String(b);
	
	if(s3.equalsIgnoreCase(s4)) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not anagram");
	}
}
}
