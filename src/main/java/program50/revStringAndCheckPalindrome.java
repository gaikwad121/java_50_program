package program50;

public class revStringAndCheckPalindrome {
public static void main(String[] args) {
	revName("madam");
}
public static void revName(String name) {
	String rev="";
	String temp=name;
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	if(temp.equals(rev)) {
		System.out.println("palindrome");
	}else {
		System.out.println("Not palindrome");
	}
	//return rev;
	
}
}
