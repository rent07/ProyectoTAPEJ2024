package Forms;

import javax.swing.*;

public class FormCiudades {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    String[] estados = {
            "Aguascalientes",
            "Baja California",
            "Baja California Sur",
            "Campeche",
            "Chiapas",
            "Chihuahua",
            "Coahuila de Zaragoza",
            "Colima",
            "Durango",
            "Estado de México",
            "Guanajuato",
            "Guerrero",
            "Hidalgo",
            "Jalisco",
            "Michoacán de Ocampo",
            "Morelos",
            "Nayarit",
            "Nuevo León",
            "Oaxaca",
            "Puebla",
            "Querétaro",
           "Quintana Roo",
            "San Luis Potosí",
            "Sinaloa",
            "Sonora",
            "Tabasco",
            "Tamaulipas",
            "Tlaxcala",
            "Veracruz de Ignacio de la Llave",
            "Yucatán",
            "Zacatecas"};
    private JComboBox comboBox1 = new JComboBox(estados);
    private JRadioButton a11000RadioButton;
    private JRadioButton a100110000RadioButton;
    private JRadioButton mayorA10000RadioButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton aceptarYGuardarButton;
    private JButton cancelarYSalirButton;
}
