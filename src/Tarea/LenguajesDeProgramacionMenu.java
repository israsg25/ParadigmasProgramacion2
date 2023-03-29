package Tarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LenguajesDeProgramacionMenu extends JFrame{
    static LinkedList<String> listaLenguajesProgramacion = new LinkedList<>();

    public LenguajesDeProgramacionMenu() {
        initUI();
    }

    private void initUI() {
        setTitle("Lenguajes de Programación 2023");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btnAgregar = new JButton("1.- Añadir elemento");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lenguaje = JOptionPane.showInputDialog(null, "Ingrese el lenguaje de programación:");
                if (lenguaje != null && !lenguaje.isEmpty()) {
                    listaLenguajesProgramacion.add(lenguaje);
                    JOptionPane.showMessageDialog(null, "Lenguaje agregado correctamente");
                }
            }
        });
        panel.add(btnAgregar);

        JButton btnAgregarFinal = new JButton("2.- Añadir elemento al final");
        btnAgregarFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lenguaje = JOptionPane.showInputDialog(null, "Ingrese el lenguaje de programación:");
                if (lenguaje != null && !lenguaje.isEmpty()) {
                    listaLenguajesProgramacion.addLast(lenguaje);
                    JOptionPane.showMessageDialog(null, "Lenguaje agregado correctamente al final de la lista");
                }
            }
        });
        panel.add(btnAgregarFinal);

        JButton btnAgregarInicio = new JButton("3.- Añadir elemento al principio");
        btnAgregarInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lenguaje = JOptionPane.showInputDialog(null, "Ingrese el lenguaje de programación:");
                if (lenguaje != null && !lenguaje.isEmpty()) {
                    listaLenguajesProgramacion.addFirst(lenguaje);
                    JOptionPane.showMessageDialog(null, "Lenguaje agregado correctamente al principio de la lista");
                }
            }
        });
        panel.add(btnAgregarInicio);

        JButton btnMostrar = new JButton("4.- Mostrar lista de lenguajes");
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String lenguaje : listaLenguajesProgramacion) {
                    sb.append(lenguaje);
                    sb.append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString(), "Lista de lenguajes de programación", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(btnMostrar);

        JButton btnSalir = new JButton("5.- Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(btnSalir);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LenguajesDeProgramacionMenu();
            }
        });
        System.out.println("Programa elaborado por Eduardo Israel Chimal Casimiro");
        listaLenguajesProgramacion.add("C++");
    }
}
