package application;

import java.util.Scanner;

public class atividade7_Matriz {
	public static void main (String[] Args) {
		Scanner cs = new Scanner(System.in);
		
		int m = cs.nextInt();
		int n = cs.nextInt();
		int[][] matriz = new int[m][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = cs.nextInt();
			}
		}
		
		int x = cs.nextInt();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if(j > 0)
						System.out.println("left: " + matriz[i][j-1]);
					if(i > 0)
						System.out.println("Up: " + matriz[i-1][j]);
					if(j < matriz.length-1)
						System.out.println("Right: " + matriz[i][j+1]);
					if(i < matriz[i].length-1)
						System.out.println("Down: " + matriz[i+1][j]);
					System.out.println();
				}
			}
		}
		
		cs.close();
	}
}
