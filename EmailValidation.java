package stringclassPrograms;

public class EmailValidation {
	public static void main(String[] args) {
		String s="tom123@gmail.com";

		//	Step 1:convert to lowercase
		s=s.toLowerCase();

		//	Step 2: find the length of username(tom123)
		int diff=s.length()-10;

		//	Step 3: validate first and last letter of user name
		char first=s.charAt(0);
		char last=s.charAt(diff-1);
		boolean flag=false;

		if( ((first >='a' && first <='z') || (first>='0' &&first<='9')) && 
				((last >='a' && last <='z') || (last>='0' && last<='9')) ) {
			flag=true;
		}
		else {
			System.out.println("It is Not a Vaild Mail Id");
		}

		//	Step 4: Check user name contains (0-9).(a-z),(.)
		int ans=0;
		if(flag==true) {
			for(int i=1;i<diff-1;i++) {
				char ch=s.charAt(i);
				if((ch>='0'&&ch<='9') || (ch>='a' &&ch<='z') ||(ch=='.'&&s.charAt(i+1)!='.')) {
					ans=1;
				}
				else {
					break;
				}
			}

			//	Step 5:Validating mail service
			String domain=s.substring(diff, s.length());
			String MailService="@gmail.com";
			if(ans==1 && domain.equals(MailService) &&(s.length()>=6&&s.length()<=30)) {
				System.out.println("It is a Vaild Mail Id");
			}
			else {
				System.out.println("It is Not a Vaild Mail Id");
			}
		}
	}
}
