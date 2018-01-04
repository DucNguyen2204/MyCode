package hw310;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfConsePrime {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int a = scan.nextInt();
			if(a==0) break;
			int count = 0;
			ArrayList<Integer> primeNum = primeGenerator(a);
			for(int i = 0; i < primeNum.size(); i++){
				int sum = primeNum.get(i);
				if(sum > a) break;
				else if(sum == a) count++;
				for(int j=i+1; j < primeNum.size();j++){
					sum = sum + primeNum.get(j);
					if(sum > a) break;
					else if (sum == a) 
						count++;
				}
			}
			System.out.println(count);
		}
	}
	public static ArrayList<Integer> primeGenerator(int a){
		ArrayList<Integer> primeNum = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 1; i <= a; i++){
			int count = 0; 
			for(int k = i; k >= 1;k--){
				if(i%k==0) count++;
			}
			if(count == 2){
				primeNum.add(i);
			}
		}
		return primeNum;
	}
}
