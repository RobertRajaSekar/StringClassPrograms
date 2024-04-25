package stringclassPrograms;

import java.util.Arrays;

public class ConvertStringToStringArray {
	public static void main(String[] args) {
		String s="welcome";
		String [] arr=new String[s.length()];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String str="";
			str=str+ch;
			arr[i]=str;
		}
		System.out.println(Arrays.toString(arr));
	}
}


