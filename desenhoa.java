package exerciciosmatriz;

import java.util.Scanner;

public class desenhoa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char matriz[][] = {
				{'*','*','*','*'},
				{'*','*','*'},
				{'*','*'},
				{'*'},

		};

		for(char []letra:matriz) {
			for(char coluna:letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}

}
