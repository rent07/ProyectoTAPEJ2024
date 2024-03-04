package EscritorioGrafico;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.*;

public class Paint extends JFrame {
    private int cuentaPuntos = 0;

    // arreglo de 2000 referencias a java.awt.Point
    private Point puntos[] = new Point[2000];
    private Color colores[] = new Color[2000];
    private Integer pinceles[] = new Integer[2000];

    // configurar GUI y registrar manejador de eventos de ratón
    public Paint() {
        super("Un programa simple de dibujo");

        // crear una etiqueta y colocarla en la parte SOUTH del esquema BorderLayout
        getContentPane().add(new JLabel("Arrastre el ratón para dibujar"),
                BorderLayout.SOUTH);
        getContentPane().add(new JButton("Borrar"), BorderLayout.NORTH);
        addMouseMotionListener(new MouseMotionAdapter() { // clase interna anónima
                                   // almacenar coordenadas de arrastre y llamar a repaint
                                   public void mouseDragged(MouseEvent evento) {
                                       if (cuentaPuntos < puntos.length) {
                                           System.out.println("Entro en puntos.length " + cuentaPuntos);
                                           if (cuentaPuntos < 100) {

                                               colores[cuentaPuntos] = Color.red;
                                               pinceles[cuentaPuntos] = 5;
                                               System.out.println(evento.getX());
                                           } else {
                                               if (cuentaPuntos < 500) {
                                                   colores[cuentaPuntos] = Color.BLUE;
                                                   pinceles[cuentaPuntos] = 8;
                                               } else {
                                                   colores[cuentaPuntos] = Color.GREEN;
                                                   pinceles[cuentaPuntos] = 12;

                                                   if (cuentaPuntos < 1000) {
                                                       colores[cuentaPuntos] = Color.BLACK;
                                                       pinceles[cuentaPuntos] = 15;
                                                   }
                                               }

                                           }
                                           puntos[cuentaPuntos] = evento.getPoint();
                                           ++cuentaPuntos;
                                           repaint();
                                       }
                                   }

                               } // fin de la clase interna anónima

        ); // fin de la llamada a addMouseMotionListener

        setBounds(500, 400, 800, 650);
        setVisible(true);

    } // fin del constructor de Paint

    // dibujar óvalo en un cuadro delimitador de 4 por 4 en ubicación especificada
    // en ventana
    public void paint(Graphics g) {
        super.paint(g); // borra el área de dibujo
        // g.setColor(Color.RED);

        for (int i = 0; i < puntos.length && puntos[i] != null; i++) {
            g.setColor(colores[i]);
            g.fillOval(puntos[i].x, puntos[i].y, pinceles[i], pinceles[i]);
        }

    }

}