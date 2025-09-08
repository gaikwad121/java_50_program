package stringProgram;

public class printOnlyNumInString {
public static void main(String[] args) {
	String str="h1e7llo1Hi4i3";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(Character.isDigit(ch[i])) {
			System.out.print(ch[i]);
		}
	}
}
}
