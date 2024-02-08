package org.example;

public class Clientes {
    int clave;
    String nombre;

    public Clientes() {
    }

    public Clientes(int clave, String nombre) {
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
        return "Clientes{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
