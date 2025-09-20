package program50;

public class countNumOfDigit {
public static void main(String[] args) {
	int num=192876453;
	int count=0;
	while(num>0) {
	count++;
	num/=10;
	}
	System.out.println(count);
}
}
