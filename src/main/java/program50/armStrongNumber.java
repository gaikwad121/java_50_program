package program50;

public class armStrongNumber {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int arm=0;
	while(num>0) {
	int n=num%10;
	arm=arm+(n*n*n);
	num/=10;
	}
	if(temp==arm) {
	System.out.println("The number is armstrong number");
	}else {
		System.out.println("The number is not armstrong number");

	}
}
}
