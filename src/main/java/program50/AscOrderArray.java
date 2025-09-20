package program50;

public class AscOrderArray {
public static void main(String[] args) {
	int arr[]= {9,3,2,1,6,7,8,4};
	AscArr(arr);
}
public static void AscArr(int arr[]) {
for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
if(arr[i]>arr[j]) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}}
