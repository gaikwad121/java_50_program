package program50;

public class MinNumber {
public static void main(String[] args) {
	int arr[]= {4,2,1,6,7,8,9,10};
System.out.println(minNum(arr));
}
static int minNum(int arr[]) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
}
