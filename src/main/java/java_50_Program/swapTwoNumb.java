package java_50_Program;

public class swapTwoNumb {
public static void main(String[] args) {
	int num=12;
	int num1=45;
	int temp=num;
	num=num1;
	num1=temp;
	System.out.println(num+" "+num1);
	num=num*num1;
	num1=num/num1;
	num=num/num1;
	System.out.println(num+" "+num1);
num=num+num1;
num1=num-num1;
num=num-num1;
System.out.println(num+" "+num1);

}
}
