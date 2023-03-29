package Metodo_Shuffle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class FrmCartas extends JFrame {

    // se declaran las variables que ocupará el formulario
    MazoDeCartas cartas;
    private List<Carta> listaCartas;

    // Se declara el constructor del formulario
    public FrmCartas() {
        initComponents();
        revolverCartas();
    }

    // Se declaran los métodos que ocupará el formulario por parte del usuario
    public void revolverCartas() {
        cartas = new MazoDeCartas();
        listaCartas = cartas.getListaCartas();
        agregarImagenes();
    }

    public void agregarImagenes() {
        asignarImagen(listaCartas.get(0).toString(), imagen1);
        asignarImagen(listaCartas.get(1).toString(), imagen2);
        asignarImagen(listaCartas.get(2).toString(), imagen3);
        asignarImagen(listaCartas.get(3).toString(), imagen4);
        asignarImagen(listaCartas.get(4).toString(), imagen5);
        asignarImagen(listaCartas.get(5).toString(), imagen6);
        asignarImagen(listaCartas.get(6).toString(), imagen7);
    }
    // fin de agregarImagenes

    public void asignarImagen(String nombreImagen, JLabel imagen) {
        ImageIcon picture;
        try {
            String carpeta = "cartas/";
            picture = new ImageIcon(getClass().getResource(carpeta + nombreImagen + ".png"));
            Icon imgEscalada = new ImageIcon(picture.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));
            imagen.setIcon(imgEscalada);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Se declara un método para inicializar los componentes del formulario
    private void initComponents() {
        imagen1 = new JLabel();
        imagen2 = new JLabel();
        imagen3 = new JLabel();
        imagen4 = new JLabel();
        imagen5 = new JLabel();
        imagen6 = new JLabel();
        imagen7 = new JLabel();
        lblTitulo = new JLabel();
        btnRevolver = new JButton("Revolver cartas");
        btnRevolver.setForeground(Color.white);
        btnRevolver.setBackground(Color.DARK_GRAY);
        btnRevolver.setFont(new Font("Dialog", 0, 30));
        btnRevolver.setPreferredSize(new Dimension(100, 60));
        btnRevolver.setHorizontalAlignment(SwingConstants.CENTER);
        // Características de la ventana
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 900);
        setLocationRelativeTo(null);
        // Establecer un layout de 3 renglones y una columna
        setLayout(new GridLayout(3, 1, 10, 10));
        // Características del título
        lblTitulo.setFont(new Font("Dialog", 0, 48));
        lblTitulo.setText("JUEGO DE CARTAS");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(100, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);
        add(btnRevolver);
        // eventos del botón
        btnRevolver.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                revolverCartas();
            }
        }
        );


        //Panel donde se colocan las imágenes
        panelImagenes = new JPanel();
        panelImagenes.setBackground(Color.black);
        panelImagenes.setLayout(new GridLayout(1, 7, 10, 10));
        add(panelImagenes);

        // Se establecen los tamaños de las etiquetas y se agregan al panel
        int altura = 180;
        int anchura = 120;
        imagen1.setSize(anchura, altura);
        imagen2.setSize(anchura, altura);
        imagen3.setSize(anchura, altura);
        imagen4.setSize(anchura, altura);
        imagen5.setSize(anchura, altura);
        imagen6.setSize(anchura, altura);
        imagen7.setSize(anchura, altura);
        panelImagenes.add(imagen1);
        panelImagenes.add(imagen2);
        panelImagenes.add(imagen3);
        panelImagenes.add(imagen4);
        panelImagenes.add(imagen5);
        panelImagenes.add(imagen6);
        panelImagenes.add(imagen7);
    }

    // Se declara el método main para ejecutar el formulario
    public static void main(String[] args) {
        new FrmCartas().setVisible(true);

    }

    // Se declaran los controles que llevara el formulario
    private JLabel lblTitulo;
    private JLabel imagen1;
    private JLabel imagen2;
    private JLabel imagen3;
    private JLabel imagen4;
    private JLabel imagen5;
    private JLabel imagen6;
    private JLabel imagen7;
    private JButton btnRevolver;
    JPanel panelImagenes;

}
