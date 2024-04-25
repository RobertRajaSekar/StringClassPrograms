package stringclassPrograms;

import java.util.Arrays;

public class ConvertStringToCharArray {
	public static void main(String[] args) {
		String s="welcome";
		char [] a=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			a[i]=ch;
		}
		System.out.println(Arrays.toString(a));
	}
}

