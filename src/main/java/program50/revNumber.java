package program50;

public class revNumber {
public static void main(String[] args) {
	int num=9876123;
	int count=0;
	while(num>0) {
	count++;
	num/=10;
	}
	System.out.println(count);
}
}
