
public class alumnos{
    
    private int numDni,telefono, numero, ciudad;
    private String nombre, apellido, tipoDni, Calle;
    private Object [] domicilio = {Calle,numero,ciudad};

    // constructor
    alumnos(String unNombre , String unApellido, String unTipoDni, int elNumDni ,int unTelefono, int unaCalle, int unNumero , String unaCiudad){

        nombre = unNombre;
        apellido = unApellido;
        tipoDni = unTipoDni;
        numDni = elNumDni;
        telefono = unTelefono;
        domicilio[0] = unaCalle;
        domicilio[1] = unNumero;
        domicilio[2] = unaCiudad;
    }

    // observadores
    public String getApellido() {
        return apellido;
    }
    public String getCalle() {
        return Calle;
    }
    public int getCiudad() {
        return ciudad;
    }
    public Object[] getDomicilio() {
        return domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumDni() {
        return numDni;
    }
    public int getNumero() {
        return numero;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getTipoDni() {
        return tipoDni;
    }

    // modificadores
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCalle(String calle) {
        Calle = calle;
    }
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    public void setDomicilio(Object[] domicilio) {
        this.domicilio = domicilio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }


    
}