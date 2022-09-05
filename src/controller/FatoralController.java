package controller;

public class FatoralController {
	public FatoralController() {
		super();
	}
	public int fatoral(int numero) {
		if (numero < 0) { //caso o numeo seja menor do que zero o resultado deve ser zero
			return 0;			
		} else if (numero<=1){ //caso a base seja menor ou igual a 01 deve efetuar parada e resultar em 1
			return 1;			
		} else { // sendo maior que um deve efetuar a fatoração
			return numero * fatoral(numero-1);
		}
		
	}

}
