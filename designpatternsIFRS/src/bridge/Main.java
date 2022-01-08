package bridge;

import bridge.Abstraction.Caminhao;
import bridge.Abstraction.Onibus;
import bridge.Abstraction.Veiculo;
import bridge.Implementation.Cargas;
import bridge.Implementation.Pessoas;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");

        Veiculo caminhao = new Caminhao("Scania", new Cargas());
        caminhao.realizarAtividade();

        System.out.println(" ---------------------------------------- ");

        Veiculo onibus = new Onibus("Mercedes", new Pessoas());
        onibus.realizarAtividade();

        System.out.println(" ---------------------------------------- ");
    }
}
