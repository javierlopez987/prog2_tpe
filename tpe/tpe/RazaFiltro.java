package tpe;

public class RazaFiltro implements Filtro {
	String raza;
	
	public RazaFiltro(String r) {
		// TODO Auto-generated constructor stub
		raza = r;
	}

	@Override
	public boolean cumple(Animal a) {
		// TODO Auto-generated method stub
		return a.getRaza().equals(getRaza());
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
