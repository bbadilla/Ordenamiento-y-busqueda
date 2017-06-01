using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenamiento
{
    public class MergeSort<T> where T : System.IComparable<T>
    {


        //////////////////////////////////para arrays

        // Wrapper method for the real algorithm
        // T is the generic type which will be instantiated at runtime
        //  elementas are required to be comparable
        public void sort(T[] a)
        {
            mergesort(a, 0, a.Length - 1);
        }

        // Recursive mergesort method, following the pseudocode
        private void mergesort(T[] a, int i, int j)
        {
            if (j - i < 1) return;
            int mid = (i + j) / 2;
            mergesort(a, i, mid);
            mergesort(a, mid + 1, j);
            merge(a, i, mid, j);
        }

        // Merge method
        // Here we need to allocate a new array, but Java does not allow allocating arrays of a generic type
        // As a work-around we allocate an array of type Object[] the use type casting
        // This would usually generate a warning, which is suppressed
        private  void merge(T[] a, int p, int mid, int q)
        {

            Object[] tmp = new Object[q - p + 1];
            int i = p;
            int j = mid + 1;
            int k = 0;
            while (i <= mid && j <= q)
            {
                if (a[i].CompareTo(a[j]) <= 0)
                    tmp[k] = a[i++];
                else
                    tmp[k] = a[j++];
                k++;
            }
            if (i <= mid && j > q)
            {
                while (i <= mid)
                    tmp[k++] = a[i++];
            }
            else
            {
                while (j <= q)
                    tmp[k++] = a[j++];
            }
            for (k = 0; k < tmp.Length; k++)
            {
                a[k + p] = (T)(tmp[k]); // this is the line that woudl generate the warning 
            }
        }

        ////////////////// para array list
        public  void sortArrayList(ArrayList a)
        {
            mergesortArrayList(a, 0, a.size() - 1);
        }

        private static <T extends Comparable<T>> void mergesortArrayList(ArrayList<T> a, int i, int j)
        {
            if (j - i < 1) return;
            int mid = (i + j) / 2;
            mergesortArrayList(a, i, mid);
            mergesortArrayList(a, mid + 1, j);
            mergeArrayList(a, i, mid, j);
        }

        // Merge method
        // Here we need to allocate a new array, but Java does not allow allocating arrays of a generic type
        // As a work-around we allocate an array of type Object[] the use type casting
        // This would usually generate a warning, which is suppressed
        private static <T extends Comparable<T>> void mergeArrayList(ArrayList<T> a, int p, int mid, int q)
        {

            Object[] tmp = new Object[q - p + 1];
            int i = p;
            int j = mid + 1;
            int k = 0;
            while (i <= mid && j <= q)
            {
                if (a.get(i).compareTo(a.get(j)) <= 0)
                    tmp[k] = a.get(i++);
                else
                    tmp[k] = a.get(j++);
                k++;
            }
            if (i <= mid && j > q)
            {
                while (i <= mid)
                    tmp[k++] = a.get(i++);
            }
            else
            {
                while (j <= q)
                    tmp[k++] = a.get(j++);
            }
            for (k = 0; k < tmp.length; k++)
            {
                a.set(k + p, (T)(tmp[k])); // this is the line that woudl generate the warning 
            }
        }

        /////////////para linkedList
        public static <T extends Comparable<T>> void sortLinked(Lista<T> list)
        {
            Nodo<T> n = list.primero;
            mergesortLinked(list, 0, list.size - 1, n);
        }

        private static <T extends Comparable<T>> void mergesortLinked(Lista<T> a, int i, int j, Nodo<T> n)
        {
            if (j - i < 1) return;
            int mid = (i + j) / 2;
            mergesortLinked(a, i, mid, n);
            mergesortLinked(a, mid + 1, j, n);
            mergeLinked(a, i, mid, j, n);
        }

        // Merge method
        // Here we need to allocate a new array, but Java does not allow allocating arrays of a generic type
        // As a work-around we allocate an array of type Object[] the use type casting
        // This would usually generate a warning, which is suppressed
        private static <T extends Comparable<T>> void mergeLinked(Lista<T> a, int p, int mid, int q, Nodo<T> n)
        {

            Object[] tmp = new Object[q - p + 1];
            int i = p;
            int j = mid + 1;
            int k = 0;
            while (i <= mid && j <= q)
            {
                if (a.ObtDato(i).compareTo(a.ObtDato(j)) <= 0)
                    tmp[k] = a.ObtDato(i++);
                else
                    tmp[k] = a.ObtDato(j++);
                k++;
            }
            if (i <= mid && j > q)
            {
                while (i <= mid)
                    tmp[k++] = a.ObtDato(i++);
            }
            else
            {
                while (j <= q)
                    tmp[k++] = a.ObtDato(j++);
            }
            for (k = 0; k < tmp.length; k++)
            {
                a.devolverNodo(k + p).setDato((T)tmp[k]);
            }
        }
    }
}
