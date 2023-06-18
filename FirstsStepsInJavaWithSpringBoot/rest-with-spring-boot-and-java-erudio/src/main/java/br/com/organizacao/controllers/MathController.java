package br.com.organizacao.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	public Validations validations = new Validations();
	public OperatorHandler operator = new OperatorHandler();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			)throws Exception {
		if (validations.isNumeric(numberOne) && validations.isNumeric(numberTwo)) {
			return operator.sum(
					validations.convertToDouble(numberOne),
					validations.convertToDouble(numberTwo)
					); 
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			)throws Exception {
		if (validations.isNumeric(numberOne) && validations.isNumeric(numberTwo)) {
			return operator.sub(
					validations.convertToDouble(numberOne),
					validations.convertToDouble(numberTwo)
					);
			} else {
				return null;
			}
	}

	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double mul(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			)throws Exception {
		if (validations.isNumeric(numberOne) && validations.isNumeric(numberTwo)) {
			return operator.mult(
					validations.convertToDouble(numberOne),
					validations.convertToDouble(numberTwo)
					); 
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double div(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			)throws Exception {
		if (validations.isNumeric(numberOne) && validations.isNumeric(numberTwo)) {
			return operator.div(
					validations.convertToDouble(numberOne),
					validations.convertToDouble(numberTwo)
					); 
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/med/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double med(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			)throws Exception {
		if (validations.isNumeric(numberOne) && validations.isNumeric(numberTwo)) {
			return operator.media(
					validations.convertToDouble(numberOne),
					validations.convertToDouble(numberTwo)
					); 
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/raiz/{number}",
			method=RequestMethod.GET)
	public Double raiz(
			@PathVariable(value = "number") String number
			)throws Exception {
		if (validations.isNumeric(number)) {
			double numberr = validations.convertToDouble(number);
			return operator.raiz(numberr);
		} else {
			return null;
		}
	}
}
 