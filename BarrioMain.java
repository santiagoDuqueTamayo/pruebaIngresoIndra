package barrio;

import java.util.List;
import java.util.Scanner;

public class BarrioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedimos el numero de dias
		System.out.println("ingrese el numero de días que desea analizar");
		Scanner lectorDias = new Scanner(System.in);
		int dias=lectorDias.nextInt();
		Integer[] casas= new Integer[8];
		int i=0;
		//llenamos el arreglo
		while (i<casas.length) {
			System.out.println("ingrese el elemento numero "+i);
			Scanner lectorLista = new Scanner(System.in);
				casas[i]=lectorLista.nextInt();
				i++;
			} 
		// creamos la instancia para llamar los metodos
		Barrio barrio= new Barrio();
		barrio.setEstadoInicialCasas(casas);
		List<Integer[]> lista=barrio.llenarListaPorDias(dias);
		String salidaEstadoCasas="";
		String entradaEstadoCasas="";
		// recorremos el arreglo para sacar el resultado
			for (int j = 0; j < lista.get(lista.size()-1).length; j++) {
				salidaEstadoCasas+=" "+lista.get(lista.size()-1)[j]+", ";
				entradaEstadoCasas+=" "+casas[j]+", ";
			}
		// imprimimos resultados
		System.out.println("estado de entrada de casas");	
		System.out.println(entradaEstadoCasas);
		System.out.println("estado de salida de casas después de "+dias+" dias");
		System.out.println(salidaEstadoCasas);
	}

}
