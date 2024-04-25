package stringclassPrograms;

public class CountNoOfWords {
public static void main(String[] args) {
	String s=" java is a programming language";
	int c=1;
	if(s.charAt(0)==' ') {
		c=0;
	}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
			c++;
		}
	}
	System.out.println("The no of words are : "+c);
}
}
