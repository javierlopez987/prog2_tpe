package tpe.Filtros;

import tpe.Composite.Animal;

public class EdadFiltroMay implements Filtro {
	int edad;
	
	public EdadFiltroMay(int edadMeses) {
		edad = edadMeses;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getEdad() > getEdad();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
