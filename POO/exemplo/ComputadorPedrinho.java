public class ComputadorPedrinho {
    public static void main(String[] args) {

        System.out.println("MSN");
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
        tlg.receberMensagem();
    }

}
