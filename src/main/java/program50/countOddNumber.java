package program50;

public class countOddNumber {
public static void main(String[] args) {
	int num=100;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(i%2!=0) {
			count++;
		}
	}
		System.out.println(count);
	}
}

