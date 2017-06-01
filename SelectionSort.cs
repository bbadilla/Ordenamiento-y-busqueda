using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Ordenamiento
{
    public class SelectionSort<E> where E : System.IComparable<E>
    {

        //para arrays
        public void selectionArray(E[] arr)
        {

            for (int i = 0; i < arr.Length - 1; i++)
            {
                int index = i;
                for (int j = i + 1; j < arr.Length; j++)
                    if (arr[j].CompareTo(arr[index]) < 0)
                        index = j;

                E smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
        }

        ///para arraylist
        public void selectionArrayList(ArrayList arr)
        {

            for (int i = 0; i < arr.Count; i++)
            {
                // find position of smallest num between (i + 1)th element and last element
                int pos = i;
                for (int j = i; j < arr.Count; j++)
                {
                    if (((E)arr[j]).CompareTo((E)arr[pos]) < 0)
                        pos = j;
                }
                // Swap min (smallest num) to current position on array
                E min = (E)arr[pos];
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }

        //para linkedlist

        public void selectionLinkedList(Nodo<E> head)
        {

            Nodo<E> i, j;
            i = head;
            for (i = head; i != null; i = i.getSiguiente())
            {
                // find position of smallest num between (i + 1)th element and last element
                Nodo<E> pos = i;
                for (j = i.getSiguiente(); j != null; j = j.getSiguiente())
                {
                    if (j.getDato().CompareTo(pos.getDato()) < 0)
                        pos = j;
                }
                // Swap min (smallest num) to current position on array
                E min = pos.getDato();
                pos.setDato(i.getDato());
                i.setDato(min);
            }
        }
    }
}
