package program50;

public class swapTwoNumWithout3RdNum {
public static void main(String[] args) {
	swap(98,5);
}
public static void swap(int a,int b) {
	System.out.println("Before swaping : "+a+" "+b);

	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After swaping : "+a+" "+b);
}

}
