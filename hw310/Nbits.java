package hw310;

import java.util.ArrayList;
import java.util.Scanner;

public class Nbits {
	public static String convertToBinary(int n){
		int b = 2;
		int r = 0;
		String result = "";
		if(n<0){
			return "";
		}
		while(n != 0){
			r = n%b;
			result += r; 
			n=n/b;
		}
		return result;
	}
	
	public static int checkOne(ArrayList<String> arr, int c){
		int count = 0;
		int numOfone = 0;
		for (int i = 0; i < arr.size(); i++){
			for(int j = 0; j<arr.get(i).length();j++){
				if(arr.get(i).charAt(j) == '1'){
					count++;
				}
			}
			if(count == c){
				numOfone++;
			}
			count = 0;
		}
		return numOfone;
	}
	
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		int n = 0;
		String binaryNum = "";
		
		ArrayList<String> biNumber = new ArrayList<String>();
		while(a<=b){
			binaryNum = convertToBinary(a);
			biNumber.add(binaryNum);
			a++;
		}
		n = checkOne(biNumber, c);
		System.out.println(n);
	}
}
