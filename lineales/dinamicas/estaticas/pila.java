package lineales.dinamicas.estaticas;

class pila {

    private int tope;
    private Object [] arreglo;
    private static final int TAMANIO = 20;
    
    public pila(){
        this.arreglo = new Object[TAMANIO];
        this.tope = -1;
    }
    
    public boolean apilar(Object newElement){
        return privateApilar(newElement);
    }
    // private mode
    private boolean privateApilar(Object elem){
        boolean exito;
        if (this.tope+1 >= this.TAMANIO){
            exito = false;
        }else{
            this.tope++;
            this.arreglo[tope] = elem;
            exito = true;
        }
        return exito;
    }
}