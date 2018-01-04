package hw310;

public class chessInvention {
	/***
	 * This is 2.1 10 in the textbook.
	 * @param args
	 */
	public static void main (String[] args){
		double sumB = 0;
		double sumA = 0;
		double a = 0;
		for(int i =0; i < 64;i++){
			a = Math.pow(2, i);
			sumA = sumA + a;
		}
		
		for(int i = 1; i < (64*2+1); i = i+2){
			sumB = sumB + i;
		}
		System.out.println("Part a: ");
		System.out.println("He will need " + sumA + " seconds to count all the grains");
		System.out.println("Part b: ");
		System.out.println("He will need " + sumB + " seconds to count all the grains");
	}
	
}
