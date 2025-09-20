package program50;

public class secondMaxArray {
public static void main(String[] args) {
	int arr[]= {4,2,1,6,7,8,9,10};

	System.out.println(secondMax(arr));
}
static int secondMax(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	int secondMax=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=max && arr[i]>secondMax) {
			secondMax=arr[i];
		}
	}
		int thirdMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max &&   arr[i]!=secondMax &&arr[i]>thirdMax) {
				thirdMax=arr[i];
			}
	}
	return thirdMax;
}
}







