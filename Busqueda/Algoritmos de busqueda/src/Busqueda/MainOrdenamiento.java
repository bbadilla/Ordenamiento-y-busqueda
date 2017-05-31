package Busqueda;

public class MainOrdenamiento {

	public static void main(String[] args) {
		
		// Array usado para las pruebas
		int[]vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82}; 
		
		// Para busqueda binaria
		Binary_Search A = new Binary_Search();
		int valorBuscado = 70; 
		System.out.println(A.busquedaBinaria(vector,valorBuscado));
		
		// Para Interpolation Search
		InterpolationSearch B = new InterpolationSearch();
		int valorBuscado1 = 4; 
		System.out.println(B.interpolationSearch(vector,valorBuscado1));

	}

}
