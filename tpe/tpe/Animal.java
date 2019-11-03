package tpe;

import java.util.List;

public class Animal extends ElementoGanadero{
	int id;
	int edadMeses;
	int peso;
	String raza;
	String sexo;
	boolean isCapado;
	int ternerosParidos;
	
	public Animal(int i, int e, int p, String r, String s) {
		id = i;
		edadMeses = e;
		peso = p;
		raza = r;
		sexo = s;
		isCapado = false;
		ternerosParidos = 0;
	}
	
	public void parir(int terneros) {
		if(terneros > 0) {
			ternerosParidos += terneros;
		}
	}
	
	public void capar() {
		isCapado = true;
	}

	public void setEdadMeses(int edadMeses) {
		this.edadMeses = edadMeses;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public int getId() {
		return id;
	}

	public int getPeso() {
		return peso;
	}

	public String getSexo() {
		return sexo;
	}

	public int getTernerosParidos() {
		return ternerosParidos;
	}
	
	public boolean isCapado() {
		return isCapado;
	}

	@Override
	public int getCantidad() {
		return 1;
	}

	@Override
	public int getEdad() {
		return edadMeses;
	}

	@Override
	public List<Animal> buscar(Filtro f) {
		// TODO Auto-generated method stub
		return null;
	}
}
