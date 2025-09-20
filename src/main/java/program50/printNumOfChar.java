package program50;

public class printNumOfChar {
public static void main(String[] args) {
	String str="gaikwad";
	System.out.println(printNumOfCharacter(str));
}
static int printNumOfCharacter(String str) {
	char ch[]=str.toCharArray();
	
		int length=ch.length;
	
	return length;
}
}
