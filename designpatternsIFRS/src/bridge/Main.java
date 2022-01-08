package bridge;

import bridge.Abstraction.Caminhao;
import bridge.Abstraction.Onibus;
import bridge.Abstraction.Veiculo;
import bridge.Implementation.Cargas;
import bridge.Implementation.Pessoas;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");
        /*
         * Instanciando um caminhao, e realizando sua atividade com Cargas
         */
        Veiculo caminhao = new Caminhao("Scania", new Cargas());
        caminhao.realizarAtividade();

        System.out.println(" ---------------------------------------- ");

        /*
         * Instanciando um onibus, e realizando sua atividade com pessoas
         */
        Veiculo onibus = new Onibus("Mercedes", new Pessoas());
        onibus.realizarAtividade();

        System.out.println(" ---------------------------------------- ");
    }
}
