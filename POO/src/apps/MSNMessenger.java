public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

/* encapsulamento: métodos privados inseridos dentro de um método público para que possam ser executados 
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
    }
    */  


}
