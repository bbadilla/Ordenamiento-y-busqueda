using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Ordenamiento
{
    public class InsertionSort<E> where E : System.IComparable<E>
    {

        ///Para arrays
        public void insertionArray(E[] input)
        {

            E temp;
            for (int i = 1; i < input.Length; i++)
            {
                temp = input[i];
                int j = i - 1;
                while (j >= 0 && temp.CompareTo(input[j]) < 0)
                {
                    input[j + 1] = input[j];
                    j--;
                }
                input[j + 1] = temp;
            }
        }

        ///Para arrays List
        public  void insertionArrayList(ArrayList input)
        {

        ;
            for (int i = 1; i < input.Count; i++)
            {
                E temp = (E) input[i];
                int j = i - 1;
                while (j >= 0 && temp.CompareTo((E)input[j]) < 0)
                {
                    input[j + 1] = input[j];
                    j--;
                }
                input[j + 1] = temp;
            }
        }

        ///para linkedlist
        public static void insertionLinkedList(Nodo<E> current)
        {

            E temp;
            Nodo<E> head, puntero;
            head = current;
            puntero = head;
            current = current.getSiguiente();

            while (current != null)
            {
                puntero = head;

                while (puntero.getSiguiente() != current)
                {
                    if (puntero.getDato().CompareTo(current.getDato()) > 0)
                    {
                        temp = current.getDato();
                        current.setDato(puntero.getDato());
                        puntero.setDato(temp);
                    }
                    else
                    {
                        puntero = puntero.getSiguiente();
                    }
                }
                current = current.getSiguiente();
            }
        }

    }
}
