package bridge.Implementation;


/*
 * implementação da classe Cargas, que implementa transporte, ou seja, que pode estar em alguma classe que implemente veiculo
 */

public class Cargas implements Transporte {
    @Override
    public void transportar() {
        System.out.println("Veículo Transportando Cargas");
    }

    @Override
    public void descricaoTransporte() {
        System.out.println("Veículo que Transporta Cargas");
    }
}