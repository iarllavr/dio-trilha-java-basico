public class Carro extends Veiculo {
    
    @Override
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void conferirCombustivel(){
        System.out.println("Conferindo combustível...");
    }

    private void conferirCambio(){
        System.out.println("Conferindo cambio em P...");
    }
    
}
