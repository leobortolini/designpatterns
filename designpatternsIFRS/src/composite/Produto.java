package composite;

/*
 * classe que representa os produtos (folhas), implementa a interface Item
 */

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


