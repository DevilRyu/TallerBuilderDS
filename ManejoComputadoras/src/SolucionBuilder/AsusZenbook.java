package SolucionBuilder;


public class AsusZenbook extends ComputadoraBuilder{
	@Override
	public void definirComputador() {
		c= new Computador();
		c.setMarca("Asus");
		c.setModelo("Zenbook");
		
		
	}

	

	@Override
	public void construirSO() {
		SistemaOperativo so= new SistemaOperativo();
		so.setNombre("Windows");
		so.setVersion("10 HOME");
				so.setArquitectura(64);
				c.setSo(so);
	}

	@Override
	public void construirMainboard() {
Mainboard mb= new Mainboard("prime","z370");
		
		c.setPlaca(mb);
	}
	

	
}
