package EscritorioGrafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

public class Paint extends JFrame {
    private List<Point> puntos = new ArrayList<>();
    private List<Color> colores = new ArrayList<>();
    private List<Integer> tamanosPinceles = new ArrayList<>();
    private Color colorPincel = Color.BLACK; // Color por defecto para el pincel
    private int tamanoPincel = 5; // Tamaño por defecto para el pincel
    private boolean modoGoma = false;
    private int figura = 0;
    Graphics g;

    public Paint() {
        super("Paint");

        // Panel para los controles
        JPanel panelControles = new JPanel(new GridBagLayout());

        // Panel para el título
        JPanel panelTitulo = new JPanel();
        JLabel labelTitulo = new JLabel("PROGRAMA SIMPLE DE DIBUJO");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 24)); // Cambiar el tamaño y el estilo de la fuente
        panelTitulo.add(labelTitulo);

        // Panel para el tamaño
        JPanel panelTamaño = new JPanel();
        panelTamaño.setBorder(BorderFactory.createTitledBorder("Tamaño"));
        JButton botonMenos = new JButton("-");
        JButton botonMas = new JButton("+");
        panelTamaño.add(botonMenos);
        panelTamaño.add(botonMas);

        // Panel para las herramientas
        JPanel panelHerramientas = new JPanel();
        panelHerramientas.setBorder(BorderFactory.createTitledBorder("Herramientas"));
        JButton botonPincel = new JButton("Pincel");
        JButton botonGoma = new JButton("Goma");
        panelHerramientas.add(botonPincel);
        panelHerramientas.add(botonGoma);

        // Panel para el color
        JPanel panelColor = new JPanel();
        panelColor.setBorder(BorderFactory.createTitledBorder("Color"));
        JButton botonColor = new JButton("Seleccionar Color");
        panelColor.add(botonColor);

        // Panel para restaurar
        JPanel panelRestaurar = new JPanel();
        panelRestaurar.setBorder(BorderFactory.createTitledBorder("Restaurar"));
        JButton bottonRegresar = new JButton("Atrás");
        panelRestaurar.add(bottonRegresar);
        JButton botonBorrar = new JButton("Borrar Todo");
        panelRestaurar.add(botonBorrar);

        //panel para figuras
        JPanel panelFiguras = new JPanel(new GridLayout(2,2));
        panelFiguras.setBorder(BorderFactory.createTitledBorder("Figuras"));
        JButton botonCuadrado = new JButton("Cuadrado");
        JButton botonRectangulo = new JButton("Rectangulo");
        JButton botonCirculo = new JButton("Circulo");
        JButton botonOvalo = new JButton("Ovalo");
        panelFiguras.add(botonCirculo);
        panelFiguras.add(botonCuadrado);
        panelFiguras.add(botonOvalo);
        panelFiguras.add(botonRectangulo);

        panelControles.add(panelTamaño);
        panelControles.add(panelHerramientas);
        panelControles.add(panelColor);
        panelControles.add(panelRestaurar);
       // panelControles.add(panelFiguras);

        // Panel para el área de dibujo
        JPanel panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Establecer el fondo blanco
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
                for (int i = 0; i < puntos.size(); i++) {
                    g.setColor(colores.get(i));
                    g.fillOval(puntos.get(i).x, puntos.get(i).y, tamanosPinceles.get(i), tamanosPinceles.get(i));
                }
            }
        };
        panelDibujo.setPreferredSize(new Dimension(800, 500));
        panelDibujo.setBackground(Color.WHITE); // Establecer el fondo del panel de dibujo como blanco

        // Listener Botones
        bottonRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(puntos.size()>0 && colores.size()>0 && tamanosPinceles.size()>0){
                    puntos.remove(puntos.size()-1);
                    colores.remove(colores.size()-1);
                    tamanosPinceles.remove(tamanosPinceles.size()-1);
                    panelDibujo.repaint();
                }
            }
        });
        botonMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tamanoPincel > 5) {
                    tamanoPincel -= 5;
                }
            }
        });

        botonMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tamanoPincel < 50) {
                    tamanoPincel += 5;
                }
            }
        });

        botonColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPincel = JColorChooser.showDialog(null, "Seleccionar Color", colorPincel);
            }
        });

        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                puntos.clear();
                colores.clear();
                tamanosPinceles.clear();
                panelDibujo.repaint();
            }
        });

        botonPincel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modoGoma = false;
                colorPincel = Color.BLACK; // Cambiar a pincel negro por defecto
            }
        });

        botonGoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modoGoma = true;
            }
        });

        botonCirculo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                figura= 1;
            }
        });
        botonCuadrado.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                figura= 2;
            }
        });
        botonOvalo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                figura= 3;
            }
        });
        botonRectangulo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {figura= 4;}
        });
        // Agregar los paneles a la ventana
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelTitulo, BorderLayout.NORTH);
        getContentPane().add(panelControles, BorderLayout.CENTER);
        getContentPane().add(panelDibujo, BorderLayout.SOUTH);

        //Valores iniciales de la Ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); //Hace que al reajustar el tamaño del frame sus elementos se reajusten para que no se desordenen
        setLocationRelativeTo(null);//Hace que el frame se localice justo en el centro de la pantalla
        setResizable(false);
        setVisible(true);

        // Agrega un MouseMotionListener al panel de dibujo para dibujar
        panelDibujo.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evento) {
                if (modoGoma) { // Si estamos en modo goma, pintamos de blanco
                    puntos.add(evento.getPoint());
                    colores.add(Color.WHITE);
                    tamanosPinceles.add(tamanoPincel);
                    panelDibujo.repaint();
                } else {
                    puntos.add(evento.getPoint());
                    colores.add(colorPincel);
                    tamanosPinceles.add(tamanoPincel);
                    panelDibujo.repaint();
                }
            }
        });
        //panelDibujo.addMouseListener((MouseMotionAdapter) MouseClicked(MouseEvent e));
    }
}
