package stringclassPrograms;

public class CheckStringContainsOnlyLetters {
	public static void main(String[] args) {
		String s="robert";int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				c++;
			}
		}
		if(c==s.length()) {
			System.out.println("String contains only letters");
		}
		else {
			System.out.println("String not only contains letters");
		}
	}
}
