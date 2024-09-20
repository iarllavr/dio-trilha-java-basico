package funcoes.aparelho;
import funcoes.internet.Internet;
import funcoes.musica.Musica;
import funcoes.telefone.Telefone;

public class Iphone implements Internet, Musica, Telefone {

    @Override
    public void ligar() {
        System.out.println("LIGANDO NO IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO NO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA NO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA NO IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA NO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA NO IPHONE");
    }
}
