package tpe;

public class TernerosParidosFiltroMay implements Filtro {
	int ternerosParidos;
	
	public TernerosParidosFiltroMay(int t) {
		ternerosParidos = t;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getTernerosParidos() > getTernerosParidos();
	}

	public int getTernerosParidos() {
		return ternerosParidos;
	}

	public void setTernerosParidos(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
	}
	
}
