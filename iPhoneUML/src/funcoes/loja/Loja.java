package funcoes.loja;

import funcoes.aparelho.Iphone;
import funcoes.internet.Internet;
import funcoes.musica.Musica;
import funcoes.telefone.Telefone;

public class Loja {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Internet internet = iphone;
        Musica musica = iphone;
        Telefone telefone = iphone;

        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.exibirPagina();

    }
}
