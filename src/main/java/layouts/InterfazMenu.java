package layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazMenu extends JFrame {
    public InterfazMenu() {
        // Configuración del JFrame
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear componentes
        JLabel labelMenu = new JLabel("Menú");
        labelMenu.setFont(new Font("Serif", Font.BOLD, 40));

        JButton btnClientes = new JButton("Clientes");
        JButton btnCiudades = new JButton("Ciudades");
        JButton btnProveedores = new JButton("Proveedores");
        JButton btnProductos = new JButton("Productos");
        JButton btnEstados = new JButton("Estados");
        JButton btnReporte = new JButton("Reporte");
        JButton btnSalir = new JButton("Salir");

        // Configuración del layout
        setLayout(new BorderLayout());

        JPanel panelEncabezado = new JPanel();
        panelEncabezado.add(labelMenu);

        JPanel panelCuerpo = new JPanel();
        panelCuerpo.setLayout(new GridLayout(6, 1, 10, 10)); // 6 filas y 1 columnas
        panelCuerpo.add(btnClientes);
        panelCuerpo.add(btnCiudades);
        panelCuerpo.add(btnProveedores);
        panelCuerpo.add(btnProductos);
        panelCuerpo.add(btnEstados);
        panelCuerpo.add(btnReporte);

        JPanel panelPie = new JPanel();
        panelPie.add(btnSalir);

        // Agregar componentes al JFrame
        add(panelEncabezado, BorderLayout.NORTH);
        add(panelCuerpo, BorderLayout.CENTER);
        add(panelPie, BorderLayout.SOUTH);

        // Manejo de eventos
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazMenu().setVisible(true);
            }
        });
    }
}
