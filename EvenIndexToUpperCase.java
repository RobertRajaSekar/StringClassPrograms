package stringclassPrograms;

public class EvenIndexToUpperCase {
	public static void main(String[] args) {
		String s="welcome";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i%2==0 &&(ch>='a'&&ch<='z')) {
			int n=ch-32;
			System.out.print((char)n);
			}
			else {
				System.out.print(ch);
			}
		}
		
	}
}
