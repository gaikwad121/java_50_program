package program50;

public class DscOrder {
public static void main(String[] args) {
	int arr[]= {4,2,1,6,7,8,9,10};
	DscOrderArr(arr);
}
public static void DscOrderArr(int arr[]) {
for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
if(arr[i]<arr[j]) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
}
for(int a:arr) {
	System.out.println(a);
}
}
}
