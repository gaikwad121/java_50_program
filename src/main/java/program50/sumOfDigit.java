package program50;

public class sumOfDigit {
public static void main(String[] args) {
	int num=1239843;
	int sum=0;
	while(num>0) {
		int n=num%10;
	sum+=n;
	num/=10;
	
	}
	System.out.println(sum);
}
}
