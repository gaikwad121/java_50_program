package program50;

public class CountConsonent {
public static void main(String[] args) {
	String str="Hello I am jyoti mahadev gaikwad from solapur maharashtra";
System.out.println(printCountConsonent(str));
}
static int printCountConsonent(String str) {
	int count=0;
	str=str.toLowerCase();
	char ch[]=str.toCharArray();
	for(char ch1:ch) {
		if(ch1>='a' && ch1<='z') {
		if(!(ch1=='a' || ch1=='i' || ch1=='o' || ch1=='u'|| ch1=='e')) {
count++;
	}
	}
	}
	return count;
}
}
