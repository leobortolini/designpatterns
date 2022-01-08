
/*
 * classe composite
 */
package composite;

import java.util.List;

public class Caixa implements Item {
	
	/*
	 * lista que armazena folhas e outros containers
	 */
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

	/*
	 * Percorre todos itens armazenados e coleta os precos
	 */
	@Override
	public double calcularPrecoFinal() {
		double precoFinal = 0;
		
		for (Item item : itens) {
			precoFinal += item.calcularPrecoFinal();
		}
		
		return precoFinal;
	}
}

