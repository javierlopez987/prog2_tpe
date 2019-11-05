package tests;

import java.util.List;

import tpe.Camion;
import tpe.SistemaGanadero;
import tpe.Composite.*;
import tpe.Filtros.*;

public class TestProgram {
	
	public static void main(String[] args)
	{
		SistemaGanadero administracion = new SistemaGanadero();
		ElementoGanadero central = new GrupoGanadero();
		administracion.setNodoPrincipal(central);
		
		Animal Vaca = new Animal(1001, 36, 950, "Holando", "Hembra");
		

		
		GrupoGanadero ganado1 = new GrupoGanadero();
		ganado1.agregar(Vaca);
		

		
		ElementoGanadero lechera1 = new Animal(1001, 36, 950, "Holando", "Macho");
		ElementoGanadero lechera2 = new Animal(1002, 40, 900, "Holando", "Hembra");
		ElementoGanadero lechera3 = new Animal(1003, 34, 925, "Holando", "Macho");
		ElementoGanadero lechera4 = new Animal(1004, 32, 930, "Holando", "Hembra");
		ElementoGanadero lechera5 = new Animal(1005, 30, 910, "Holando", "Macho");
		((Animal)lechera5).capar();
		ElementoGanadero lechera6 = new Animal(1006, 40, 940, "Holando", "Hembra");
		GrupoGanadero ganado2 = new GrupoGanadero();
		ganado2.agregar(lechera1);
		ganado2.agregar(lechera2);
		ganado2.agregar(lechera3);
		ganado2.agregar(lechera4);
		ganado2.agregar(lechera5);
		ganado2.agregar(lechera6);
		ganado1.agregar(ganado2);
		
		

		((GrupoGanadero)central).agregar(ganado1);
		


		Filtro filtroEdadMenor = new EdadFiltroMen(38);
		Filtro filtroSexoMacho = new SexoFiltro("Macho");
		Filtro filtroCompuesto = new AndFiltro(filtroEdadMenor,filtroSexoMacho);
		Camion camion1 = new Camion(1);
		Camion camion2 = new Camion(10);
		administracion.addCamionAFlota(camion1);
		administracion.addCamionAFlota(camion2);

		
		
		for(ElementoGanadero a : ((GrupoGanadero)central).getRodeo())
		{
			System.out.println(a.ToString());
		}
		
		
		System.out.println(central.getCantidad());
		System.out.println(central.getPromEdad());
		System.out.println(central.getPeso());
		System.out.println(central.getPromPeso());
		
		administracion.addCategoriaDeClasificacion(filtroSexoMacho, "TORO");
		administracion.addCategoriaDeClasificacion(filtroCompuesto, "TORO JOVEN");
		
		System.out.println(administracion.clasificar((Animal)lechera1));
		System.out.println(administracion.clasificar((Animal)lechera2));
		Filtro noCapado = new NotFiltro( new CapadoFiltro());
		List<Animal> animalesNoCapados = central.buscar(noCapado);
		
		
		for(ElementoGanadero a : animalesNoCapados)
		{
			System.out.println(a.ToString());
		}
		
		
		
	}

}
