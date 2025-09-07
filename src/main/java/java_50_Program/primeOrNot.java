package java_50_Program;

public class primeOrNot {
public static void main(String[] args) {
	int num=3;
	int count=0;
	boolean flag=false; //  prime number

	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=true;
		}
	}
	if(flag) {
		System.out.println("it's not prime number");
	}else {
		System.out.println("it's prime number");

	}
}
}
