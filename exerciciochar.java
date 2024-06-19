package exerciciosmatriz;

import java.util.Scanner;

public class exerciciochar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char matriz[][] = {
				{'a','b','c','d','e'},
				{'f', 'g', 'h','i','j'},
				{'l','m', 'n', 'o', 'p'},
				{'q', 'r', 's', 't', 'u'}

		};

		for(char []let:matriz) {
			for(char colu:let) {
				System.out.print(colu + "\t");
			}
			System.out.println();
		}
	}

}

