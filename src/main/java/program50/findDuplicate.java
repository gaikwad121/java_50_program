package program50;

import java.util.HashSet;
import java.util.Set;

public class findDuplicate {
public static void main(String[] args) {
	int arr[]= {0,5,4,5,3,2,1,4,3,5,9,2,1,0};
	duplicate(arr);
}
static void duplicate(int arr[]) {
	Set<Integer>set=new HashSet<Integer>();
	for(int a:arr) {
		set.add(a);
	}
	for(int arr1:arr) {
		System.out.println(arr1);
	}
	
}
}
