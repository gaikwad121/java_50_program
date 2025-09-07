package java_50_Program;

public class sumOfDigit {
public static void main(String[] args) {
	int num=98765432;
	int sum=0;
	while(num!=0) {
	int n=num%10;
	sum=sum+n;
	num/=10;
}
System.out.println(sum);
}
}