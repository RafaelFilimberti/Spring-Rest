package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	public static void main(String[] args) {
		Cliente joao = new Cliente("joão", "joao@xyz.com", "5788894578");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "5687892341");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}
}
