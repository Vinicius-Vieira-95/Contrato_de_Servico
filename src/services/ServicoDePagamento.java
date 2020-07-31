package services;

public interface ServicoDePagamento {

	
	public Double taxaDePagamento(Double valor);
	
	public Double jurosMensal(Double valor, Integer mes);
	
}
