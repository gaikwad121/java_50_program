package java_50_Program;

public class countODddnum1to100 {
public static void main(String[] args) {
	int num=1;
	int count=0;
	do {
		if(num%2!=0) {
		//System.out.println(count);
		count++;
	}
		num++;
	}
		while(num<=100);
    System.out.println("Total odd numbers between 1 and 100: " + count);

}
}
