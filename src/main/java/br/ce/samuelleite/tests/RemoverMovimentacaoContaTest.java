package br.ce.samuelleite.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.samuelleite.core.BaseTeste;
import br.ce.samuelleite.core.Propriedades;
import br.ce.samuelleite.pages.ContasPage;
import br.ce.samuelleite.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTeste{

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testExcluirContaComMovimentacao() {
		
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());	
	}
}
