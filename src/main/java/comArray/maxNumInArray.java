package comArray;

public class maxNumInArray {
public static void main(String[] args) {
	int arr[]= {34,56,12,45,67,54,89};
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}
	System.out.println(max);
}

}
