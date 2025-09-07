package java_50_Program;

public class sumOfOdd {
public static void main(String[] args) {
	// 1 to 80
	int num=80;
	int sum=0;
	for(int i=1;i<=num;i++) {
		if(i%2!=0) {
			sum+=i;
		}
	}
		System.out.println(sum);
	}
}

