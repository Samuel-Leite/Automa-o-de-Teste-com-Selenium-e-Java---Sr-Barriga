package br.ce.samuelleite.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.samuelleite.core.BaseTeste;
import br.ce.samuelleite.core.Propriedades;
import br.ce.samuelleite.pages.HomePage;
import br.ce.samuelleite.pages.MenuPage;

public class SaldoTest extends BaseTeste {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();
	
	@Test
	public void testSaldoConta() {
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}

}
