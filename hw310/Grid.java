package hw310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Grid {
	private static ArrayList<Integer> arr = null;
	private static Queue<Node> myQ = null;

	static class Node{
		int x=0,y=0,step = 0, val = 0;

		public Node(int x, int y, int step, int val) {	
			this.x = x;
			this.y = y;
			this.step = step;
			this.val = val;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getStep() {
			return step;
		}
		public int getVal() {
			return val;
		}		
	}

	public static void main (String[] args){
		Scanner scnr = new Scanner(System.in);
		while(true){
		String fl = scnr.nextLine();
		String[] line = fl.split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		if(n==0||m==0) break;
		int i = 0;
		int array [][] = new int[n][m];
		
		
		while(i < n){
			arr = new ArrayList<Integer>();
			String row = scnr.nextLine();
			for(int b = 0; b < m ; b++){
				array[i][b] = Character.getNumericValue(row.charAt(b));
			}
			i++;
		}
		
		System.out.println(bfs(array,n,m));
		}
	}
	
	public static int bfs(int[][] array, int n, int m){
		int x= 0;
		int y = 0;
		int step = 0;
		boolean[][] visited = new boolean[n][m];
		myQ = new LinkedList<Node>();
		Node current = new Node(0,0,0, array[0][0]);
		myQ.add(current);
		visited[0][0] = true;
		while(!myQ.isEmpty()){
			current = myQ.peek();
			int val = current.getVal();
			myQ.poll();
			if(current.getY()==(n-1) && current.getX()==(m-1)) return current.getStep();
			int dir[][] = {{0,val},
							{0,-val},
							{val,0},
							{-val,0}};
			for(int i = 0; i < 4; i++){
				x= current.getX() + dir[i][0];
				y = current.getY() + dir[i][1];
				
				if(x>=m||y>=n||x<0||y<0)
					continue;
				if(visited[y][x] == true){
					continue;
				}
				Node next = new Node(x,y,(current.getStep()+1),array[y][x]);
				myQ.add(next);
				visited[next.getY()][next.getX()] = true;
			}
			
		}
		
		return -1;
	}
	
}


