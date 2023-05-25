package Practicas.ContadorDePalabras;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FrmConteoPalabras extends JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Map<String, Integer> frecuencias = new HashMap<>();

    public FrmConteoPalabras() {
        initComponents();
        crearMapa();
        llenarTabla();
    }

    private void crearMapa() {
        try {
            // Lee el archivo de texto
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\edchi\\IdeaProjects\\ParadigmasProgramacionII\\src\\Practicas\\ContadorDePalabras\\melville-moby_dick.txt"));
            String linea = reader.readLine();
            while (linea != null) {
                // Elimina los signos de puntuación y convierte a minúsculas
                linea = linea.replaceAll("[^a-z A-Z\\s]", "").toLowerCase();
                // Divide la línea en palabras
                StringTokenizer tokenizer = new StringTokenizer(linea);
                while (tokenizer.hasMoreTokens()) {
                    String palabra = tokenizer.nextToken();
                    // Actualiza la frecuencia de la palabra
                    if (frecuencias.containsKey(palabra)) {
                        int cuenta = frecuencias.get(palabra);
                        frecuencias.put(palabra, cuenta + 1);
                    } else {
                        frecuencias.put(palabra, 1);
                    }
                }
                linea = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void llenarTabla() {
        Object[] fila = new Object[2];
        // Recorre el mapa y llena la tabla
        for (Map.Entry<String, Integer> entry : frecuencias.entrySet()) {
            fila[0] = entry.getKey();
            fila[1] = entry.getValue();
            model.addRow(fila);
        }
    }

    private void initComponents () {
        JPanel panel = new JPanel (new BorderLayout () ) ;
        // Crea una tabla
        JTable table = new JTable (model);
        model.addColumn ("Palabra");
        model. addColumn ("No. de ocurrencias");
        JScrollPane scrollPane = new JScrollPane(table); // Agregar JScrollPane
        panel. add (scrollPane, BorderLayout.CENTER); // Usar JScrollPane en lugar de la tabla directamente

        // Agregar contenido a la tabla
        llenarTabla ();

        // Agregar el encabezado de la tabla al panel
        panel. add (table. getTableHeader () , BorderLayout. NORTH) ;

        setContentPane (panel);
        // Características de la ventana
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        setSize (400, 700);
        setTitle ("Frecuencia de palabras de un archivo de texto");
        setLocationRelativeTo (null);
    }


    public static void main(String[] args) {
        new FrmConteoPalabras().setVisible(true);
    }
}
