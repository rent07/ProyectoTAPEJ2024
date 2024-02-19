package org.example;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterfazEstados {
    public static void main(String[] args) {

        // Definimos los valores iniciales de la ventana
        JFrame miVentana = new JFrame("Menu Estados");
        miVentana.setSize(600, 500);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocation(100, 100);
        miVentana.setResizable(true);

        Font fontTitulo = new Font("Arial", Font.BOLD, 24);
        Font fontEncabezado = new Font("Arial", Font.ITALIC, 20);
        Font fontTexto = new Font("Arial", Font.PLAIN, 16);

        // Creación de los paneles
        JPanel panelGeneral = new JPanel();
        JPanel panelEncabezado = new JPanel();
        JPanel panelCuerpo = new JPanel();
        JPanel panelPie = new JPanel();

        // Creación de Layouts
        panelEncabezado.setLayout(new BorderLayout());
        panelCuerpo.setLayout(new GridBagLayout());
        panelPie.setLayout(new BorderLayout());

        // Creacion de etiquetas
        JLabel titulo = new JLabel("Estados");
        titulo.setFont(fontTitulo);
        JLabel formulario = new JLabel("Formulario para el registro de estados:");
        formulario.setFont(fontEncabezado);
        JLabel nombre = new JLabel("Nombre:");
        nombre.setFont(fontTexto);
        JLabel clave = new JLabel("Clave:");
        clave.setFont(fontTexto);
        JLabel descripcion = new JLabel("Descripción:");
        descripcion.setFont(fontTexto);
        JLabel fecha = new JLabel("Fecha de creación/modificación:");
        fecha.setFont(fontTexto);
        JLabel activo = new JLabel("Activo/Inactivo:");
        activo.setFont(fontTexto);
        JLabel tipo = new JLabel("Tipo:");
        tipo.setFont(fontTexto);

        // Campos de entrada
        JTextField nombreTextField = new JTextField(20);
        JTextField claveTextField = new JTextField(20);
        JTextField descripcionTextField = new JTextField(20);
        JLabel fechaLabel = new JLabel(getCurrentDateTime());
        JCheckBox activoCheckBox = new JCheckBox();
        JComboBox<String> tipoComboBox = new JComboBox<>(new String[]{"Tipo 1", "Tipo 2", "Tipo 3"});
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");

        // Agregar botones de radio al mismo grupo
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        // Agregar etiquetas y campos al panel cuerpo usando GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelCuerpo.add(nombre, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(nombreTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panelCuerpo.add(clave, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(claveTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panelCuerpo.add(descripcion, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(descripcionTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panelCuerpo.add(fecha, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(fechaLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panelCuerpo.add(activo, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(activoCheckBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panelCuerpo.add(tipo, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(tipoComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panelCuerpo.add(new JLabel(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panelCuerpo.add(radioButton1, gbc);

        gbc.gridx = 1;
        panelCuerpo.add(new JLabel(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panelCuerpo.add(radioButton2, gbc);

        // Agregar el título al panel de encabezado
        panelEncabezado.add(titulo, BorderLayout.NORTH);
        panelEncabezado.add(formulario, BorderLayout.CENTER);

        // Agregar al panel pie un botón centrado
        panelPie.add(new JButton("Guardar"), BorderLayout.CENTER);

        // Agregamos al panel General
        panelGeneral.setLayout(new BorderLayout());
        panelGeneral.add(panelEncabezado, BorderLayout.NORTH);
        panelGeneral.add(panelCuerpo, BorderLayout.CENTER);
        panelGeneral.add(panelPie, BorderLayout.SOUTH);

        // Agregamos finalmente a nuestra ventana
        miVentana.add(panelGeneral);

        // Hacemos visible nuestra ventana
        miVentana.setVisible(true);
    }

    // Método para obtener la fecha y hora actual formateada
    private static String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return currentDateTime.format(formatter);
    }
}
