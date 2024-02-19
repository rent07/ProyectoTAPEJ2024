package layouts;
import javax.swing.*;
import java.awt.*;

public class ClientesInterface extends JFrame {
    public static void main(String[] args) {

        // CREACION DE COMPONENTES
        JFrame miventana = new JFrame();
        miventana.setSize(400, 300);
        miventana.setTitle("Clientes");
        miventana.setLocationRelativeTo(null);
        miventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // CREACION DE PANELES PARA ENCABEZADO, CUERPO DE LA GUI Y PIE
        JPanel panelGeneral = new JPanel();
        panelGeneral.setLayout(new BorderLayout());

        JPanel panelEncabezado = new JPanel();
        JPanel panelCuerpo = new JPanel(new GridBagLayout()); // Cambiado a GridBagLayout
        JPanel panelPie = new JPanel();
        //JPanel panelWest = new JPanel();
        //GridLayout layout = new GridLayout(6, 1);
        panelPie.setLayout(new GridLayout(1, 2)); // Cuadrícula de una fila y tres columnas
        //panelWest.setLayout(layout);

        // CREACION DE COMPONENTES
        JLabel lblEncabezado = new JLabel();
        lblEncabezado.setText("Cliente");
        lblEncabezado.setFont(new Font("Serif", Font.BOLD, 40));
        panelEncabezado.setBackground(Color.lightGray);
        panelEncabezado.add(Box.createRigidArea(new Dimension(0, 30))); //Estas son áreas rígidas para que los cuadros de texto se acomoden
        panelEncabezado.add(Box.createHorizontalGlue()); //HorizontalGlue permite centrar lblEncabezado

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField jtxFNombre = new JTextField(10);

        JLabel lblDireccion = new JLabel("Dirección: ");
        JTextField jtxFDireccion = new JTextField(10);

        JLabel lblTelefono = new JLabel("Teléfono:");
        JTextField jtxTelefono = new JTextField(10);

        JLabel lblCiudad = new JLabel("Ciudad:");
        JComboBox<String> jCmbCiudad = new JComboBox<>();
        jCmbCiudad.addItem("VERACRUZ");
        jCmbCiudad.addItem("XALAPA");
        jCmbCiudad.addItem("BOCA DEL RIO");
        jCmbCiudad.addItem("ORIZABA");
        jCmbCiudad.addItem("ALVARADO");
        jCmbCiudad.addItem("CARDEL");

        JLabel lblGenero = new JLabel("Género");
        JRadioButton masculinoRadioButton = new JRadioButton("Masculino");
        JRadioButton femeninoRadioButton = new JRadioButton("Femenino");
        JRadioButton noDecirRadioButton = new JRadioButton("Prefiero no decir");
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(masculinoRadioButton);
        grupoGenero.add(femeninoRadioButton);
        grupoGenero.add(noDecirRadioButton);

        JLabel lblEdad = new JLabel("Edad:");
        JSpinner edad = new JSpinner(new SpinnerNumberModel(18, 1, 120, 1));

        JButton jBtnAceptar = new JButton("Aceptar");
        JButton jBtnCancelar = new JButton("Cancelar");

        // ADICION DE COMPONENTES A PANELES
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        // Adiciona los componentes al panel de cuerpo con GridBagLayout
        gbc.gridx = 1;
        gbc.gridy = 0;
        panelCuerpo.add(lblNombre, gbc);
        gbc.gridx = 2;
        panelCuerpo.add(jtxFNombre, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panelCuerpo.add(lblDireccion, gbc);
        gbc.gridx = 2;
        panelCuerpo.add(jtxFDireccion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panelCuerpo.add(lblTelefono, gbc);
        gbc.gridx = 2;
        panelCuerpo.add(jtxTelefono, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panelCuerpo.add(lblCiudad, gbc);
        gbc.gridx = 2;
        panelCuerpo.add(jCmbCiudad, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panelCuerpo.add(lblGenero, gbc);
        gbc.gridx = 1;
        panelCuerpo.add(masculinoRadioButton, gbc);
        gbc.gridx = 2;
        panelCuerpo.add(femeninoRadioButton, gbc);
        gbc.gridx = 3;
        panelCuerpo.add(noDecirRadioButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panelCuerpo.add(lblEdad, gbc);
        gbc.gridx = 2;
        panelCuerpo.add(edad, gbc);

        // ADICION DE PANELES AL FRAME
        panelEncabezado.setLayout(new BoxLayout(panelEncabezado,BoxLayout.X_AXIS));
        panelEncabezado.add(lblEncabezado);
        panelEncabezado.add(Box.createHorizontalGlue());
        panelPie.add(jBtnAceptar);
        panelPie.add(jBtnCancelar);

        panelGeneral.add(panelEncabezado, BorderLayout.NORTH);
        panelGeneral.add(panelCuerpo, BorderLayout.CENTER);
        panelGeneral.add(panelPie, BorderLayout.SOUTH);
        //panelGeneral.add(panelWest, BorderLayout.WEST);

        miventana.add(panelGeneral);
        miventana.setVisible(true);
    }
}
