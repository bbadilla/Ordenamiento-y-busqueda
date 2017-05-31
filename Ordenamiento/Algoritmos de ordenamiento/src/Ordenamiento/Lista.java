package Ordenamiento;

public class Lista<T> {
	//Atributos
    Nodo<T> primero;
    int size;
 
    /**
     * Constructor por defecto
     */
    public Lista(){
        listaVacia();
    }
 
    /**
     * Vacia la lista
     */
    private void listaVacia(){
        primero = null;
    }
 
    /**
     * Indica si la lista esta vacia o no
     * @return True = esta vacia
     */
    public boolean estaVacia(){
        return primero == null;
    }
 
    /**
     * Inserta un objeto al principio de la lista
     * @param t Dato insertado
     */
    public void insertarPrimero(T t){
        Nodo<T> nuevo = new Nodo<>(t);
 
        if (!estaVacia()){
            //Sino esta vacia, el primero actual pasa a ser
            // el siguiente de nuestro nuevo nodo
            nuevo.setSiguiente(primero);
            
        }
        
        this.size++;
        //el primero apunta al nodo nuevo
        primero=nuevo;
         
    }
 
    /**
     * Inserta al final de la lista un objeto
     * @param t Dato insertado
     */
    public void insertarUltimo(T t){
 
        Nodo<T> aux = new Nodo<>(t);
        Nodo<T> rec_aux;
 
        if (estaVacia()) {
            insertarPrimero(t);
        }else {
            rec_aux = primero;
             
            //Buscamos el ultimo nodo
            while(rec_aux.getSiguiente() != null){
                rec_aux=rec_aux.getSiguiente();
            } 
                 
            //Actualizamos el siguiente del ultimo
            rec_aux.setSiguiente(aux);
            this.size++;
        }
        
    }
 
    /**
     * Quita el primer elemento de la lista
     */
    public void quitarPrimero(){
        Nodo<T> aux;
        if (!estaVacia()){
            aux=primero;
            primero = primero.getSiguiente();
            aux=null; //Lo marcamos para el recolector de basura
        }
    }
 
    /**
     * Quita el ultimo elemento de la lista
     */
    public void quitarUltimo(){
        Nodo<T> aux=primero;
        if(aux.getSiguiente()==null)
           //Aqi entra, si la lista tiene un elemento
           listaVacia();
        if(!estaVacia()) {
            aux=primero;
             
            //Buscamos el penultimo, por eso hay dos getSiguiente()
            while(aux.getSiguiente().getSiguiente() != null){
                aux=aux.getSiguiente();
            }
             
            //Marcamos el siguiente del antepenultimo como nulo, eliminando el ultimo
            aux.setSiguiente(null);
        }
 
    }        
 
    /**
     * Devuelve el último elemento de la lista
     * @return Último elemento
     */
    public T devolverUltimo(){
        T elemen = null;
        Nodo<T> aux;
        if (!estaVacia()){
            aux = primero;
             
            //Recorremos
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            elemen = aux.getDato();
        }
        return elemen;
    }
 
    /**
     * Devuelve el primer elemento de la lista
     * @return Primer elemento, null si esta vacia
     */
    public T devolverPrimero(){
        T elemen = null;
        if (!estaVacia()){
            elemen = primero.getDato();
        }
        return  elemen;
    }
 
    /**
     * Devuelve el número de elementos de la lista
     * @return 
     * @return Número de elementos
     */
    public int size(){
        
    	return this.size;
 
    }
    

    
    public T ObtDato(int pos){
        Nodo<T> aux=primero;
        int cont=0;
        T dato=null;
         
        if(pos<0 || pos>= size){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //recorremos
            while(aux!=null){
                if (pos == cont){
                    //Cogemos el dato
                    dato=aux.getDato();
                }
                 
                aux=aux.getSiguiente();
                cont++;
                 
            }
        }
         
        return dato;
         
    }
    
    public void ModDato(int pos, T dato){
        Nodo<T> aux=primero;
        int cont=0;
         
        if(pos<0 || pos>=size){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //Recorremos
            while(aux!=null){
                if (pos == cont){
                    //Modificamos el dato directamente
                    aux.setDato(dato); 
                }
                cont++;
                aux=aux.getSiguiente(); //Actualizamos
            }
        }
         
    }
    
    public void mostrar(){
        System.out.println("Contenido de la lista");
        System.out.println("---------------------");
         
        Nodo<T> aux=primero;
         
        while(aux!=null){
            System.out.print(aux.getDato()+",");//mostramos el dato
            aux=aux.getSiguiente();
        }
         
    }
    
    public Nodo<T> devolverNodo(int pos){
        Nodo<T> aux=primero;
        int cont=0;
         
        if(pos<0 || pos>=size){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //recorremos
            while(aux!=null){
                if (pos == cont){
                    //Devuelvo aux, con esto salimos de la función
                    return aux; 
                }
                 
                //Actualizo el siguiente
                aux=aux.getSiguiente();
                cont++;
                 
            }
        }
         
        return aux;
         
    }
}