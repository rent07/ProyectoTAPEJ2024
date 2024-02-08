package org.example;

public class Estados {
    int clave;
    String nombre;
    public Estados(){
    }
    public  Estados(int clave, String nombre){
        this.clave = clave;
        this.nombre = nombre;
    }
    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Estados{" +
                "clave= " + clave +
                ", nombre= " + nombre + '\''
                + "}";
    }
}

