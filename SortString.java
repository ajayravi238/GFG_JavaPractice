// Sort a String in Java

import java.util.*;

public class SortString
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String res = "";
		for(int i=0; i<str.length(); i++) {
		    for(int j=0; j<str.length()-1; j++) {
		        if(ch[j] > ch[j+1]) {
		            char temp = ch[j];
		            ch[j] = ch[j+1];
		            ch[j+1] = temp;
		        }
		    }
		}
		for(int i=0; i<ch.length; i++) {
		    res += ch[i];
		}
		System.out.println(res);
	}
}
