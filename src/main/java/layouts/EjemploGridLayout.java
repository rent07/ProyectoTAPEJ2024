package layouts;

import java.awt.*;
import javax.swing.*;

public class EjemploGridLayout {
    public static void main(String[] args) {

        //Definimos los valores iniciales de la ventana
        JFrame miVentana = new JFrame("Teléfono");
        miVentana.setSize(300, 430);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocation(200, 200);
        miVentana.setResizable(false);
        Font font = new Font("Arial", Font.PLAIN, 24);

        //Creación de los paneles
        JPanel panelGeneral = new JPanel();
        JPanel panelCuerpo = new JPanel();
        JPanel panelPie = new JPanel();
        GridLayout layout = new GridLayout(3, 3); // Una cuadrícula de 3x3
        panelGeneral.setLayout(new BorderLayout());
        panelCuerpo.setLayout(layout);
        panelPie.setLayout(new GridLayout(1, 3)); // Cuadrícula de una fila y tres columnas


        // Creamos los botones para los números
        for (int i = 1; i <= 9; i++) {
            String num = Integer.toString(i); // Convertimos el entero a String
            JButton boton = new JButton(num);

            //Le asignamos un tamaño al botón
            boton.setPreferredSize(new Dimension(100, 100)); // Establecemos un tamaño preferido

            //Le asignamos una fuente al boton
            boton.setFont(font);

            //Lo añadimos al panel correspondiente
            panelCuerpo.add(boton);
        }

        //Creamos los botones para la parte de abajo
        JButton botonIzquierda = new JButton("*");
        JButton botonCentro = new JButton("0");
        JButton botonDerecha = new JButton("#");

        //Le asignamos un tamaño al botón
        botonIzquierda.setPreferredSize(new Dimension(100, 100));
        botonCentro.setPreferredSize(new Dimension(100, 100));
        botonDerecha.setPreferredSize(new Dimension(100, 100));

        //Le asignamos fuente a los botones
        botonIzquierda.setFont(font);
        botonCentro.setFont(font);
        botonDerecha.setFont(font);

        //Los añadimos al panel correspondiente
        panelPie.add(botonIzquierda);
        panelPie.add(botonCentro);
        panelPie.add(botonDerecha);

        //Agregamos al panel general
        panelGeneral.add(panelCuerpo, BorderLayout.CENTER);
        panelGeneral.add(panelPie, BorderLayout.SOUTH);

        //Agregamos finalmente e nuestra ventana
        miVentana.add(panelGeneral);

        //Hacemos visible nuestra ventana
        miVentana.setVisible(true);
    }
}
