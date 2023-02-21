package Practicas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class FrmArrayListCelulares extends JFrame{
    //Se declaran las variables que ocupara el formulario
    DefaultListModel modelo = new DefaultListModel();
    ArrayList<String> listaCelulares = new ArrayList<>();

    //Se declara el constructor del formulario
    public FrmArrayListCelulares() {
        initComponents();
        listaCelulares.add("Samsung");
        listaCelulares.add("Apple");
        listaCelulares.add("Xiaomi");
        listaCelulares.add("Motorola");
        listaCelulares.add("Lg");
        listaCelulares.add("Hiawei");
        listaCelulares.add("Sony");
        listaCelulares.add("ZTE");
        listaCelulares.add("BLU");
        listaCelulares.add("OPPO");
        llenarJListCelulares();
    }

    //Se declaran los metodos que ocupara el formulario por parte del usuario
    public void llenarJListCelulares() {
        modelo.removeAllElements();
        for (int i= 0; i < listaCelulares.size(); i++) {
            modelo.addElement(listaCelulares.get(i));
        }
    }

    //Se declara un metodo para inicializar los componentes del formulario
    private void initComponents() {
        lblTitulo = new JLabel();
        //Caracteristicas de la ventana
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        //Establecer un layout de 2 renglones y una columna
        setLayout(new GridLayout(2, 1, 20, 20));
        //Caracteristicas del titulo
        lblTitulo.setFont(new Font("Dialog", 0, 48));
        lblTitulo.setText("Celulares");
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setPreferredSize(new Dimension(300, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);

        JList<Object> JListAmigos = new JList<>();
        JListAmigos.setPreferredSize(new Dimension(60, 30));
        JListAmigos.setVisibleRowCount(5);  //muestra cinco filas a la vez
        JListAmigos.setModel(modelo);

        panelParteinferior = new JPanel();
        panelParteinferior.setBackground(Color.gray);
        panelParteinferior.setLayout(new GridLayout(1, 2, 20, 20));
        add(panelParteinferior);
        panelParteinferior.add(add(new JScrollPane(JListAmigos)));

        //Panel donde se colocaran los botones
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.gray);
        panelBotones.setLayout(new GridLayout(4, 1, 10, 10));
        panelParteinferior.add(panelBotones);

        //Se establecen los botones y se agregan al panel
        btnAgregar = new JButton("Agregar");
        btnBuscar = new JButton("Buscar");
        btnBorrar = new JButton("Borrar");
        btnSalir = new JButton("Salir");

        //eventos
        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarActionPerformed(event);
                    }
                }
        );// fin btnAgregar.addActionListener
        btnBuscar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnBuscarActionPerformed(event);
                    }
                }
        ); // fin btnBuscar.addActionlistener
        btnBorrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) { btnBorrarActionPerformed(event);
                    }
                }
        ); //fin btnBorrar.addActionlistener
        btnSalir.addActionListener( new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent event) {
                                            btnSalirActionPerformed(event);
                                        }
                                    }
        ); // fin btnSalir.addActionListener
        panelBotones.add(btnAgregar);
        panelBotones.add(btnBuscar);
        panelBotones.add(btnBorrar);
        panelBotones.add(btnSalir);
    }

    //Listado de eventos
    public void btnAgregarActionPerformed(ActionEvent event) {
        String nombreCelular = JOptionPane.showInputDialog("Escribe un nombre: ");
        if (nombreCelular.equals(" ") || nombreCelular == null) {
            return;
        }
        listaCelulares.add(nombreCelular);
        llenarJListCelulares();
    }

    public void btnBuscarActionPerformed(ActionEvent event) {
        String nombreCelular = JOptionPane.showInputDialog("Escribe un nombre a buscar: ");
        if  (nombreCelular.equals("") || nombreCelular == null) {
            return;
        }

        if (listaCelulares.contains(nombreCelular)) {
            JOptionPane.showMessageDialog(this, "El celular si se encuentra");
        } else {
            JOptionPane.showMessageDialog(this, "El celular no se encuentra");
        }
    }

    public void btnBorrarActionPerformed(ActionEvent event) {
        String nombreCelular = JOptionPane.showInputDialog("Escribe un nombre a borrar: ");
        if  (nombreCelular.equals("") || nombreCelular == null) {
            return;
        }
        Iterator<String> iterador = listaCelulares.iterator(); while (iterador.hasNext()) {
            if (nombreCelular.equals(iterador.next())) { iterador.remove();
                JOptionPane.showMessageDialog(this, "El celular se ha eliminado");
            }
        }
        llenarJListCelulares();
    }

    public void btnSalirActionPerformed(ActionEvent event) {
        System.exit(0);
    }


    // Se declara el metodo main para ejecutar el formulario
    public static void main(String[] args) {
        new FrmArrayListCelulares().setVisible(true);
    }

    // Se declaran las controles que llevara el formulario private Jlist<String> JListCelular;
    private JLabel lblTitulo;
    private JButton btnAgregar;
    private JButton btnBuscar;
    private JButton btnBorrar;
    private JButton btnSalir;
    JPanel panelBotones;
    JPanel panelParteinferior;
}



