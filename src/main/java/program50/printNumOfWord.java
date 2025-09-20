package program50;

public class printNumOfWord {
public static void main(String[] args) {
	String str="Hello I am jyoti mahadev gaikwad from solapur maharashtra";
System.out.println(numofWord(str));
}
static int numofWord(String str) {
	String str1[]=str.split(" ");
	int length=str1.length;
	return length;
}
}
