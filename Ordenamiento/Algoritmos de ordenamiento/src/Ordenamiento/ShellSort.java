package Ordenamiento;

import java.util.ArrayList;

public class ShellSort<E> {
	
	//para arrays
	public static <E extends Comparable<E>> void shellArray(E[] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j].compareTo(v[j - incremento]) < 0) {
                        E tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
	
	//para arraylist
	public static <E extends Comparable<E>> void shellArrayList(ArrayList<E> v) {
        final int N = v.size();
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v.get(j).compareTo(v.get(j-incremento)) < 0) {
                        E tmp = v.get(j);
                        v.set(j, v.get(j-incremento));
                        v.set(j-incremento, tmp);
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
	
	//para linkedlist
	
	
	public static <E extends Comparable<E>> void shellLinked(Nodo<E> v, Lista<E> list) {
        final int N = list.size;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && list.ObtDato(j).compareTo(list.ObtDato(j-incremento)) < 0) {
                        E tmp = list.ObtDato(j);
                        list.ModDato(j, list.ObtDato(j-incremento));         
                        list.ModDato(j-incremento,  tmp);	
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
	

}
