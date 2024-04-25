package stringclassPrograms;

public class CheckStringContainsOnlyDigits {
	public static void main(String[] args) {
		String s="123456";int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {//-->we can add the space too (||s.charAt(i)==' ')
				c++;
			}
		}
		if(c==s.length()) {
			System.out.println("String contains only digits");
		}
		else {
			System.out.println("String not only contains digits");
		}
	}
}
