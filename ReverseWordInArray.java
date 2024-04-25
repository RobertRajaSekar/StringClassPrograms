package stringclassPrograms;

public class ReverseWordInArray {
	public static void main(String[] args) {
		String s="e sala cup namde";
		String [] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}
}
