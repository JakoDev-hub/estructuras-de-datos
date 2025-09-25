
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
    public boolean apilar(Object elem) {
        return privateApilar(elem);
    }

    // metodo privado apilar
    private boolean privateApilar(Object element) {

        boolean exito = false;

        if (!esVacia() && frente < this.arreglo.length) {
            arreglo[this.frente] = element;
            frente++;
            exito = true;
        }

        return exito;
    }

    // metodo desapilar
    public boolean desapilar() {
        return privateDesapilar();
    }

    // metodo privado desapilar
    private boolean privateDesapilar() {

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
    public Object obtenerFrente() {
        return privateObtenerFrente();
    }

    // metodo privado obtenerFrente
    private Object privateObtenerFrente() {

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

    public String toString() {
        return privateToString();

    }

    private String privateToString() {

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