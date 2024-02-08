package org.example;

public class Productos {
    int clave;
    String nombre;

    public Productos() {
    }

    public Productos(int clave, String nombre) {
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
        return "Productos{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
