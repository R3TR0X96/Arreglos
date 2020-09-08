package Modelo;

public class ArregloUnidimesional {
	public int[] lista;

	public ArregloUnidimesional(int[] lista) {
		this.lista = lista;

	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public int traerElMenor() {
		int aux2 = lista[0];
		for (int i = 0; i < lista.length; i++) {
			if (aux2 > lista[i]) {
				aux2 = lista[i];
			}
		}
		return aux2;
	}

	public int traerElMayor() {
		int aux2 = lista[0];
		for (int i = 0; i < lista.length; i++) {
			if (aux2 < lista[i]) {
				aux2 = lista[i];
			}
		}
		return aux2;
	}

	public double calcularPromedio() {
		float aux = 0;
		for (int i = 0; i < lista.length; i++) {
			aux += lista[i];

		}
		float resultado = aux / lista.length;
		return resultado;
	}

	public int[] ordenarAcendente() {
		int aux;
		for (int i = 0; i <= lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
				}
			}

		}
		return lista;
	}

	public int[] ordenarDesendente() {

		int aux;
		for (int i = 0; i <= lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] < lista[j + 1]) {
					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
				}
			}
		}
		return lista;
	}

	public int traerFrecuencia(int numero) {
		int aux = 0;
		for (int i = 0; i > lista.length; i++) {
			if (numero == lista[i]) {
				aux++;
			}

		}
		return aux;
	}
	
	public int traerModa() {
		int maximoNumRepeticiones= 0;
	    int moda= 0;

	    for(int i = 0; i < lista.length; i++){
	    	
	        int numRepeticiones = 0;
	        
	        for(int j = 0; j < lista.length; j++){
	        	
	            if(lista[i] == lista[j]){
	            	
	                numRepeticiones++;
	                
	            }
	            if(numRepeticiones > maximoNumRepeticiones){
	            	
	                moda = lista[i];
	                
	                maximoNumRepeticiones = numRepeticiones;
	            }  
	        }
	    }
	    return moda;
	  }

}