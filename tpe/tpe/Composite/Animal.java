package tpe.Composite;

import java.util.ArrayList;
import java.util.List;

import tpe.Camion;
import tpe.Filtros.Filtro;

public class Animal extends ElementoGanadero{
	int id;
	int edadMeses;
	int peso;
	String raza;
	String sexo;
	boolean isCapado;
	int ternerosParidos;
	
	public Animal(int id, int edadMeses, int peso, String raza, String sexo) {
		this.id = id;
		this.edadMeses = edadMeses;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.isCapado = false;
		this.ternerosParidos = 0;
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

	public String getSexo() {
		return sexo;
	}

	public int getTernerosParidos() {
		return ternerosParidos;
	}
	
	public boolean isCapado() {
		return isCapado;
	}
	
	public boolean isMacho() {
		final String MACHO = "Macho";
		return this.getSexo() == MACHO;
	}

	public int getPesoTotal() {
		return peso;
	}
	
	@Override
	public int getCantidadTotal() {
		return 1;
	}

	@Override
	public int getEdadTotal() {
		return edadMeses;
	}

	@Override
	public List<Animal> buscar(Filtro f) {
		List<Animal> result = new ArrayList<>();
		if(f.cumple(this)) {
			result.add(this);
		};
		return result;
	}

	@Override
	public List<Animal> cargarCamion(Camion c) {
		List<Animal> result = new ArrayList<>();
		if(c.acepta(this)) {
			c.agregar(this);
			result.add(this);
		}
		return result;
	}
	
	public String toString() {
		String result = 
				"id: "+ this.id + " |" +
				"Edad en meses: "+ this.edadMeses +" |" +
				"Peso: "+ this.peso + " |" +
				"Raza: "+ this.raza +" |" +
				"Sexo: "+ this.sexo +" |";
		if (!this.isMacho())
				result += "Terneros paridos " + this.ternerosParidos+" |";
		return result;
	}
}
