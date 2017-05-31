package Ordenamiento;

import java.util.ArrayList;

public class QuickSort {
    
	///para arrayList
  
    public static <T extends Comparable<T>> void sortArrayList(ArrayList<T> a) {
    	quicksort(a, 0, a.size()-1);
    }

    private static <T extends Comparable<T>> void quicksort (ArrayList<T> a, int i, int j) {
		if (i<j) {
		    int l = partition(a,i,j);
		    quicksort(a, i, l);
		    quicksort(a, l+1, j);
		}
    }

    private static <T extends Comparable<T>> int partition(ArrayList<T> a, int p, int q) {
		T x = a.get(p);
		int m = (p+q)/2;
		if ((a.get(p).compareTo(a.get(m))<=0 && a.get(m).compareTo(a.get(q))<=0) || (a.get(q).compareTo(a.get(m))<=0 && a.get(m).compareTo(a.get(p))<=0))
		    x = a.get(m);
		if ((a.get(p).compareTo(a.get(q))<=0 && a.get(q).compareTo(a.get(m))<=0) || (a.get(m).compareTo(a.get(q))<=0 && a.get(q).compareTo(a.get(p))<=0))
		    x = a.get(q);
		int i = p-1;
		int j = q+1;
		while (true) {
		    do i++; while (!(i>q || a.get(i).compareTo(x)>=0));
		    do j--; while (!(j<p || a.get(j).compareTo(x)<=0));
		    if (i<j) swap(a, i, j);
		    else return j;
		}
    }

    private static <T extends Comparable<T>> void swap (ArrayList<T> a, int i, int j) {
		T x;
		x = a.get(i);
		a.set(i, a.get(j)) ;
		a.set(j, x);
    }
    
    ///para array
    
    public static <T extends Comparable<T>> void sort(T[] a) {
    	quicksort(a, 0, a.length-1);
    }


    private static <T extends Comparable<T>> void quicksort (T[] a, int i, int j) {
		if (i<j) {
		    int l = partition(a,i,j);
		    quicksort(a, i, l);
		    quicksort(a, l+1, j);
		}
    }

    private static <T extends Comparable<T>> int partition(T[] a, int p, int q) {
		T x = a[p];
		int m = (p+q)/2;
		if ((a[p].compareTo(a[m])<=0 && a[m].compareTo(a[q])<=0) || (a[q].compareTo(a[m])<=0 && a[m].compareTo(a[p])<=0))
		    x = a[m];
		if ((a[p].compareTo(a[q])<=0 && a[q].compareTo(a[m])<=0) || (a[m].compareTo(a[q])<=0 && a[q].compareTo(a[p])<=0))
		    x = a[q];
		int i = p-1;
		int j = q+1;
		while (true) {
		    do i++; while (!(i>q || a[i].compareTo(x)>=0));
		    do j--; while (!(j<p || a[j].compareTo(x)<=0));
		    if (i<j) swap(a, i, j);
		    else return j;
		}
    }

    private static <T extends Comparable<T>> void swap (T[] a, int i, int j) {
		T x;
		x = a[i];
		a[i] = a[j];
		a[j] = x;
    }
    
    /// Para LinkedList
    
   //*********************************************************************************************************************************
    ///////////////prueba Linked******************************************************************************************************
    public static <T extends Comparable<T>> void sortLin(Lista<T> a) {
    	Nodo<T> n = a.primero;
    	quicksortLin(a, 0, a.size-1, n);
    }

    private static <T extends Comparable<T>> void quicksortLin (Lista<T> a, int i, int j, Nodo<T> n) {
		if (i<j) {
		    int l = partitionLin(a,i,j, n);
		    quicksortLin(a, i, l, n);
		    quicksortLin(a, l+1, j, n);
		}
    }

    private static <T extends Comparable<T>> int partitionLin(Lista<T> a, int p, int q, Nodo<T> n) {
		T x = a.ObtDato(p);
		int m = (p+q)/2;
		if ((a.ObtDato(p).compareTo(a.ObtDato(m))<=0 && a.ObtDato(m).compareTo(a.ObtDato(q))<=0) || (a.ObtDato(q).compareTo(a.ObtDato(m))<=0 && a.ObtDato(m).compareTo(a.ObtDato(p))<=0))
		    x = a.ObtDato(m);
		if ((a.ObtDato(p).compareTo(a.ObtDato(q))<=0 && a.ObtDato(q).compareTo(a.ObtDato(m))<=0) || (a.ObtDato(m).compareTo(a.ObtDato(q))<=0 && a.ObtDato(q).compareTo(a.ObtDato(p))<=0))
		    x = a.ObtDato(q);
		int i = p-1;
		int j = q+1;
		while (true) {
		    do i++; while (!(i>q || a.ObtDato(i).compareTo(x)>=0));
		    do j--; while (!(j<p || a.ObtDato(j).compareTo(x)<=0));
		    if (i<j) swapLin(a, i, j);
		    else return j;
		}
    }

    private static <T extends Comparable<T>> void swapLin (Lista<T> a, int i, int j) {
		T x;
		x = a.ObtDato(i);
		a.ModDato(i, a.ObtDato(j));
		a.ModDato(j, x);	
    }
    
   
	    	
    
}
