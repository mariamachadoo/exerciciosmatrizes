package exerciciosmatriz;

import java.util.Scanner;

public class desenhob {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char matrizb[][] = {
				{' ',' ',' ','*'},
				{' ',' ','*',' '},
				{' ','*',' ',' '},
				{'*',' ',' ',' '}

		};

		for(char []letra:matrizb) {
			for(char coluna:letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}

}



