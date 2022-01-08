
package composite;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Caixa caixaMaster = new Caixa(new ArrayList<Item>()); 
		
		caixaMaster.addItem(new Produto("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));
		
		Caixa caixaSmartphones = new Caixa(new ArrayList<Item>());
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S21 Ultra 5G", 6191.10));
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S20 FE", 2189));
		caixaSmartphones.addItem(new Produto("iPhone 13", 7599));
		caixaSmartphones.addItem(new Produto("iPhone 13 mini", 6599));
		caixaMaster.addItem(caixaSmartphones);
		
		Caixa caixaNotebooks = new Caixa(new ArrayList<Item>());
		caixaNotebooks.addItem(new Produto("Acer Nitro AN515-44-R5YZ", 5499));
		caixaNotebooks.addItem(new Produto("Dell G15", 5301));
		caixaMaster.addItem(caixaNotebooks);
		
		Caixa caixaFerramentas = new Caixa(new ArrayList<Item>());
		caixaFerramentas.addItem(new Produto("Martelo de Unha 25mm", 37.30));
		caixaFerramentas.addItem(new Produto("Trena 5m", 17.10));
		caixaFerramentas.addItem(new Produto("Alicate 7", 25));
		caixaFerramentas.addItem(new Produto("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
		caixaMaster.addItem(caixaFerramentas);
		
		System.out.println("VALOR TOTAL = " + caixaMaster.calcularPrecoFinal());
	}
}

