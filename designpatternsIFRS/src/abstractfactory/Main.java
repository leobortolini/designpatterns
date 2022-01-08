package abstractfactory;

public class Main {

	public static void main(String[] args) {
		/*
		 * Criação da factory de veículos offroad
		 */
		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");
		
		/*
		 * Instanciando 2 veiculos por meio da factory offroad
		 */
		Veiculo carro1 = offRoadFactory.getVeiculo("X");
		carro1.method();
		
		Veiculo carro2 = offRoadFactory.getVeiculo("Y");
		carro2.method();
		
		/*
		 * Criação da factory de veículos street
		 */
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		
		/*
		 * Instanciando 2 veiculos por meio da factory street
		 */
		Veiculo carro3 = streetFactory.getVeiculo("X");
		carro3.method();
		
		Veiculo carro4 = streetFactory.getVeiculo("Y");
		carro4.method();
	}
}
