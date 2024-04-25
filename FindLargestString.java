package stringclassPrograms;

public class FindLargestString {
public static void main(String[] args) {
	String s="hi hello bye welcome";
	String [] a=s.split(" ");
	int max=a[0].length();
	int min=a[0].length();
	int k=0,l=0;
	
	for(int i=0;i<a.length;i++) {
		if(max<a[i].length()) {
			max=a[i].length();
			k=i;
		}
		if(min>a[i].length()) {
			min=a[i].length();
			l=i;
		}
	}
	System.out.println("The largest  String is : "+a[k]);
	System.out.println("The smallest  String is : "+a[l]);
}
}
