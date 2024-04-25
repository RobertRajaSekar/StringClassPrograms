package stringclassPrograms;

public class NumberValidation {
	public static void main(String[] args) {
		String s="9542782360"; 
		char first=s.charAt(0);

		if(s.length()==10) { 
			if(first>='6' && first<='9') { 
				boolean flag=true; 
				for(int i=1;i<s.length();i++) { 
					char ch=s.charAt(i);
					if(ch>='0' && ch<='9') { 

					} else {
						flag=false; 
						break; 
					} 
				} 
				if(flag==true) { 
					System.out.println("valid"); 
				} 
				else {
					System.out.println("invalid(Number contains other char)");
				}
			} 
			else {
				System.out.println("invalid(first char(6-9)"); 
			} 
		} 
		else { 
			System.out.println("invalid(Length should be equal to 10)"); 
		}
	}
}
