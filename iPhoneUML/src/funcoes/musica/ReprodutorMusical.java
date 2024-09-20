package funcoes.musica;

public class ReprodutorMusical implements Musica {

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("TOCANDO MÚSICA NO REPRODUTOR MUSICAL");;
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("PAUSANDO MUSICA NO REPRODUTOR MUSICAL");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("SELECIONANDO MUSICA NO REPRODUTOR MUSICAL");
    }

}
