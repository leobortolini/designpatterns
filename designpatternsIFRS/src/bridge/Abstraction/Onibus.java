package bridge.Abstraction;

import bridge.Implementation.Transporte;

/*
 * implementação da classe Onibus, que extende veiculo
 */

public class Onibus extends Veiculo {

    public Onibus(String marca, Transporte transporte) {
        super(marca, transporte);
    }

    @Override
    public void realizarAtividade() {
        System.out.print(" Ônibus " + marca + ": ");
        this.transporte.transportar();
    }
}