package funcoes.telefone;

public class AparelhoTelefonico implements Telefone {

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("LIGANDO NO APARELHO TELEFÔNICO");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("ATENDENDO NO APARELHO TELEFÔNICO");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("INICIANDO CORREIO DE VOZ NO APARELHO TELEFÔNICO");
    }

}
