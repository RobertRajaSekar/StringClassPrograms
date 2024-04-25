package stringclassPrograms;

public class CountNoofVowelsConsonentNumbersAndSpecialCharecters {
public static void main(String[] args) {
	String s="welcome@123";
	int v=0,c=0,n=0,sp=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if((ch=='a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u')|| 
				(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			v++;
		}
		else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			c++;
		}
		else if(ch>='0' && ch<='9') {
			n++;
		}
		else {
			sp++;
		}
	}
System.out.println("No of Vowels Are : "+v);
System.out.println("No of Consonents Are : "+c);
System.out.println("No of Numbers Are : "+n);
System.out.println("No of Special Characters Are : "+sp);

}
}
