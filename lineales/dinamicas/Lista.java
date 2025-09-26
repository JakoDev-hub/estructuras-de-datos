package lineales.dinamicas;

public class Lista {
    
    private Nodo cabecera;

    public Lista(){
        cabecera = null;
    }

    // metodo verifica si es vacia
    public boolean esVacia(){
        return cabecera == null;
    }

    // metodo privado insertar
    public boolean insertar(Object  nuevoElem, int pos){

        boolean exito = false;

        if (pos<1 || pos< this.longitud() + 1 ) {
            exito = false;
        }else{
            if (pos == 1) {
                this.cabecera = new Nodo(nuevoElem, cabecera);
            }else{
                Nodo aux = this.cabecera;
                int i = 1;
                while (i< pos - 1) {
                    i++;
                }
                Nodo nuevo = new Nodo(nuevoElem, aux.getEnlace());
                aux.getEnlace();
            }

        }
        return exito;
    }
    
    // metodo privado longitud
    public int longitud(){
        int longitudLista = 0;
        if ( !esVacia() ) {
            while (cabecera.getElement()!= null) {
                longitudLista++;
                cabecera.getEnlace();
            }
        }
        return longitudLista;
    }

    // metodo eliminar 
    public void eliminar(int pos){
        boolean exito = false;
        if (!esVacia()) {
            
        }
    }
}
