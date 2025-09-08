package stringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class remDuplicateinString {
public static void main(String[] args) {
	String str="gaikwwaadd";
	char ch[]=str.toCharArray();
Set<Character>set=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
}
for(char ch2:set) {
	System.out.println(ch2);
}
}
}
