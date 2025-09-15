package lineales.dinamicas.estaticas;

class pila {

    private int tope;
    private Object [] arreglo;
    private static final int TAMANIO = 20;
    
    //Constructor
    public pila(){
        this.arreglo = new Object[TAMANIO];
        this.tope = -1;
    }

    // public module
    public boolean apilar(Object newElement){
        return privateApilar(newElement);
    }

    // private module
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

    //public module 
    public boolean desapilar(){
        return privateDesapilar();
    }

    //
    private boolean privateDesapilar(){
        boolean exito = false;

        if (!esVacia()) {
            arreglo[tope] = null;
            tope--;
            exito = true;    
        }
        return exito;
    }

    public boolean esVacia(){
        return tope == -1;
    }

    // metodo vaciar
    public void vaciar(){
        if (!esVacia()) {
            while (tope>-1) {
                arreglo[tope] = null;
                tope--;
            }
        }
    }

    // OBTENER TOPE
    public Object obtenerTope(){
        return privateObtenerTope();
        
    }
    
    private Object privateObtenerTope(){
        Object elTopeActual = null;

        if (!esVacia()) {
            elTopeActual = arreglo[tope];
            }
            return elTopeActual;

        }
    }
