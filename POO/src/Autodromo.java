public class Autodromo {
    public static void main(String[] args){
        Carro jeep = new Carro();
//        jeep.conferirCambio();
//        jeep.conferirCombustivel();
        jeep.ligar();
        jeep.setChassi("123654");

        Moto z400 = new Moto();
        z400.setChassi("321456");
        z400.ligar();
        
        Veiculo coringa = z400;
        coringa.ligar();

    }
}