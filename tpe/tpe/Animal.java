package tpe;

public class Animal extends ElementoGanadero{
	int id;
	int edadMeses;
	int peso;
	String raza;
	String sexo;
	boolean isCapado;
	int ternerosParidos;
	
	public String getRaza() {
		return raza;
	}

	public int getId() {
		return id;
	}

	public int getEdadMeses() {
		return edadMeses;
	}

	public int getPeso() {
		return peso;
	}

	public String getSexo() {
		return sexo;
	}

	public boolean isCapado() {
		return isCapado;
	}

	public int getTenerosParidos() {
		return ternerosParidos;
	}
	
}
