package org.example;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Proveedores> proveedores = new ArrayList<>();
        ArrayList<Ciudades> ciudades = new ArrayList<>();
        ArrayList<Productos> productos = new ArrayList<>();
        ArrayList<Estados> estados = new ArrayList<>();
        int op=0,clave;
        String nombre;
        do{
            System.out.println("Que operacion desea realizar");
            System.out.println("1.- agregar cliente");
            System.out.println("2.- agregar ciudad");
            System.out.println("3.- agregar proveedor");
            System.out.println("4.- agregar producto");
            System.out.println("5.- agregar estado");
            System.out.println("6.- mostrar reporte de datos");
            System.out.println("0.- salir");
            op = inputInt.nextInt();
            if(op==1){
                System.out.println("ingrese la clave correspondiente");
                clave = inputInt.nextInt();
                System.out.println("ingrese el nombre");
                nombre = inputString.nextLine();
                clientes.add(new Clientes(clave,nombre));
            }
            else if(op==2){
                System.out.println("ingrese la clave correspondiente");
                clave = inputInt.nextInt();
                System.out.println("ingrese el nombre");
                nombre = inputString.nextLine();
                ciudades.add(new Ciudades(clave,nombre));
            }
            else if(op==3){
                System.out.println("ingrese la clave correspondiente");
                clave = inputInt.nextInt();
                System.out.println("ingrese el nombre");
                nombre = inputString.nextLine();
                proveedores.add(new Proveedores(clave,nombre));
            }
            else if(op==4){
                System.out.println("ingrese la clave correspondiente");
                clave = inputInt.nextInt();
                System.out.println("ingrese el nombre");
                nombre = inputString.nextLine();
                productos.add(new Productos(clave,nombre));
            }
            else if(op==5){
                System.out.println("ingrese la clave correspondiente");
                clave = inputInt.nextInt();
                System.out.println("ingrese el nombre");
                nombre = inputString.nextLine();
                estados.add(new Estados(clave, nombre));
            }
            else if(op==6){
                System.out.println("Clientes registrados: "+clientes.size());
                for(Clientes c:clientes){
                    System.out.println(c.toString());
                }
                System.out.println("Ciudades registradas: "+ciudades.size());
                for(Ciudades c:ciudades){
                    System.out.println(c.toString());
                }
                System.out.println("Proveedores registrados: "+proveedores.size());
                for(Proveedores p:proveedores){
                    System.out.println(p.toString());
                }
                System.out.println("Productos registrados: "+productos.size());
                for(Productos p:productos){
                    System.out.println(p.toString());
                }
                System.out.println("Estados registrados: "+estados.size());
                for(Estados e:estados){
                    System.out.println(e.toString());
                }
            }
        }while(op!=0);
        System.out.println("Adios");
    }
}

