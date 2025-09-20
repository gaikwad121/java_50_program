package program50;

public class vowelsCount {
public static void main(String[] args) {
	String str="Hello I am jyoti mahadev gaikwad from solapur maharashtra";
System.out.println(VowelsCount(str));
}
static int VowelsCount(String str) {
	int Vowelscount=0;
	str=str.toLowerCase();
	char ch[]=str.toCharArray();
	for(char ch1:ch) {
		if(ch1=='a' || ch1=='i' || ch1=='o' || ch1=='u'|| ch1=='e') {
			Vowelscount++;
		}
	}
	return Vowelscount;
}
}
