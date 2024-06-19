package exerciciosmatriz;

import java.util.Scanner;

public class desenhoc {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char matrizc[][] = {
				{' ',' ','*'},
				{' ',' ','*'},
				{'*','*','*','*','*'},
				{' ',' ','*',},
				{' ',' ','*',}

		};

		for(char []letra:matrizc) {
			for(char coluna:letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}

}


