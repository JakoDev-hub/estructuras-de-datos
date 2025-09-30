
public class Cola {

    private Object[] arreglo;
    private int frente, fin;
    private final static int TAMANIO = 0;

    public Cola() {
        Object[] arreglo = new Object[TAMANIO];
        frente = 0;
        fin = 0;
    }

    // metodo que pregunta si esta vacia la cola
    public boolean esVacia() {
        return frente < fin;
    }

    // metodo apilar
    public boolean Apilar(Object element) {

        boolean exito = false;

        if (!esVacia() && frente < this.arreglo.length) {
            arreglo[this.frente] = element;
            frente++;
            exito = true;
        }

        return exito;
    }

    // metodo desapilar
    public boolean Desapilar() {

        boolean exito = false;

        if (this.esVacia()) {

            // la cola se encuentra vacia
            exito = false;
        } else {
            this.arreglo[this.frente] = null;
            this.frente = (this.frente + 1) % TAMANIO;

        }
        return exito;
    }

    // metodo obtenerFrente
    public Object ObtenerFrente() {

        Object element = null;

        if (!esVacia()) {
            element = arreglo[frente];

        }
        return element;
    }

    // metodo vaciar
    public void vaciar() {

        this.frente = 0;
        this.fin = 0;
    }
    //metodo toString
    public String ToString() {

        String strArreglo = "{ ";

        if (!esVacia()) {
            int i = 0;
            while (arreglo[i] != null) {
                strArreglo = arreglo[i] + " , ";

            }
        }
        return strArreglo + " }";
    }

}