package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcelas;

public class ServicoDeContratoo {

	private ServicoDePagamento sdp;

	public ServicoDeContratoo(ServicoDePagamento sdp) { //construtor
		this.sdp = sdp;
	}

	public void processoDoContrato(Contrato contrato, Integer mes) {
		Double valor = contrato.getValorTotal() / mes;

		for (int i = 1; i <= mes; i++) { //acrescimo de juros do serviço.

			Date data = addMes(contrato.getData(), i);
			double quantAtualizada = valor + sdp.jurosMensal(valor, i);
			double quant = quantAtualizada + sdp.taxaDePagamento(valor);
			contrato.adcionarParcela(new Parcelas(data, quant));

		}

	}

	private Date addMes(Date data, int i) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, i);
		return cal.getTime();

	}

}
