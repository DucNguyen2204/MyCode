package hw310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DemocracyInDanger {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numGroup = scan.nextInt(); 
		int[] numPeople = new int[numGroup];
		for(int i = 0; i < numGroup; i++){
			numPeople[i] = scan.nextInt();
		}
		for(int i = 1; i < numPeople.length; i++){
			int a = numPeople[i];
			int j = i-1;
			while(j >=0 && numPeople[j] > a){
				 numPeople[j+1] = numPeople[j];
				 j=j-1;
			}
			numPeople[j+1] = a;
		}
		int n = (numPeople.length/2)+1;
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum = sum + ((numPeople[i]/2)+1);
		}
		System.out.println(sum);
	}
}
