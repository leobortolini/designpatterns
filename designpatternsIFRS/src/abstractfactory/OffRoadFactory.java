package abstractfactory;

public class OffRoadFactory extends AbstractFactory {
	@Override
	public Veiculo getVeiculo(String modeloVeiculo) {
		if (modeloVeiculo.equalsIgnoreCase("X")) {
			return new XOffRoad();
		} else if (modeloVeiculo.equalsIgnoreCase("Y")) {
			return new YOffRoad();
		}
		return null;
	}
}