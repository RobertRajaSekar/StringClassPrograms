package stringclassPrograms;

public class CountNoofSpaces {
public static void main(String[] args) {
	String s="   good  morning  ";
	int count=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println("No of spaces : "+count);
}
}
