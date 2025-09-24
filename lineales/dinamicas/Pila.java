package lineales.dinamicas;

public class Pila {

    Nodo tope;

    public Pila() {
        this.tope = null;

    }
    public boolean apilar(Object nuevoElem){
        return privateApilar(nuevoElem);
    }

    private boolean privateApilar(Object elem) {

        Nodo nuevo = new Nodo(elem, this.tope);
        this.tope = nuevo;
        return true;
    }

    // modulo que pregunta si esta vacia
    public boolean esVacia(){
        return this.tope == null;
    }


    // desapila la pila
    public boolean desapilar(){
        return privateDesapilar();
    }

    // metodo privado desapila
    private boolean privateDesapilar(){
        boolean exito = false;

        if (!esVacia()) {
            this.tope = tope.getEnlace();
            exito = true;
        }
        return exito;
    }

    // metodo toString
    public String toString(){
        return privateToString();
    }

    // metodo privado toString 
    private String privateToString() {
        String s = "";

        if (this.tope == null) {
            s = "Pila vacia";

        } else {
            Nodo aux = this.tope;
            while (aux != null) {
                s += aux.getElement().toString();
                aux = aux.getEnlace();
                if (aux != null) {
                    s += ",";
                }
            }
            s += "]";
        }
        return s;
    }

    // metodo clone
    public Pila clone(){
        return privateClone();
    }

    // metodo privado clone
    private Pila privateClone(){

        Pila pilaClone = new Pila();
        Pila pilaAux = new Pila();
        Nodo copia = tope;

        while (!esVacia()) {

            pilaAux.apilar(tope.getElement());
            copia = copia.getEnlace();
        }
        while () {
            pilaClone.apilar(tope.getElement());
            copia = copia.getEnlace();
        }
        return pilaClone;
    }
    

}
