package org.example;

import javax.swing.*;
import java.awt.*;

public class InterfazCiudades {
    public static void main(String[] args){
        //ventana
        JFrame ventana = new JFrame();
        ventana.setSize(700,500);
        ventana.setLocation(400,100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelGeneral = new JPanel();
        JPanel panelEncabezado = new JPanel();
        JPanel panelPie = new JPanel();
        JPanel panelDtGenerales = new JPanel();
        JPanel panelDtDemograficos = new JPanel();
        JPanel panelDtSocioCulturales = new JPanel();
        JPanel panelCuerpo = new JPanel();

        BoxLayout boxLayout = new BoxLayout(panelEncabezado,BoxLayout.Y_AXIS);
        BoxLayout boxLayout1 = new BoxLayout(panelGeneral,BoxLayout.Y_AXIS);
        GridLayout gridLayout = new GridLayout(1,2);
        GridBagLayout gridBagLayout = new GridBagLayout();

        Font fontTitulo = new Font("Arial", Font.BOLD, 24);
        Font fontEncabezado = new Font("Arial", Font.ITALIC, 20);
        Font fontTexto = new Font("Arial", Font.PLAIN, 16);
        Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);

        //etiquetas
        JLabel tituloVentana = new JLabel("Ciudades");
        tituloVentana.setFont(fontTitulo);
        JLabel etqEncabezado = new JLabel("Ingresar datos de Ciudad");
        etqEncabezado.setFont(fontEncabezado);

        JLabel sbttDatosGenerales = new JLabel("Datos Generales");
        sbttDatosGenerales.setFont(fontSubtitulo);
        JLabel etqClave = new JLabel("Clave");
        etqClave.setFont(fontTexto);
        JLabel etqNombre = new JLabel("Nombre");
        etqNombre.setFont(fontTexto);

        JLabel sbttDatosDemograficos = new JLabel("Datos demograficos");
        sbttDatosDemograficos.setFont(fontSubtitulo);
        JLabel etqMunicipio = new JLabel("Municipio");
        etqMunicipio.setFont(fontTexto);
        JLabel etqEstado = new JLabel("Estado");
        etqEstado.setFont(fontTexto);
        JLabel etqPais = new JLabel("Pais");
        etqPais.setFont(fontTexto);
        JLabel etqPoblacion = new JLabel("Poblacion");
        etqPoblacion.setFont(fontTexto);
        JLabel etqArea = new JLabel("Area en mts^2");
        etqArea.setFont(fontTexto);
        JLabel etqAltitud = new JLabel("Altitud");
        etqAltitud.setFont(fontTexto);

        JLabel sbttDatosSocioCulturales = new JLabel("Datos Socio-Culturales");
        sbttDatosSocioCulturales.setFont(fontSubtitulo);
        JLabel etqPresidente = new JLabel("Presidente o alcalde");
        etqPresidente.setFont(fontTexto);
        JLabel etqActEconomica = new JLabel("Principal actividad economica");
        etqActEconomica.setFont(fontTexto);
        JLabel etqEvnHist = new JLabel("Evento historico importante");
        etqEvnHist.setFont(fontTexto);
        JLabel etqGentilicio = new JLabel("Gentilicio");
        etqGentilicio.setFont(fontTexto);

        panelEncabezado.setLayout(boxLayout);
        panelDtGenerales.setLayout(gridBagLayout);
        panelDtSocioCulturales.setLayout(gridBagLayout);
        panelDtDemograficos.setLayout(gridBagLayout);
        panelCuerpo.setLayout(gridLayout);
        panelPie.setLayout(gridLayout);
        panelGeneral.setLayout(boxLayout1);

        //panel encabezado
        panelEncabezado.add(etqEncabezado);

        //panel datos generales
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets= new Insets(5,5,5,5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelDtGenerales.add(sbttDatosGenerales,gbc);
        gbc.gridy=1;
        gbc.gridx=0;
        panelDtGenerales.add(etqClave,gbc);
        gbc.gridy=1;
        gbc.gridx=1;
        panelDtGenerales.add(new JTextField(10),gbc);
        gbc.gridy=2;
        gbc.gridx=0;
        panelDtGenerales.add(etqNombre,gbc);
        gbc.gridy=2;
        gbc.gridx=1;
        panelDtGenerales.add(new JTextField(10),gbc);

        //Panel datos demograficos
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelDtDemograficos.add(sbttDatosDemograficos,gbc);
        gbc.gridy++;
        panelDtDemograficos.add(etqMunicipio,gbc);
        gbc.gridy++;
        panelDtDemograficos.add(etqEstado,gbc);
        gbc.gridy++;
        panelDtDemograficos.add(etqPais,gbc);
        gbc.gridy++;
        panelDtDemograficos.add(etqPoblacion,gbc);
        gbc.gridy++;
        panelDtDemograficos.add(etqArea,gbc);
        gbc.gridy++;
        panelDtDemograficos.add(etqAltitud,gbc);

        gbc.gridx++;
        gbc.gridy=1;
        gbc.weightx=1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panelDtDemograficos.add(new JTextField(10),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JTextField(10),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JTextField(10),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JTextField(10),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JTextField(10),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JTextField(10),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JLabel(" "),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JLabel(" "),gbc);
        gbc.gridy++;
        panelDtDemograficos.add(new JLabel(""),gbc);

        //panel datos socio-culturales
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelDtSocioCulturales.add(sbttDatosSocioCulturales,gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(etqPresidente,gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(etqGentilicio,gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(etqActEconomica,gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(etqEvnHist,gbc);

        gbc.gridx++;
        gbc.gridy=1;
        gbc.weightx=1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panelDtSocioCulturales.add(new JTextField(5),gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(new JTextField(5),gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(new JTextField(5),gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(new JTextField(5),gbc);
        gbc.gridy++;
        panelDtSocioCulturales.add(new JTextField(5),gbc);

        //agregar panel de datos demograficos y panel de datos socioculturales
        //a panel cuerpo
        panelCuerpo.add(panelDtDemograficos);
        panelCuerpo.add(panelDtSocioCulturales);

        //agregamos al panel pie
        panelPie.add(new JButton("Aceptar"));
        panelPie.add(new JButton("Cancelar"));

        // agregamos todo al panel General
        panelGeneral.add(panelEncabezado);
        panelEncabezado.add(panelDtGenerales);
        panelGeneral.add(panelCuerpo);
        panelGeneral.add(panelPie);
        ventana.add(panelGeneral);
        ventana.setVisible(true);
    }
}
/*
quedamos en:
Clave
Nombre

Municipio
Estado
País
Población
Área en m^2
Altitud

Alcalde o representante
Principal Actividad económica
Evento Histórico importante
Gentilicio
 */