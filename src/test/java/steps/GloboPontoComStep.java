package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.openqa.selenium.WebDriver;
import pages.HomePageGloboPontoCom;
import runner.RunCucumberTest;


public class GloboPontoComStep extends RunCucumberTest {

    HomePageGloboPontoCom homePageGloboPontoCom = new HomePageGloboPontoCom(driver);

    @Dado("^que estou no site da Globo.com$")
    public void que_estou_no_site_da_Globocom() {

        homePageGloboPontoCom.acessarAplicacao();
    }

    @E("^clico no botão G1$")
    public void clico_no_botao_G1() {

        homePageGloboPontoCom.vaiParaG1();
    }

    @E("^recarrego a tela e clico no botão o globo$")
    public void recarrego_a_tela_e_clico_no_botao_o_globo() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaOGlobo();
    }

    @E("^recarrego a tela e clico no botão valor$")
    public void recarrego_a_tela_e_clico_no_botao_valor() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaValor();
    }

    @E("^recarrego a tela e clico no botão GE$")
    public void recarrego_a_tela_e_clico_no_botao_GE() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaGE();
    }

    @E("^recarrego a tela e clico no botão cartola$")
    public void recarrego_a_tela_e_clico_no_botao_cartola() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaCartola();
    }

    @E("^recarrego a tela e clico no botão globoplay$")
    public void recarrego_a_tela_e_clico_no_botao_globoplay() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaGloboPlay();
    }

    @E("^recarrego a tela e clico no botão gshow$")
    public void recarrego_a_tela_e_clico_no_botao_gshow() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaGshow();
    }

    @E("^recarrego a tela e clico no botão Quem$")
    public void recarrego_a_tela_e_clico_no_botao_Quem() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaQuem();
    }

    @E("^recarrego a tela e clico no botão receitas$")
    public void recarrego_a_tela_e_clico_no_botao_receitas() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaReceitas();
    }

    @E("^recarrego a tela e clico no botão giga gloob$")
    public void recarrego_a_tela_e_clico_no_botao_giga_gloob() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.vaiParaGigaGlobo();
    }

    @Entao("^finalizo meus testes de passar por todas as telas$")
    public void finalizo_meus_testes_de_passar_por_todas_as_telas() {

        homePageGloboPontoCom.acessarAplicacao();
        homePageGloboPontoCom.assertTela();
    }
}
