using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Ordenamiento
{
    class Principal
    {
        static void Main(string[] args)
        {
            Lista<int> a = new Lista<int>();
            a.insertarPrimero(98);
            a.insertarPrimero(12);
            a.insertarPrimero(1);
            a.insertarPrimero(2);
            a.mostrar();

            ArrayList lista = new ArrayList();

            lista.Add("kaka");
            lista.Add("juan");
            lista.Add("adsala");
            lista.Add("alz");
            lista.Add("rata");
            lista.Add("cometa");
            lista.Add("alo");

            int[] arr = { 9, 3, 5, 1, 4, 7 };

            System.Console.WriteLine("Burbuja array");
            BubbleSort<int> A = new BubbleSort<int>();
            A.bubbleArray(arr);
            foreach (int i in arr)
            {

                Console.Write("{0} ", i);

            }
            Console.WriteLine("");

            System.Console.WriteLine("Burbuja arrayList");
            BubbleSort<String> B = new BubbleSort<String>();
            
            B.bubbleArrayList(lista);
            foreach (String i in lista)
            {

                Console.Write("{0} ", i);

            }
            Console.WriteLine("");
            System.Console.WriteLine("Burbuja Linked");
            BubbleSort<int> C = new BubbleSort<int>();

            C.bubbleLinkedList(a.primero);
            a.mostrar();
            System.Console.ReadLine();

           
        }
    }
}
