package stringclassPrograms;

public class Palindrome {
public static void main(String[] args) {
	String s="malayalam";
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	if(s.equalsIgnoreCase(s1)) {  //-->we usually use equals
		System.out.println("The given word is palindrome");
	}
	else {
		System.out.println("The given word is not a palindrome");
	}
}
}
