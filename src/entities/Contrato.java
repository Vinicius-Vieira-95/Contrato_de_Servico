package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer num;
	private Date data;
	private Double valorTotal;

	private List<Parcelas> parcela = new ArrayList<>();

	public Contrato(Integer num, Date data, Double valor) {

		this.num = num;
		this.data = data;
		this.valorTotal = valor;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valor) {
		this.valorTotal = valor;
	}

	public List<Parcelas> getParcela() {
		return parcela;
	}

	public void adcionarParcela(Parcelas parcela) {
		this.parcela.add(parcela);
	}
	
	public void removerParcela(Parcelas parcela) {
		this.parcela.remove(parcela);
	}
	
	
	
	
	
	
	
	
}
