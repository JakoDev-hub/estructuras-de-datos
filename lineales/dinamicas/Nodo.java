package lineales.dinamicas;

public class Nodo {
    
    private Object element;
    private Nodo enlace;

    // constructores
    Nodo(Object elElement,Nodo elEnlace){
        element = elElement;
        enlace = elEnlace;
    }

    // visualizadores
    public Object getElement() {
        return element;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    // modificadores
    public void setElement(Object element) {
        this.element = element;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
