package SolucionBuilder;


public abstract class ComputadoraBuilder {
protected Computador c;

public Computador getComputador() {
	return c;
}

public abstract void definirComputador();
public abstract void construirSO();
public abstract void construirMainboard();


}

