// Java Program to Reverse a String using Stack

import java.util.*;

public class ReverseStringUsingStack
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> s = new Stack<>();
		for(int i=0; i<str.length(); i++) {
		    s.push(str.charAt(i));
		}
		System.out.println(s);
		String rev = "";
		while(!s.isEmpty()) {
		    rev += s.pop();
		}
		System.out.println(rev);
	}
}
