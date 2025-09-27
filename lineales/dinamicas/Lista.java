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
    public boolean eliminar(int pos){
        boolean exito = false;
        if (!esVacia()) {
            cabecera.setElement(null);;
            exito = true;
        }
        return exito;
    }

    // metodo localizar
    public int localizar (Object buscado){

        // devuelve la posicion del elemento buscado 
        // si el elemento no existe devuelve -1
        int pos;

        // avanza buscando el elemento
        Nodo auxiliar = this.cabecera;
        int i = 0;
        while (auxiliar != null && !auxiliar.getElement().equals(buscado)) {
            auxiliar = auxiliar.getEnlace();
            i++;
        }
        // sale porque aux = null (error) o pq encontro el elemento (pos i)
        if (auxiliar == null) {
            pos = -1;
        }else{
            pos = i;
        }
    return pos;
    }
}
