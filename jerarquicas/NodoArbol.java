package jerarquicas;

public class NodoArbol {

    private NodoArbol izquierdo, derecho;
    private Object elemento;

    public NodoArbol(Object elem, NodoArbol izq, NodoArbol der) {
        elemento = elem;
        izquierdo = izq;
        derecho = der;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }
    public Object getElemento() {
        return elemento;
    }
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }
    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }
}
