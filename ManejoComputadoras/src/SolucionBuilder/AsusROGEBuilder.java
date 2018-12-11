package SolucionBuilder;


public class AsusROGEBuilder extends ComputadoraBuilder{

	@Override
	public void definirComputador() {
		c= new Computador();
		c.setMarca("Asus");
		c.setModelo("ROG");
		
		
	}



	@Override
	public void construirSO() {
		SistemaOperativo so= new SistemaOperativo();
		so.setNombre("Windows");
		so.setVersion("10 PRO");
				so.setArquitectura(64);
				c.setSo(so);
	}

	@Override
	public void construirMainboard() {
		Mainboard mb= new Mainboard("Strix","x99");
		
		c.setPlaca(mb);
	}

	

}
