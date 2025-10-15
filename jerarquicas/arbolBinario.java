package jerarquicas;

import lineales.dinamicas.Lista;

public class arbolBinario {

    private NodoArbol raiz;

    public arbolBinario() {
        this.raiz = null;
    }

    public boolean esVacia() {
        return raiz == null;
    }

    public boolean insertar(Object nuevoElem, Object elemPadre, char pos) {
        boolean exito = true;
        if (this.raiz == null) {
            this.raiz = new NodoArbol(nuevoElem, null, null);
        } else {
            NodoArbol nodoPadre = obtenerNodo(this.raiz, elemPadre);

            if (nodoPadre != null) {
                if (pos == 'I' && nodoPadre.getIzquierdo() == null) {
                    nodoPadre.setIzquierdo(new NodoArbol(nuevoElem, null, null));
                }else if (pos == 'D' && nodoPadre.getDerecho() == null) {
                    nodoPadre.setDerecho(new NodoArbol(nuevoElem, null, null));
                }else{
                    exito = false;
                }
            }else{
                exito = false;
            }
        }
        return exito;
    }

    public NodoArbol obtenerNodo(NodoArbol nodo, Object buscado) {
        /*
         * metodo PRIVADO que busca un elemento y devuelve el nodo que
         * lo contiene. Si no se encuentra buscando devuelve null
         */

        NodoArbol resultado = null;

        if (nodo != null) {
            if (nodo.getElemento().equals(buscado)) {
                // si el buscado nodo, lo devuelve
                resultado = nodo;
            } else {
                // no es el buscado; busca primero en el arbol
                resultado = obtenerNodo(nodo.getIzquierdo(), buscado);
            }
            if (resultado == null) {
                resultado = obtenerNodo(nodo.getDerecho(), buscado);
            }
        }
        return resultado;
    }

    public Lista listarPreOrden() {
        // retorna una lista con elementos del arbol en PREORDEN
        Lista lispre = new Lista();
        listarPreOrdenAux(this.raiz, lispre);
        return lispre;
    }

    private void listarPreOrdenAux(NodoArbol nodo, Lista lis) {

        if (nodo != null) {
            lis.insertar(nodo.getElemento(), lis.longitud() + 1);
            listarPreOrdenAux(nodo.getIzquierdo(), lis);
            listarPreOrdenAux(nodo.getDerecho(), lis);
        }
    }
    
    public int nivel(Object elem){
        int valor = -1,resultado = 0;
        privateNivel(this.raiz, elem,valor,resultado);
        return valor;
        }

    private void privateNivel(NodoArbol nodo,Object elemento, int numero,int  resultado){

        if (nodo!= null) {
            if (nodo.getIzquierdo() != null) {
                if (nodo.getElemento() != elemento) {
                    privateNivel(nodo.getIzquierdo(), elemento,numero++,resultado); 
                }else{
                    resultado = numero;
                }
            }else if (nodo.getDerecho()!= null) {
                if (nodo.getElemento() != elemento) {
                    privateNivel(nodo.getDerecho(), elemento,numero++,resultado); 
                }else{
                    resultado = numero;
                }
            }else{
                numero--;
            }
        }
    } 
}

