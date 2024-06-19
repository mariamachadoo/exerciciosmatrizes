package exerciciosmatriz;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];

		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
					a [i][j] = (int)Math.round(Math.random()*100);
					b [i][j] = (int)Math.round(Math.random()*100);
					c [i][j]=a[i][j] * b[i][j];
			}
		}
		System.out.print(" MATRIZ A");
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("[" + a [i][j] + "]");
			}
			System.out.println("\n------------");
		}
		System.out.print("MATRIZ B");
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("[" + b [i][j] + "]");
			}
			System.out.println("\n------------");
		}
		System.out.print("MATRIZ C");
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("[" + c [i][j] + "]");
			}
			System.out.println("\n------------");
					
				}
				
			}
		
	}
