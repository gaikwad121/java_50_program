package program50;

public class factorialNum {
public static void main(String []args) {
int fact=fact(5);
System.out.println("the factorial is : "+" "+fact);
}
public static int fact(int num) {
	int factorial=1;
for(int i=1;i<=num;i++)	{
	factorial=factorial*i;
}
	
	
	return factorial;
}
}
