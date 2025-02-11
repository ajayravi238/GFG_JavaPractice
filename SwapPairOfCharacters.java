// Swapping Pairs of Characters in a String in Java

import java.util.*;

public class SwapPairOfCharacters
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0; i<str.length()-1; i=i+2) {
		    char temp = ch[i];
		    ch[i] = ch[i+1];
		    ch[i+1] = temp;
		}
		System.out.println(Arrays.toString(ch));
	}
}
