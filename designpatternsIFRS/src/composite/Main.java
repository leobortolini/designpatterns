
package composite;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//instancia de caixa que armazenara todo restante (nodo 0)
		Caixa caixaMaster = new Caixa(new ArrayList<Item>()); 
		
		//adicionando um item na caixa master
		caixaMaster.addItem(new Produto("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));
		
		//instanciando uma caixa que armazenara 4 smartphones
		Caixa caixaSmartphones = new Caixa(new ArrayList<Item>());
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S21 Ultra 5G", 6191.10));
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S20 FE", 2189));
		caixaSmartphones.addItem(new Produto("iPhone 13", 7599));
		caixaSmartphones.addItem(new Produto("iPhone 13 mini", 6599));
		//adicionando a caixa de smartphones na caixa master
		caixaMaster.addItem(caixaSmartphones);
		
		//instanciando a caixa de notebooks, e adicionando 2 deles
		Caixa caixaNotebooks = new Caixa(new ArrayList<Item>());
		caixaNotebooks.addItem(new Produto("Acer Nitro AN515-44-R5YZ", 5499));
		caixaNotebooks.addItem(new Produto("Dell G15", 5301));
		//adicionando a caixa de notebooks na caixa master
		caixaMaster.addItem(caixaNotebooks);
		
		//instanciando uma caixa de ferramentas, e adicionando 4 delas
		Caixa caixaFerramentas = new Caixa(new ArrayList<Item>());
		caixaFerramentas.addItem(new Produto("Martelo de Unha 25mm", 37.30));
		caixaFerramentas.addItem(new Produto("Trena 5m", 17.10));
		caixaFerramentas.addItem(new Produto("Alicate 7", 25));
		caixaFerramentas.addItem(new Produto("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
		//adicionando a caixa de ferrametnas na caixa master
		caixaMaster.addItem(caixaFerramentas);
		
		//chamando o método que percorre o valor de todos produtos, recursivamente, da caixa master
		System.out.println("VALOR TOTAL = " + caixaMaster.calcularPrecoFinal());
	}
}

