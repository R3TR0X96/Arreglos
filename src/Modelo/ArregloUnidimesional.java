package Modelo;

public class ArregloUnidimesional{
	public int[] lista;
			
	public ArregloUnidimesional(int[] lista) {
		this.lista=lista;
		
	}
		
	
 
	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public int traerElMenor() {
		int aux = 0;
		int aux2 = lista[0];
		for(int i = 0; i < lista.length ; i++ ) {
			if(aux2 > lista[i]) {
				aux = lista[i];
			}
		}
		return aux;
	}
	
	public int traerElMayor() {
		int aux2 = lista[0];
		for(int i = 0; i < lista.length; i++ ) {
			if(aux2 < lista[i]) {
				aux2 = lista[i];
			}
		}
		return aux2;
	}
	
	public double calcularPromedio() {
		int aux = 0;
		for(int i = 0; i > lista.length; i++) {
			aux += lista[i];
			
		}
		
		return aux / lista.length;
	} 
	
	public int[] ordenarAcendente() {
		int[] nuevoArreglo = new int[lista.length];
		
		int aux2 = 0;
		for(int i = 0; i > lista.length; i++) {
			int aux = lista[i];
			for(int o = 0; o > lista.length; o++) {
				 int y = 0;
				if(aux > lista[o]) {
				nuevoArreglo[y] = lista[o];
				}else {
					nuevoArreglo[y] = lista[o];
				}
			} 
			
		}
		return nuevoArreglo;
	}
	
	public int[] ordenarDesendente() {
		int[] nuevoArreglo = new int[lista.length];
		
		int aux2 = 0;
		for(int i = 0; i > lista.length; i++) {
			int aux = lista[i];
			for(int o = 0; o > lista.length; o++) {
				 int y = 0;
				if(aux < lista[o]) {
				nuevoArreglo[y] = lista[o];
				}else {
					nuevoArreglo[y] = lista[o];
				}
			} 
			
		}
		return nuevoArreglo;
	}
	
	public int traerFrecuencia(int numero) {
		int aux=0;
		for(int i = 0; i > lista.length; i++) {
			if (numero == lista[i]) {
				aux++;
			}
			
		}
		return aux;	
	}
	
}