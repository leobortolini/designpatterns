package bridge.Abstraction;

import bridge.Implementation.Transporte;

/*
 * implementação da classe abstrata veiculo, que possuí algum objeto que implemente a interface Transporte 
 */

public abstract class Veiculo {
    protected Transporte transporte;
    protected String marca;

    protected Veiculo(String marca, Transporte transporte){
        this.transporte = transporte;
        this.marca = marca;
    }

    abstract public void realizarAtividade();
}
