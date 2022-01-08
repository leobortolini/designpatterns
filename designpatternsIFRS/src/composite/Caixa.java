
// COMPOSITE (CONTÊINER)

// A classe Caixa implementa a interface Item, representando um Produto composto.
// Um objeto Caixa pode conter Produtos ou até mesmo outras Caixas contendo Produtos.

package composite;

import java.util.List;

public class Caixa implements Item {
	// Lista para armazenar referências aos subelementos. 
	// Armazena tanto Folha como Contêiner, por isso deve ser declarado com um tipo de interface Componente.
	private List<Item> itens;
	
	public Caixa(List<Item> itens) {
		this.itens = itens;
	}
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	public void removeItem(Item item) {
		this.itens.remove(item);
	}

	// Percorre recursivamente todos os filhos, coletando e somando seus resultados. 
	// Como os filhos do Contêiner passam essas chamadas para seus próprios filhos e assim em diante, 
	// toda a árvore de objetos é percorrida como resultado.
	@Override
	public double calcularPrecoFinal() {
		double precoFinal = 0;
		
		for (Item item : itens) {
			precoFinal += item.calcularPrecoFinal();
		}
		
		return precoFinal;
	}
}

