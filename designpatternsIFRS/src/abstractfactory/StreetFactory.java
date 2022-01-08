package abstractfactory;

/*
 * Classe factory de veículos street, extende a factory abstrata
 */
public class StreetFactory extends AbstractFactory {

	@Override
	Veiculo getVeiculo(String modeloVeiculo) {
		if (modeloVeiculo.equalsIgnoreCase("X")) {
			return new XStreet();
		} else if (modeloVeiculo.equalsIgnoreCase("Y")) {
			return new YStreet();
		}
		return null;
	}

}
