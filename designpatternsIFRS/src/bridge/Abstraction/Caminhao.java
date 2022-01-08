package bridge.Abstraction;

import bridge.Implementation.Transporte;

public class Caminhao extends Veiculo {

    public Caminhao(String marca, Transporte transporte) {
        super(marca, transporte);
    }

    @Override
    public void realizarAtividade() {
        System.out.print(" Caminhão " + marca + ": ");
        this.transporte.transportar();
    }
}
