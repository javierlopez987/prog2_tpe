package tpe;

public class Categoria {
	Filtro criterio;
	String categoria;
	
	public Categoria (Filtro criterio, String denominacion) {
		this.criterio = criterio;
		this.categoria = denominacion;
	}

	public Filtro getCriterio() {
		return criterio;
	}

	public void setCriterio(Filtro criterio) {
		this.criterio = criterio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
