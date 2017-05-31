package Ordenamiento;

import java.util.ArrayList;

/**
 * 
 * @author Bryan
 *
 * @param <E>
 */

///para arrays
public class BubbleSort<E> {

	public static<E extends Comparable<E>> void bubbletArray(E[] arr) {
	    for (int j = arr.length - 1; j >= 0; j--) {
	        for (int i = 1; i <= j; i++) {
	            if (arr[i-1].compareTo(arr[i]) > 0) {
	                E tmp = arr[i-1];
	                arr[i-1] = arr[i];
	                arr[i] = tmp;
	            }
	        }
	    }
	}
	
///para array list
	public static <E extends Comparable<E>>void bubbleArrayList(ArrayList<E> arr)
	{
		for(int j=0;j<arr.size();j++){
			
			for(int i=j+1;i<arr.size();i++){
				if((arr.get(i)).compareTo(arr.get(j))<0){
					
					E t = arr.get(j);
					arr.set(j, arr.get(i));
					arr.set(i, t);
				}
			}
		}
	  }
	
/// para listas enlazadas
	public static <T extends Comparable<T>>void bubbleLinkedList(Nodo<T> head)
	{
	        Nodo<T> i, j;
	        i = head;
	        T temp;
	        
	        {
	            for (i = head; i!=null; i=i.getSiguiente()) // bubble sort outer loop
	            {
	                for (j=i.getSiguiente(); j!=null; j= j.getSiguiente()) {
	                    if ((i.getDato()).compareTo(j.getDato())>0)
	                    {
	                        temp = i.getDato();
	                        i.setDato(j.getDato());
	                        j.setDato(temp);
	                    }
	                }
	            }
	        }
	  }
}

