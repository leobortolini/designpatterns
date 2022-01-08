package abstractfactory;
/*
 * Classe factory abstrata 
 */
public abstract class AbstractFactory {
	abstract Veiculo getVeiculo(String modeloVeiculo);
}
