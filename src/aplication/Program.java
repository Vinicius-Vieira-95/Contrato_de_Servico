package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import services.ServicoDeContratoo;
import services.ServicoPayPal;

/*
 * Este Programa tem o papel de receber entreda com o numero do contrato e a data
 * do dia do contrato, onde recebe do usuario o valor de um certo contrato e 
 * parcelas do mesmo. A o final da execução o programa dará a quantia dos valores das
 * parcelas com acrescimo de juros de um serviço.
 * 
 */

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("#Contrato#");
		System.out.print("Numero: ");
		Integer num = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy) :");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		Double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(num,data,valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		Integer parcelas = sc.nextInt();
		
		ServicoDeContratoo sdc = new ServicoDeContratoo(new ServicoPayPal());
		
		sdc.processoDoContrato(contrato, parcelas);
		
		System.out.println();
		System.out.println("#PARCELAS#");
		
		for(Parcelas x : contrato.getParcela()) {
			System.out.println(x.toString());
			
		}
		
		sc.close();
	}

}
