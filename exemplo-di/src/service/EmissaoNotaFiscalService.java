package service;

import modelo.Cliente;
import modelo.Produto;
import notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;

	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		this.notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");

	}
}
