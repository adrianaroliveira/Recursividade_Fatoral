package view;

import controller.FatoralController;

public class Principal {

	public static void main(String[] args) {
		FatoralController fat = new FatoralController();
		int numero = 5;
		int resultado = fat.fatoral(numero);
		System.out.println(resultado);
	}
}
