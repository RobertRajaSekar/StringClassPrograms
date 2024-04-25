package stringclassPrograms;

import java.util.Arrays;

public class ConvertStringToIntArray {
public static void main(String[] args) {
	String s="apple";
	int [] a=new int[s.length()];
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		a[i]=ch;
	}
	System.out.println(Arrays.toString(a));
}
}
