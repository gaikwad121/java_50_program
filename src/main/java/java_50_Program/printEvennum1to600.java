package java_50_Program;

public class printEvennum1to600 {
public static void main(String[] args) {
	int num=1;
	int count=0;
	do {
		if(num%2==0) {
			System.out.println(num);
			count++;
		}
		num++;
	}
		while(num<10);
	
}
}
