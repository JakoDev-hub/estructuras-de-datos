

public class Cola{

    private Object[] arreglo;
    private int frente, fin; 
    private  final static int TAMANIO = 0;
    
    public Cola(){
        Object [] arreglo = new Object [this.TAMANIO];
        frente = 0;
        fin = 0;
    }

    // metodo que pregunta si esta vacia la cola
    public boolean esVacia(){
        return frente < fin;
    }
    
    // metodo apilar
    public boolean apilar(Object elem){
        return privateApilar(elem);
    }

    // metodo privado apilar
    private boolean privateApilar(Object element){

        boolean exito = false;

        if(!esVacia() && frente < this.arreglo.length){
            arreglo[this.frente] = element;
            frente++;
            exito = true;
        }

        return exito;
    }

    //metodo desapilar 
    public boolean desapilar(){
        return privateDesapilar();
    }

    private boolean privateDesapilar(){

        boolean exito = false;

        if(this.esVacia()){ 
            
            // la cola se encuentra vacia
            exito = false;
        }else{

            
        }
    }



}