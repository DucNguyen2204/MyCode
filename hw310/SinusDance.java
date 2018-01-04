package hw310;

import java.util.Scanner;

public class SinusDance {
	public static String s = "";
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			s = calS(calA("",1),1,n);
		System.out.println(s);
		
	}
	
	public static String calA(String a, int n){
		if(n == 1) {
			a = "sin(" + n + a + ")"; 
			return a;
		}
		if(n%2==0){
			a = "-sin(" + n + a + ")";
			return calA(a,n-1);
		}else if(n%2 != 0){
			a = "+sin(" + n + a + ")";
			return calA(a,n-1);
		}
		return "";
	}
	
	public static String calS(String a, int i, int n){
		if(n == i){
			s =  s + a + "+"+ "1";
			return s;
		}else {
			s = "(" + s + a + "+" + (n-(i-1)) + ")";
			return calS(calA("", i+1), i+1, n);
		}
	}
}
