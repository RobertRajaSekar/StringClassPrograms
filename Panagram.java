package stringclassPrograms;

public class Panagram {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz543tty";
	
//	Step 1:Convert String to Char Array
	char [] a=s.toCharArray();
	
//	Assign % for Repeated Character
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]='%';			}
		}
	}
//	Step 3: Count The Character b/w a-z
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>='a' && a[i]<='z') {
			count++;
		}
	}
	
	if(count==26) {
		System.out.println("Panagram");
	}
	else {
		System.out.println("Not a Panagram");
	}
}
}
