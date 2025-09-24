package lineales.estaticas;

public class Cola{

    private Object[] arreglo;
    private int frente, fin; 
    private int Final static TAMANIO;
    
    public Cola(){
        Object [] arreglo = new Object [this.TAMANIO];
        frente = 0;
        fin = 0;
    }

    // metodo que pregunta si esta vacia la cola
    public esVacia(){
        return frente < fin;
    }
    
    // metodo apilar
    public boolean apilar(){
        return privateApilar();
    }

    // metodo privado apilar
    private boolean privateApilar(Object element){

        boolean exito = false;

        if(!esVacia() && frente < this.arreglo.lenght()){
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