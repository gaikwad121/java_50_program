package java_50_Program;

public class palRevString {
public static void main(String[] args) {
	//String str="madam";
	String str="jyoti";

	String rev="";
	String temp=str;
	char ch[]=str.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		rev=rev+ch[i];
	}
	System.out.println(rev);
	if(temp.equals(rev)){
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");

	}
}
}
