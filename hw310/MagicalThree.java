package hw310;

import java.math.BigInteger;
import java.util.Scanner;

public class MagicalThree {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int a = scan.nextInt();
			if( a == 0) break;
			if( a < 3) System.out.println("No such base");
			if(a==3) System.out.println(4);
			for(int i = 4; i < a; i++){
				if(a%i == 3){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
