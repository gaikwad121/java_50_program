package program50;

public class maximumNumInArra {
public static void main(String[] args) {
	int arr[]= {4,2,1,6,7,8,9,10};
System.out.println(maxNum(arr));
}
public static int maxNum(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
}
