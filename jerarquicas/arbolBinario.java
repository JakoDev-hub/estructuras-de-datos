package jerarquicas;

public class arbolBinario {

    private NodoArbol raiz;

    public arbolBinario(){
        this.raiz = null;
    }
    
    public boolean esVacia(){
        return raiz == null;
    }
    public boolean insertar(Object nuevoElem, NodoArbol padre, char pos){

        boolean exito = false;
        if ( !esVacia()) {
            if (raiz.equals(padre)) {
                if (pos == 'i'&& raiz.getIzquierdo()!= null) {
                    NodoArbol nuevo = new NodoArbol(nuevoElem,null , null);
                    raiz.setIzquierdo(nuevo);
                }else if (pos == 'd'&& raiz.getDerecho()!= null) {
                    NodoArbol nuevo = new NodoArbol(nuevoElem, null, null);
                    raiz.setDerecho(nuevo);
                }
            }
            if (raiz.getIzquierdo()!= null) {
                raiz.getIzquierdo();
            }
            if (raiz.getDerecho()!= null) {
                raiz.getIzquierdo();
            }    
            
        }
        return exito;
    }
}