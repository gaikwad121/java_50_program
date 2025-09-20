package program50;

public class checkPalindrome {
public static void main(String[] args) {
	int num=12321;
	int temp=num;
	int rev=0;
	while(num>0) {
	rev=rev*10+num%10;
	num/=10;
	}
	System.out.println(rev);
	if(temp==rev) {
		System.out.println("palindrome");
	}else {
		System.out.println("not Palindrome");

	}
}
}
