package java_50_Program;

public class armStrongNum {
public static void main(String[] args) {
	int arm=0;
	int num=153;
	int temp=num;
	while(num>0) {
		int n=num%10;

		arm=arm+(n*n*n);
		num/=10;
	}
	if(temp==arm) {
		System.out.println("it's armstrong number");
	}else {
		System.out.println("it's not armstrong number");

	}
}
}
