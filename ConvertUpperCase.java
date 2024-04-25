package stringclassPrograms;

public class ConvertUpperCase {
public static void main(String[] args) {
	String s="apple";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		int n=ch-32;
		System.out.print((char)n);
	}
}
}
