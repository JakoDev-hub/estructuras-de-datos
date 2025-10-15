package jerarquicas;

public class nodoGen {
 
    private Object elem;
    private nodoGen hijoIzquierdo, hermanoDerecho;
    
    // constructor
    
    public nodoGen(Object elemento,nodoGen hijoIzq, nodoGen hermanoDer){

        elem = elemento;
        hijoIzquierdo = hijoIzq;
        hermanoDerecho = hermanoDer;        
    }

    //observadores

    public Object getElem() {
        return elem;
    }
    public nodoGen getHermanoDerecho() {
        return hermanoDerecho;
    }
    public nodoGen getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    // modificadores

    public void setElem(Object elem) {
        this.elem = elem;
    }
    public void setHermanoDerecho(nodoGen hermanoDerecho) {
        this.hermanoDerecho = hermanoDerecho;
    }
    public void setHijoIzquierdo(nodoGen hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
}
