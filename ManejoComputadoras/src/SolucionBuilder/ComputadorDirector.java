package SolucionBuilder;

public class ComputadorDirector {

	private ComputadoraBuilder builder ;
	
	public ComputadorDirector (ComputadoraBuilder builder) {
		this.builder = builder;
	}
	
	public void ContruirComputadora() {
		
		builder.definirComputador();
		builder.construirSO();
		builder.construirMainboard();
		
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
