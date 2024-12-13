package main;

import java.math.BigDecimal;

import modelo.Cliente;
import modelo.Produto;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;
import service.AtivacaoClienteService;
import service.EmissaoNotaFiscalService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888" );
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "2577768422");
		Cliente jose = new Cliente("José", "jose@xyz.com", "6455553577");
		Cliente claudia = new Cliente("Claudia", "claudia@xyz.com", "7788849998");
		Produto xicara = new Produto("xicara", new BigDecimal("25.30"));
		
		Notificador notificador = new NotificadorEmail();
		Notificador notificadorSMS = new NotificadorSMS();
;		
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		
		EmissaoNotaFiscalService emissaoCliente = new EmissaoNotaFiscalService(notificadorSMS);
		emissaoCliente.emitir(jose, xicara);
		emissaoCliente.emitir(claudia, xicara);
		
	}
}
