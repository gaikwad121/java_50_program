package stringProgram;

public class printConsonet {
public static void main(String[] args) {
	String str="jyoti gaikwad";
	char ch[]=str.toCharArray();
	int count=0;
	int countConsont=0;
	for(char ch2:ch) {
		if(ch2!=' ') {
		if(ch2=='A' || ch2=='I' || ch2=='E' || ch2=='O' || ch2=='U' || ch2=='a' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='e') {
			count++;
		}else {
			countConsont++;	
	}
	}
	}
	System.out.println(countConsont);
}
}



