	package tpe;

import tpe.Composite.Animal;
import tpe.Composite.ElementoGanadero;
import tpe.Composite.GrupoGanadero;
import tpe.Filtros.AndFiltro;
import tpe.Filtros.EdadFiltroMay;
import tpe.Filtros.Filtro;
import tpe.Filtros.RazaFiltro;
import tpe.Filtros.SexoFiltro;
import tpe.Filtros.TernerosParidosFiltroMay;

public class ProgramaGanadero {

	public static void main(String[] args) {
		SistemaGanadero administracion = new SistemaGanadero();
		ElementoGanadero central = new GrupoGanadero();
		administracion.setNodoPrincipal(central);
		
		ElementoGanadero establecimientoLecheroHolando = new GrupoGanadero();
		ElementoGanadero lechera1 = new Animal(1001, 36, 950, "Holando", "Hembra");
		ElementoGanadero lechera2 = new Animal(1002, 40, 900, "Holando", "Hembra");
		ElementoGanadero lechera3 = new Animal(1003, 34, 925, "Holando", "Hembra");
		ElementoGanadero lechera4 = new Animal(1004, 32, 930, "Holando", "Hembra");
		ElementoGanadero lechera5 = new Animal(1005, 30, 910, "Holando", "Hembra");
		ElementoGanadero lechera6 = new Animal(1006, 40, 940, "Holando", "Hembra");
		((GrupoGanadero) establecimientoLecheroHolando).agregar(lechera1);
		((GrupoGanadero) establecimientoLecheroHolando).agregar(lechera2);
		((GrupoGanadero) establecimientoLecheroHolando).agregar(lechera3);
		((GrupoGanadero) establecimientoLecheroHolando).agregar(lechera4);
		((GrupoGanadero) establecimientoLecheroHolando).agregar(lechera5);
		((GrupoGanadero) establecimientoLecheroHolando).agregar(lechera6);
		
		ElementoGanadero establecimientoCriaHereford = new GrupoGanadero();
		ElementoGanadero rodeoHereford1 = new GrupoGanadero();
		ElementoGanadero animal501 = new Animal(1101, 48, 550, "Hereford", "Hembra");
		ElementoGanadero animal502 = new Animal(1102, 48, 620, "Hereford", "Hembra");
		ElementoGanadero reproductor1 = new Animal(1001, 48, 900, "Hereford", "Macho");
		((GrupoGanadero) rodeoHereford1).agregar(animal501);
		((GrupoGanadero) rodeoHereford1).agregar(animal502);
		((GrupoGanadero) rodeoHereford1).agregar(reproductor1);
		
		ElementoGanadero rodeoHereford2 = new GrupoGanadero();
		ElementoGanadero animal601 = new Animal(1201, 48, 550, "Hereford", "Hembra");
		ElementoGanadero animal602 = new Animal(1202, 48, 560, "Hereford", "Hembra");
		ElementoGanadero animal603 = new Animal(1203, 48, 580, "Hereford", "Hembra");
		ElementoGanadero animal604 = new Animal(1204, 48, 590, "Hereford", "Hembra");
		ElementoGanadero animal605 = new Animal(1205, 48, 600, "Hereford", "Hembra");
		ElementoGanadero animal606 = new Animal(1206, 48, 600, "Hereford", "Hembra");
		ElementoGanadero animal607 = new Animal(1207, 48, 600, "Hereford", "Hembra");
		ElementoGanadero animal608 = new Animal(1208, 48, 600, "Hereford", "Hembra");
		ElementoGanadero animal609 = new Animal(1209, 48, 600, "Hereford", "Hembra");
		ElementoGanadero animal610 = new Animal(1210, 48, 600, "Hereford", "Hembra");
		((GrupoGanadero) rodeoHereford2).agregar(animal601);
		((GrupoGanadero) rodeoHereford2).agregar(animal602);
		((GrupoGanadero) rodeoHereford2).agregar(animal603);
		((GrupoGanadero) rodeoHereford2).agregar(animal604);
		((GrupoGanadero) rodeoHereford2).agregar(animal605);
		((GrupoGanadero) rodeoHereford2).agregar(animal606);
		((GrupoGanadero) rodeoHereford2).agregar(animal607);
		((GrupoGanadero) rodeoHereford2).agregar(animal608);
		((GrupoGanadero) rodeoHereford2).agregar(animal609);
		((GrupoGanadero) rodeoHereford2).agregar(animal610);
		
		((GrupoGanadero) establecimientoCriaHereford).agregar(rodeoHereford1);
		((GrupoGanadero) establecimientoCriaHereford).agregar(rodeoHereford2);
		
		ElementoGanadero reproductorIndependiente = new Animal(1001, 48, 1100, "Hereford", "Macho");
		((GrupoGanadero) central).agregar(reproductorIndependiente);
		
		ElementoGanadero establecimientoInvernadaAberdeenAngus = new GrupoGanadero();
		ElementoGanadero animal100 = new Animal(1001, 6, 280, "Aberdeen Angus", "Macho");
		ElementoGanadero animal200 = new Animal(1001, 8, 380, "Aberdeen Angus", "Macho");
		ElementoGanadero animal300 = new Animal(1001, 12, 480, "Aberdeen Angus", "Macho");
		ElementoGanadero animal400 = new Animal(1001, 16, 600, "Aberdeen Angus", "Macho");
		ElementoGanadero animal500 = new Animal(1001, 10, 400, "Aberdeen Angus", "Macho");
		ElementoGanadero animal600 = new Animal(1001, 20, 650, "Aberdeen Angus", "Macho");
		ElementoGanadero animal700 = new Animal(1001, 14, 500, "Aberdeen Angus", "Macho");
		ElementoGanadero animal800 = new Animal(1001, 12, 450, "Aberdeen Angus", "Macho");
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal100);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal200);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal300);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal400);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal500);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal600);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal700);
		((GrupoGanadero) establecimientoInvernadaAberdeenAngus).agregar(animal800);
		
		ElementoGanadero establecimientoCriaAberdeenAngus = new GrupoGanadero();
		ElementoGanadero animal1100 = new Animal(1101, 48, 520, "Aberdeen Angus", "Hembra");
		ElementoGanadero animal1200 = new Animal(1102, 48, 560, "Aberdeen Angus", "Hembra");
		ElementoGanadero reproductor100 = new Animal(1001, 48, 850, "Aberdeen Angus", "Macho");
		((GrupoGanadero) establecimientoCriaAberdeenAngus).agregar(animal1100);
		((GrupoGanadero) establecimientoCriaAberdeenAngus).agregar(animal1200);
		((GrupoGanadero) establecimientoCriaAberdeenAngus).agregar(reproductor100);
		
		((GrupoGanadero) central).agregar(establecimientoLecheroHolando);
		((GrupoGanadero) central).agregar(establecimientoCriaHereford);
		((GrupoGanadero) central).agregar(establecimientoInvernadaAberdeenAngus);
		((GrupoGanadero) central).agregar(establecimientoCriaAberdeenAngus);
		((GrupoGanadero) central).agregar(reproductorIndependiente);
		Filtro vaca = new SexoFiltro("Hembra");
		Filtro raza1 = new RazaFiltro("Aberdeen Angus");
		Filtro vaquillona = new EdadFiltroMay(15);
		Filtro noMadre = new TernerosParidosFiltroMay(-1);
		Filtro And = new AndFiltro(vaca, vaquillona);
		Filtro And2 = new AndFiltro(And, noMadre);
		administracion.addCategoriaDeClasificacion(vaca, "Hembra");
		administracion.addCategoriaDeClasificacion(And2, "Vaquillona");
		administracion.addCategoriaDeClasificacion(raza1, "Raza Negra");
		administracion.addCategoriaDeClasificacion(noMadre, "No madre");
		
		
		System.out.println("Animales: " + administracion.getCantidad());
		System.out.println(administracion.clasificar((Animal) animal1100));
	}

}
