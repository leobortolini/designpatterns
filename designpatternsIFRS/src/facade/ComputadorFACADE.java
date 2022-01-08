package facade;


public class ComputadorFACADE {

	public HardDrive harddrive;
	public Memoria memoria;
	public Processador processador;
	
	public ComputadorFACADE() {
		
		this.harddrive = new HardDrive();
		this.memoria = new Memoria();
		this.processador = new Processador();
		
		}
	
	public void Executar() {
		harddrive.leDado();
		memoria.CarregaDado();
		processador.ProcessaDado();
		
		
	}


	
}
