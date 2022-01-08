package abstractfactory;
/*
 * Classe que instancia e retorna as factories, dependendo do parâmetro
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String variante) {
		if (variante.equalsIgnoreCase("OffRoad")) {
			return new OffRoadFactory();
		} else if (variante.equalsIgnoreCase("Street")) {
			return new StreetFactory();
		}
		return null;
	}
}
