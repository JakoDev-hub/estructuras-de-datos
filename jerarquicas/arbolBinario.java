package jerarquicas;

public class arbolBinario {

    private NodoArbol raiz;

    public arbolBinario(){
        this.raiz = null;
    }
    
    public boolean esVacia(){
        return raiz == null;
    }

    public boolean insertar(Object nuevoElem, Object elemPadre,char pos){
        boolean exito = true;
        if(this.raiz == null){
            this.raiz = new NodoArbol(nuevoElem,null,null);
        }else{
            NodoArbol nodoPadre = 
        }
    }

    public Object obtenerNodo(){

    }

    public listarPreOrden(){
        Lista lispre = new Lista()
        listarPreOrdenAux(this.raiz,lis);
        return lis;
    }
    private void listarPreOrdenAux(NodoArbol nodo, Lista lis){

        if()
    }
    
}