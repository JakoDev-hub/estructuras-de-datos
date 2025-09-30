class pila {

    private int tope;
    private Object[] arreglo;
    private static final int TAMANIO = 20;

    // Constructor
    public pila() {
        this.arreglo = new Object[TAMANIO];
        this.tope = -1;
    }

    // public apilar
    public boolean Apilar(Object elem) {
        boolean exito;
        if (this.tope + 1 >= TAMANIO) {
            exito = false;
        } else {
            this.tope++;
            this.arreglo[tope] = elem;
            exito = true;
        }
        return exito;
    }
    
    // metodo desapilar
    public boolean Desapilar() {
        boolean exito = false;

        if (!esVacia()) {
            arreglo[tope] = null;
            tope--;
            exito = true;
        }
        return exito;
    }
    // metodo verifica si esta vacia
    public boolean esVacia() {
        return tope == -1;
    }

    // metodo vaciar
    public void vaciar() {
        if (!esVacia()) {
            while (tope > -1) {
                arreglo[tope] = null;
                tope--;
            }
        }
    }

    // Obtener tope
    public Object ObtenerTope() {
        Object elTopeActual = null;

        if (!esVacia()) {
            elTopeActual = arreglo[tope];
        }
        return elTopeActual;

    }

    // clone
    public pila Clone() {
        pila clone = new pila();
        clone.tope = this.tope;
        clone.arreglo = new Object[TAMANIO];
        for (int i = 0; i <= this.tope; i++) {
            clone.arreglo[i] = this.arreglo[i];
        }
        return clone;
    }

    // metodo toString
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
