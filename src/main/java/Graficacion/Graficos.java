package Graficacion;
import java.awt.*;

import javax.swing.*;

public class Graficos extends JFrame {

    private int longitud = 0;
    /** Creates new form MiGrafico */
    public Graficos(int longitud) {
        super("Graficadora de funciones");
        setSize(400, 500);
        setVisible(true);
        this.longitud = longitud;
        setLocationRelativeTo(null);
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
        //g.setColor(Color.BLUE);
        // for(int i = 0; i < this.longitud; i++) {
        //   g.drawLine(25+i, 125, 25+i, 125);
        // }
        System.out.println("Gráfica");
        for (int x = -longitud/2; x < longitud/2; x++) {
            int y0 = (int) (Math.pow(x, 2));
            int y1 = (int) (Math.pow(x+1, 2));
            g.drawLine(200 + x, (200 - y0), 200 + x + 1, 200 - y1);
            g.setColor(Color.RED);
        }
        System.out.println("Pentagono");
        //Pentagono
        g.setColor(new Color(127, 255, 212)); // Color aquamarina
        int[] xPoints = {200, 230, 260, 260, 230};
        int[] yPoints = {300, 330, 300, 270, 270};
        int nPoints = 5;
        Polygon pentagon = new Polygon(xPoints, yPoints, nPoints);
        g.drawPolygon(pentagon);

        //Función lineal
        System.out.println("Funcion  lineal");
        g.setColor(Color.GREEN);
        for (int x = -longitud / 2; x < longitud / 2; x++) {
            int y = 2 * x + 50;  // Ecuación de una función lineal
            g.drawLine(200 + x, (200 - y), 200 + x + 1, 200 - (2 * (x + 1) + 50));
        }
        // Dibuja la onda senoidal en azul
        System.out.println("Onda Senoidal");
        g.setColor(Color.BLUE);
        for (int x = -longitud / 2; x < longitud / 2; x++) {
            int y0 = (int) (50 * Math.sin(0.1 * x));
            int y1 = (int) (50 * Math.sin(0.1 * (x + 1)));
            g.drawLine(200 + x, (200 - y0), 200 + x + 1, 200 - y1);
        }
        // Octagono
        System.out.println("Octagono");
        g.setColor(Color.BLACK);
        int[] xOctagonPoints = {300, 330, 350, 350, 330, 300, 280, 280, 300};
        int[] yOctagonPoints = {310, 310, 330, 360, 380, 380, 360, 330, 310};
        int nOctagonPoints = 9;
        g.fillPolygon(xOctagonPoints, yOctagonPoints, nOctagonPoints);

        System.out.println("Eje X");
        g.drawLine(-400, 200, 400, 200);

        System.out.println("Eje Y");
        g.drawLine(200, -200, 200, 400);






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