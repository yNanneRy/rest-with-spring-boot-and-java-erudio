package br.com.organizacao.controllers;

import br.com.organizacao.exceptions.UnsuportedMathOperationException;

public class Validations {

	public Validations() {}

	public boolean isNumeric(String number) {
		if (number == null) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		};
		String numberr = number.replaceAll(",", ".");
		if (numberr.matches("[-+]?[0-9]*\\.?[0-9]+")){
			return true;
		} else {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
	}
	
	public Double convertToDouble(String number) {
		if (number == null)return 0D;
		String numberr = number.replaceAll(",", ".");
		if (isNumeric(numberr)) return Double.parseDouble(numberr);
		return 0D;
	}
}
