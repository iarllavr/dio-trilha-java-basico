public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        //App ainda não foi definido mas qualquer um deverá enviar e receber mensagem

        String appEscolhido = "fb";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fb")){
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        /* System.out.println("MSN");
        //abrindo MSNMessenger
        MSNMessenger msn = new MSNMessenger();
        //msn.validarConectadoInternet();
        msn.enviarMensagem();
        //msn.salvarHistoricoMensagens();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem(); */
    }

}
