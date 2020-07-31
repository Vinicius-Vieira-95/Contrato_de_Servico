package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

	private Date vencimento;
	private Double quantia;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelas(Date vencimento, Double quantia) {
		
		this.vencimento = vencimento;
		this.quantia = quantia;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}
	
	@Override
	public String toString() {
		return sdf.format(vencimento) +" - "+ String.format("%.2f", quantia); //retornando data e valor das parcelas
	}
	
	
}
