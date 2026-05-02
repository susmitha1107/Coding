package helloworld;

import java.util.Scanner;

public class stringrevesal_palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a strings");
		String s= sc.nextLine();
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			s1=s1+c;
			
			
		}
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
