/**
 * 
 */
package emsamablajecomputadoras;

import SolucionBuilder.AsusROGEBuilder;
import SolucionBuilder.*;



/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ComputadorDirector cd= new ComputadorDirector(new AsusROGEBuilder());
		// Necesito ensamblar 2 computadoras
		// AsusROGE
		cd.ContruirComputadora();
		Computador rog= cd.getComputador();
		
		// AsusZenbook
		ComputadorDirector cd1= new ComputadorDirector(new AsusZenbook());
		cd1.ContruirComputadora();
		Computador zen= cd1.getComputador();
		//Mostrar las caracteristicas de ambas computadoras 
		zen.toString();
		rog.toString();

	}

}
