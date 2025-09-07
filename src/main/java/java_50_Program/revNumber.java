package java_50_Program;

public class revNumber {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int rev=0;
	while(num!=0) {
	rev=rev*10+num%10;
	num/=10;
	}
	System.out.println(rev);
	if(temp==rev) {
		System.out.println("the number is palindrome");
	}else {
		System.out.println("the number is not palindrome");
	}
}
}
