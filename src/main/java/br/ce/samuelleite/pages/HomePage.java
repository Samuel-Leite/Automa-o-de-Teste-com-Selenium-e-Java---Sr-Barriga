package br.ce.samuelleite.pages;

import br.ce.samuelleite.core.BasePage;

public class HomePage extends BasePage {

	public String obterSaldoConta(String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}
	
}
