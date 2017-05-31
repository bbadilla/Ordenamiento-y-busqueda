using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
using System.Threading.Tasks;

namespace Ordenamiento
{
    public class BubbleSort<T> where T : System.IComparable<T>
    {

        public  void bubbleArray(T[] arr) 
        {
            for (int j = arr.Length- 1; j >= 0; j--)
            {
                for (int i = 1; i <= j; i++)
                {
                    if (arr[i - 1].CompareTo(arr[i]) >0)
                    {
                       T tmp= arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = tmp;
                    }
                }
            }
        }

        ///para array list
        public void bubbleArrayList(ArrayList arr)
        {
            for (int j = 0; j < arr.Count; j++)
            {

                for (int i = j + 1; i < arr.Count; i++)
                {
                    if (((T)arr[i]).CompareTo((T)arr[j]) < 0)
                    {

                        T t = (T) arr[j];
                        arr[j]= arr[i];
                        arr[i] = t;
                    }
                }
            }
        }

        /// para listas enlazadas
        public void bubbleLinkedList(Nodo<T> head)
        {
            Nodo<T> i, j;
            i = head;
            T temp;

            {
                for (i = head; i != null; i = i.getSiguiente()) // bubble sort outer loop
                {
                    for (j = i.getSiguiente(); j != null; j = j.getSiguiente())
                    {
                        if ((i.getDato()).CompareTo(j.getDato()) > 0)
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

}
