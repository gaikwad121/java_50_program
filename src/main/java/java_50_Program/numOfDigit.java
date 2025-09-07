package java_50_Program;

public class numOfDigit {
public static void main(String[] args) {
	int num=7654321;
	int count=0;
	while(num>0) {
		count++;
		num/=10;
	}
	System.out.println(count);
	
}
}
