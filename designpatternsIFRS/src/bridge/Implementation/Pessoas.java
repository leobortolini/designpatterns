package bridge.Implementation;

/*
 * implementação da classe Pessoas, que implementa transporte, ou seja, que pode estar em alguma classe que implemente veiculo
 */
public class Pessoas implements Transporte {
    @Override
    public void transportar() {
        System.out.println("Veículo Transportando Pessoas");
    }

    @Override
    public void descricaoTransporte() {
        System.out.println("Veículo que Transporta Pessoas");
    }
}
