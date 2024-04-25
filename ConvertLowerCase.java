package stringclassPrograms;

public class ConvertLowerCase {
	public static void main(String[] args) {
		String s="APPLE";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int n=ch+32;
			System.out.print((char)n);
		}
	}
}
