package SolucionBuilder;

import emsamablajecomputadoras.creacional.*;


public class AsusROGEBuilder extends ComputadoraBuilder{

	@Override
	public void definirComputador() {
		c= new Computador();
		c.setMarca("Asus");
		c.setModelo("ROG");
		
		
	}



	@Override
	public void construirSO() {
		
	}

	@Override
	public void construirMainboard() {
		
	}

	

}
