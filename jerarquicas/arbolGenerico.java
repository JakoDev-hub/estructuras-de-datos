package jerarquicas;

import lineales.dinamicas.Nodo;

public class arbolGenerico {                                                                                

    private NodoArbol raiz;

    public arbolBinario(){
        this.raiz = null;
    }

    public boolean insertar(Object tipoElemento,Object elemPadre){

        boolean exito = false;

        if (!esVacia()) {
            NodoArbol hijo = raiz.getIzquierdo();
            if (this.raiz.getElemento()!= ) {
                
            }
        }
    }

    public boolean esVacia(){
    
        return this.raiz == null;
    }

}
