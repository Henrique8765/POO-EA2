package Cinema;

import java.util.Scanner;

import Cinema.Filme;
import Cinema.Ingresso;
import Cinema.MenuController;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		MenuController.menuFilme();
		System.out.println();
		MenuController.menuSessao();
		System.out.println();
		MenuController.menuIngresso();
		System.out.println();
		MenuController.resultadoFinal();
	}

}