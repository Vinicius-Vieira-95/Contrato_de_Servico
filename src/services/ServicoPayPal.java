package services;

public class ServicoPayPal implements ServicoDePagamento {

	public static final Double taxaDePagamento = 0.02;
	public static final Double taxaSimples = 0.01;
	
	public Double taxaDePagamento(Double valor) { //calculo da taxa
		return valor * taxaDePagamento;
	}
	
	public Double jurosMensal(Double valor, Integer mes) { 
		return valor * taxaSimples * mes;
	}
	
}
