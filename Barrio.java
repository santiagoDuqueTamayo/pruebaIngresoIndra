package barrio;

import java.util.ArrayList;
import java.util.List;

public class Barrio {

	private Integer[] estadoInicialCasas= new Integer[8];


	/**
	 * Constructor vacio de la clase barrio
	 */
	public Barrio() {}
	
	/**
	 * metodo que me permite llenar una lista de arreglos con el numero de dias
	 * que ingrese el usuario
	 * @param dias
	 * @return una lista con los arreglosde las salidas
	 */
	public List<Integer[]> llenarListaPorDias(int dias) {
		List <Integer[]> listaCasasPorDia=new ArrayList<Integer[]>();
		for (int i = 1; i <= dias; i++) {
			listaCasasPorDia.add(llenarLista());
		}
		return listaCasasPorDia;
	}
	/**
	 * metodo que llena una lista por cada dia
	 * @return una lista por dia
	 */
	public Integer[] llenarLista(){
		Integer[] salidaCasas=new Integer[8];
		llenarPrimeraPos(salidaCasas);
		llenarUltimaPos(salidaCasas);
		for (int i = 1; i <= salidaCasas.length-2; i++) {
			if (estadoInicialCasas[i-1]==estadoInicialCasas[i+1]) {
				salidaCasas[i]=0;
				
			}else{
				salidaCasas[i]=1;
			}
		}
		estadoInicialCasas=salidaCasas;
		return salidaCasas;
	}
	/**
	 * Llena la primera posicion de la lista
	 * @param salidaCasas lista en el dia n
	 */
	public void llenarPrimeraPos(Integer[] salidaCasas){
		if (estadoInicialCasas[1]==0) {
			salidaCasas[0]=0;
			
		} else{
			salidaCasas[0]=1;
		}
		
	}
	/**
	 * llena la lista en la ultima posicion
	 * @param salidaCasas lista en el dia n
	 */
	public void  llenarUltimaPos(Integer[] salidaCasas) {

		if (estadoInicialCasas[estadoInicialCasas.length-2]==0) {
			salidaCasas[estadoInicialCasas.length-1]=0;
		} else{
			salidaCasas[estadoInicialCasas.length-1]=1;
		}

	}
	
	/**
	 * @return the estadoInicialCasas
	 */
	public Integer[] getEstadoInicialCasas() {
		return estadoInicialCasas;
	}

	/**
	 * @param estadoInicialCasas the estadoInicialCasas to set
	 */
	public void setEstadoInicialCasas(Integer[] estadoInicialCasas) {
		this.estadoInicialCasas = estadoInicialCasas;
	}

}
