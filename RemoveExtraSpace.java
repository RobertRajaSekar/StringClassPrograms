package stringclassPrograms;

public class RemoveExtraSpace {			//we can combine that remove 1st and last space program here
public static void main(String[] args) {
	String s="java   is    a    programming   language";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ' && s.charAt(i+1)==' ') {

		}
		else {
			System.out.print(s.charAt(i));
		}
	}
}
}
