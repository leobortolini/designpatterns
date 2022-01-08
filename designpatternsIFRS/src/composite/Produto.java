
// LEAF (FOLHA)

// A classe Produto implementa a interface Item, representando um Produto simples.

package composite;

public class Produto implements Item {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Retorna o preço do produto
	@Override
	public double calcularPrecoFinal() {
		return preco;
	}

}


