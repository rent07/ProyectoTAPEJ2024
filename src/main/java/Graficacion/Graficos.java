package Graficacion;
import java.awt.*;

import javax.swing.*;

public class Graficos extends JFrame {

    private int longitud = 0;
    /** Creates new form MiGrafico */
    public Graficos(int longitud) {
        super("Graficadora de funciones");
        setSize(10, 830);
        setVisible(true);
        this.longitud = longitud;

        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        // super.paint(g);
        // establecer nuevo color de dibujo utilizando enteros
        // g.setColor(new Color(255, 0, 0));
        // g.fillRect(25, 25, 100, 20);
        // g.drawString("RGB actual: " + g.getColor(), 130, 40);

        // // establecer nuevo color de dibujo utilizando valores float
        // g.setColor(new Color(0.0f, 1.0f, 0.0f));
        // g.fillRect(25, 50, 100, 20);
        // g.drawString("RGB actual: " + g.getColor(), 130, 65);

        // // establecer nuevo color de dibujo utilizando objetos Color estáticos
        // g.setColor(Color.BLUE);
        // g.fillRect(25, 75, 100, 20);
        // g.drawString("RGB actual: " + g.getColor(), 130, 90);

        // // mostrar valores RGB individuales
        // Color color = Color.MAGENTA;
        // g.setColor(color);
        // g.fillRect(25, 100, 100, 20);
        // g.drawString("Valores RGB: " + color.getRed() + ", " +
        //     color.getGreen() + ", " + color.getBlue(), 130, 115);

        // // Lineas
        // g.setColor(Color.BLUE);
        // g.drawLine(25, 125, 300, 200);
        // g.setColor(Color.ORANGE);
        // g.drawLine(25, 125, 25, 200);
        // g.setColor(Color.YELLOW);
        // g.drawLine(200, 125, 25, 200);
        // g.setColor(Color.CYAN);
        // g.drawLine(200, 125, 300, 200);
        g.setColor(Color.BLUE);
        // for(int i = 0; i < this.longitud; i++) {
        //   g.drawLine(25+i, 125, 25+i, 125);
        // }
        System.out.println("Gráfica");
        for (int x = -longitud/2; x < longitud/2; x++) {
            int y0 = (int) (Math.pow(x, 2));
            int y1 = (int) (Math.pow(x+1, 2));
            g.drawLine(200 + x, (200 - y0), 200 + x + 1, 200 - y1);
        }

        // // Rectangulos
        // g.setColor(Color.RED);
        // g.drawRect(25, 225, 300, 20);

        // // Rectangulos rendondeados
        // g.setColor(Color.GREEN);
        // g.drawRoundRect(25, 250, 300, 20, 10, 10);

        // g.drawOval(25, 275, 300, 20);

        // g.setColor(Color.ORANGE);

        // g.draw3DRect(25, 300, 300, 20, true);

        // g.fill3DRect(25, 300, 300, 20, true);

        // @SuppressWarnings("unchecked")
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    public static void main(String[] args) {
        try {
            int longitud = Integer.parseInt(args[0]);
            Graficos g = new Graficos(longitud);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            Graficos g = new Graficos(0);
        }
    }
}