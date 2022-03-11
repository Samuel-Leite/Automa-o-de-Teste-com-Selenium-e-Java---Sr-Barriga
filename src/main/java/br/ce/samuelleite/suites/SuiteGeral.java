package br.ce.samuelleite.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.samuelleite.core.DriverFactory;
import br.ce.samuelleite.pages.LoginPage;
import br.ce.samuelleite.tests.ContaTest;
import br.ce.samuelleite.tests.MovimentacaoTest;
import br.ce.samuelleite.tests.RemoverMovimentacaoContaTest;
import br.ce.samuelleite.tests.ResumoTeste;
import br.ce.samuelleite.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTeste.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("samuel@leite");
		page.setSenha("123456");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}
