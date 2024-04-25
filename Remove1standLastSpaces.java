package stringclassPrograms;

public class Remove1standLastSpaces {
	public static void main(String[] args) {
		String s="   good  morning  ";
		int st=0;int end=s.length()-1;
		for(int i=0;i<s.length();i++) {

			if(s.charAt(st)==' ') {
				st++;
			}
			if(s.charAt(end)==' ') {
				end--;
			}
		}
		for(int i=st;i<=end;i++) {
			char ch=s.charAt(i);
			System.out.print(ch);
		}
	}
}
