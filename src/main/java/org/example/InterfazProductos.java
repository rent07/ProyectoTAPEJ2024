package org.example;

import javax.swing.*;
import java.awt.*;

public class InterfazProductos {
    public static void main(String[] args) {

        //Definimos los valores iniciales de la ventana
        JFrame miVentana = new JFrame("Productos");
        miVentana.setSize(600, 300);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocation(100, 100);
        miVentana.setResizable(false);

        Font fontTitulo = new Font("Arial", Font.BOLD, 24);
        Font fontEncabezado = new Font("Arial", Font.ITALIC, 20);
        Font fontTexto = new Font("Arial", Font.PLAIN, 16);

        //Creación de los paneles
        JPanel panelGeneral = new JPanel();
        JPanel panelEncabezado = new JPanel();
        JPanel panelCuerpo = new JPanel();
        panelCuerpo.setPreferredSize(new Dimension(600,180));
        JPanel panelPie = new JPanel();


        //Creación de Layouts
        GridLayout gridLayoutEncabezado = new GridLayout(2,1);
        GridLayout gridLayoutCuerpo = new GridLayout(6,2);
        BorderLayout borderLayout = new BorderLayout();

        //Asignamos a cada panel su tipo de Layout
        panelGeneral.setLayout(borderLayout);
        panelEncabezado.setLayout(gridLayoutEncabezado);
        panelCuerpo.setLayout(gridLayoutCuerpo);

        //Creacion de etiquetas
        JLabel titulo = new JLabel("Productos");
        titulo.setFont(fontTitulo);
        JLabel formulario = new JLabel("Formulario para el registro de productos:");
        formulario.setFont(fontEncabezado);
        JLabel nombre  = new JLabel("Ingrese el nombre del producto");
        nombre.setFont(fontTexto);
        JLabel clave  = new JLabel("Ingrese la clave del producto");
        clave.setFont(fontTexto);
        JLabel categoria = new JLabel("Seleccione la categoría del producto");
        categoria.setFont(fontTexto);
        JLabel precio  = new JLabel("Ingrese el precio del producto");
        precio.setFont(fontTexto);
        JLabel cantidad  = new JLabel("Seleccione la cantidad de piezas por lote");
        cantidad.setFont(fontTexto);


        //Agregamos los componentes a los paneles
        panelEncabezado.add(titulo);
        panelEncabezado.add(formulario);
        panelCuerpo.add(nombre);
        panelCuerpo.add(new JTextField());
        panelCuerpo.add(clave);
        panelCuerpo.add(new JTextField());
        panelCuerpo.add(categoria);
        String[] categoriasArray = {"Belleza", "Hogar", "Jardineria", "Línea Blanca", "Electrónica", "Alimentos"};
        panelCuerpo.add(new JComboBox<>(categoriasArray));
        panelCuerpo.add(precio);
        panelCuerpo.add(new JTextField());
        panelCuerpo.add(cantidad);
        SpinnerModel cantidadSpinner = new SpinnerNumberModel(0, 0, 500, 10);
        panelCuerpo.add(new JSpinner(cantidadSpinner));
        panelCuerpo.add(new JButton("Agregar"));
        panelCuerpo.add(new JButton("Cancelar"));
        panelPie.add(new JButton("Volver al Menú Principal"));



        //Agregamos al panel General
        panelGeneral.add(panelEncabezado,BorderLayout.NORTH);
        panelGeneral.add(panelCuerpo,BorderLayout.CENTER);
        panelGeneral.add(panelPie,BorderLayout.SOUTH);

        //Agregamos finalmente e nuestra ventana
        miVentana.add(panelGeneral);

        //Hacemos visible nuestra ventana
        miVentana.setVisible(true);
    }
}

