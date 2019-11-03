package tpe;

public class EdadFiltroMen implements Filtro {
	int edad;
	
	public EdadFiltroMen(int edadMeses) {
		edad = edadMeses;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getEdad() < getEdad();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
