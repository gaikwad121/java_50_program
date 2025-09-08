package comArray;

public class minNumInArray {
public static void main(String[] args) {
	int arr[]= {67,4,3,1,89,43,23,67,88,90,-90};
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
	}
	System.out.println(min);
}
}
