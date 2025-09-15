package lineales.dinamicas;

public class Pila {
    
    Nodo tope;

    public Pila(){
        this.tope = null;

    }

public boolean apilar(Object nuevoElem){

    Nodo nuevo = new Nodo(nuevoElem, this.tope);
    this.tope = nuevo;
    return true;
    }

    public String toString(){
        String s ="";

        if (this.tope == null) {
            s = "Pila vacia";

        }else{
            Nodo aux = this.tope;
            while (aux != null) {
                s+= aux.getElement().toString();
                aux = aux.getEnlace();
                if (aux != null) {
                    s+=",";  
                }
            }
             s += "]";
        }
       return s;
    }
}
