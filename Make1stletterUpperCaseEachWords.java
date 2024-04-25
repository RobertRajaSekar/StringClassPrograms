package stringclassPrograms;

import java.util.Arrays;

public class Make1stletterUpperCaseEachWords {
	public static void main(String[] args) {
		String s="my name is tom";
		String [] a=s.split(" ");

		for(int i=0;i<a.length;i++) {
			String word=a[i];
			char[] c=word.toCharArray();

			for(int j=0;j<c.length;j++) {
				if (j == 0) {
					char letter=c[j];
					int n = letter - 32;
					letter = (char) n;
					c[j] = letter;
				}
			}
			a[i] = new String(c);
		}
		System.out.println(Arrays.toString(a));
	}
}
