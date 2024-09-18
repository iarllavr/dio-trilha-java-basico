public abstract class ServicoMensagemInstantanea {
/*  Herança: todas as classes executam o método da mesma maneira
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagens();
    }
    
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagens(){
        System.out.println("Salvando histórico de mensagens");
    } */

    //Abstração: cada classe determina a maneira de execução dos métodos
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

}
