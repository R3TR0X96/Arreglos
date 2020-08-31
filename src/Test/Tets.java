package Test;

import java.util.Arrays;

import Modelo.ArregloUnidimesional;

public class Tets {
	public static void main(String[] args)  {
		int[] lista = new int [5];
		
		lista[0] = 1;
		lista[1] = 3;
		lista[2] = 2;
		lista[3] = 3;
		lista[4] = 4;
		
		ArregloUnidimesional objetoLista = new ArregloUnidimesional(lista);
		System.out.println(objetoLista.traerElMayor());
		
		
		System.out.println(Arrays.toString(lista));
	}
}
