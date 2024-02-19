package layouts;

import javax.swing.*;
import java.awt.*;

public class InterfazProveedores {
    public static void main(String[] args) {

        //Definimos los valores iniciales de la ventana
        JFrame miVentana = new JFrame("Proveedores");
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
        BoxLayout boxLayout = new BoxLayout(panelEncabezado, BoxLayout.Y_AXIS);
        GridLayout gridLayoutCuerpo = new GridLayout(6,2);
        BorderLayout borderLayout = new BorderLayout();

        //Asignamos a cada panel su tipo de Layout
        panelGeneral.setLayout(borderLayout);
        panelEncabezado.setLayout(boxLayout);
        panelCuerpo.setLayout(gridLayoutCuerpo);

        //Creacion de etiquetas
        JLabel titulo = new JLabel("Proveedores");
        titulo.setFont(fontTitulo);
        JLabel formulario = new JLabel("Formulario para el registro de proveedores:");
        formulario.setFont(fontEncabezado);
        JLabel nombre  = new JLabel("Ingrese el nombre del proveedor");
        nombre.setFont(fontTexto);
        JLabel clave  = new JLabel("Ingrese la clave del proveedor");
        clave.setFont(fontTexto);
        JLabel sociedad = new JLabel("Seleccione la sociedad mercantil");
        sociedad.setFont(fontTexto);
        JLabel numero = new JLabel("Ingrese el número telefónico");
        numero.setFont(fontTexto);
        JLabel correo  = new JLabel("Ingrese el correo electrónico");
        correo.setFont(fontTexto);


        //Agregamos los componentes a los paneles
        panelEncabezado.add(titulo);
        panelEncabezado.add(formulario);
        panelCuerpo.add(nombre);
        panelCuerpo.add(new JTextField());
        panelCuerpo.add(clave);
        panelCuerpo.add(new JTextField());
        panelCuerpo.add(sociedad);
        String[] categoriasArray = {"S.A. de C.V", "S.C.", "S.A.S.", "S.A.P.I. de C.V.", "S.N.C", "S.R.L."};
        panelCuerpo.add(new JComboBox<>(categoriasArray));
        panelCuerpo.add(numero);
        panelCuerpo.add(new JTextField());
        panelCuerpo.add(correo);
        panelCuerpo.add(new JTextField());
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

