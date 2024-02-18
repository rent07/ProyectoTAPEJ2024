package layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExampleComboBox implements ItemListener{//usamos la interfaz de ItemListener
    JPanel cards; //el panel que contendrá las cards
    final static String ROPAPANEL = "Ropa";
    final static String HOGARPANEL = "Hogar";
    final static String ZAPTERIAPANEL = "Zapateria";

    public void addComponentToPane(Container panel) {//agregar componentes al panel
        //colocar la combobox en el panel
        JPanel comboBoxPanel = new JPanel(); //usando FlowLayout
        JComboBox jCmbCategoria = new JComboBox();
        jCmbCategoria.addItem("Ropa");
        jCmbCategoria.addItem("Hogar");
        jCmbCategoria.addItem("Zapateria");
        jCmbCategoria.setEditable(false);
        jCmbCategoria.addItemListener(this);// agregamos listener para que detecte
        comboBoxPanel.add(jCmbCategoria);           //cuando seleccionamos una categoría

        //Crear las "cards".
        JPanel cardRopa = new JPanel();
        cardRopa.add(new JButton("Camisas"));
        cardRopa.add(new JButton("Pantalones"));
        cardRopa.add(new JButton("Vestidos"));

        JPanel cardHogar = new JPanel();
        cardHogar.add(new JButton("Cocina"));
        cardHogar.add(new JButton("Habitaciones"));
        cardHogar.add(new JButton("Sala de estar"));
        cardHogar.add(new JButton("Decoraciones"));

        JPanel cardZapateria = new JPanel();
        cardZapateria.add(new JButton("Tenis"));
        cardZapateria.add(new JButton("Zapatillas"));
        cardZapateria.add(new JButton("Botas"));
        cardZapateria.add(new JButton("Zapatos"));
        cardZapateria.add(new JButton("Chanclas"));

        //Creamos el panel que contiene las "cards".
        cards = new JPanel(new CardLayout());
        cards.add(cardRopa, ROPAPANEL);
        cards.add(cardHogar, HOGARPANEL);
        cards.add(cardZapateria, ZAPTERIAPANEL);

        panel.add(comboBoxPanel, BorderLayout.PAGE_START);//agregamos al panel general la comboBox
        panel.add(cards, BorderLayout.CENTER);//agregamos al panel general las "cards"
    }

    public void itemStateChanged(ItemEvent evt) {//cambia la pantalla entre las diferentes categorias
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());//mostrar la card solicitada
    }


    private static void createAndShowGUI() {
        //Crear la ventana
        JFrame ventana = new JFrame("Tienda departamental");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(5000,4000);
        ventana.setLocation(400,250);

        //crear y colocar el contenido del panel en la ventana
        CardLayoutExampleComboBox demo = new CardLayoutExampleComboBox();
        demo.addComponentToPane(ventana.getContentPane());

        //mostrar la ventana.
        ventana.pack();
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        // se usan excepciones
        try {
            //para evitar errores
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

