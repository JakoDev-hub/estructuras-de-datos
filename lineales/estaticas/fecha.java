public class fecha {
    
    private int dia,mes,año;
    private String fechaString;

    public fecha(int unDia,int unMes, int unAño){
        dia = unDia;
        mes = unMes;
        año = unAño;
    }
    public fecha(String unStrDia,String unStrMes,String unStraño){
        fechaString = unStrDia+"/"+unStrMes+"/"+unStraño;
    }
    public String getFechaString() {
        return fechaString;
    }
    public void setFechaString(String fechaString) {
        this.fechaString = fechaString;
    }
    public int getAño() {
        return año;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
}
