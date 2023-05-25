package VideoJuegos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultasVideojuegos extends JFrame {
    private List<Videojuego> videojuegos = new ArrayList<>();
    private JTextArea resultados = new JTextArea();

    DefaultTableModel model = new DefaultTableModel(new Object[]{"Titulo", "Plataforma", "Año", "Genero", "Publisher", "Ventas_NA", "Ventas_EU", "Ventas_JP", "Ventas_Globales"}, 0);

    // Constructor del formulario
    public ConsultasVideojuegos() {
        initComponents();
        llenarTabla();
    }

    private void llenarTabla() {
        videojuegos.add(new Videojuego(0, "Kinect Adventures!", "X360", 2010, "Misc", "Microsoft Game Studios", 14, 5, 2, 22));
        videojuegos.add(new Videojuego(1, "Grand Theft Auto V", "PS3", 2013, "Action", "Take-Two Interactive", 7, 9, 9, 20));
        videojuegos.add(new Videojuego(2, "Grand Theft Auto V", "X360", 2013, "Action", "Take-Two Interactive", 10, 5, 6, 16));
        videojuegos.add(new Videojuego(3, "Call of Duty: Modern Warfare 3", "X360", 2011, "Shooter", "Activision", 9, 4, 1, 15));
        videojuegos.add(new Videojuego(4, "Call of Duty: Black Ops", "X360", 2010, "Shooter", "Activision", 10, 4, 1, 15));
        videojuegos.add(new Videojuego(5, "Call of Duty: Black Ops 3", "PS4", 2015, "Shooter", "Activision", 6, 6, 3, 14));
        videojuegos.add(new Videojuego(6, "Call of Duty: Black Ops II", "PS3", 2012, "Shooter", "Activision", 5, 6, 6, 14));
        videojuegos.add(new Videojuego(7, "Call of Duty: Black Ops II", "X360", 2012, "Shooter", "Activision", 8, 4, 1, 13));
        videojuegos.add(new Videojuego(8, "Call of Duty: Modern Warfare 2", "X360", 2009, "Shooter", "Activision", 8, 4, 8, 13));
        videojuegos.add(new Videojuego(9, "Call of Duty: Modern Warfare 3", "PS3", 2011, "Shooter", "Activision", 6, 6, 5, 13));

        for (Videojuego v : videojuegos) {
            model.addRow(new Object[]{
                    v.getTitulo(),
                    v.getPlataforma(),
                    v.getAnio(),
                    v.getGenero(),
                    v.getPublisher(),
                    v.getVentasNA(),
                    v.getVentasEU(),
                    v.getVentasJP(),
                    v.getVentasGlobales()});
        }
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelBotones = new JPanel(new GridLayout(3, 2));
        JPanel panelTabla = new JPanel(new BorderLayout());

        // Botón 1: Mostrar solo los títulos de los videojuegos
        JButton btnMostrarTitulos = new JButton("Mostrar solo los títulos de los videojuegos");
        btnMostrarTitulos.addActionListener(e -> {
            List<String> titulos = videojuegos.stream().map(v -> v.getTitulo()).collect(Collectors.toList());
            resultados.setText("Títulos\n"+String.join("\n", titulos));
        });
        panelBotones.add(btnMostrarTitulos);

        // Botón 2: Mostrando la columna Año
        JButton btnMostrarAnios = new JButton("Mostrando la columna Año");
        btnMostrarAnios.addActionListener(e -> {
            List<String> anios = videojuegos.stream().map(v -> Integer.toString(v.getAnio())).collect(Collectors.toList());
            resultados.setText("Años\n"+String.join("\n", anios));
        });
        panelBotones.add(btnMostrarAnios);

        // Botón 3: Suma de los valores de la columna Ventas_NA
        JButton btnSumaVentasNA = new JButton("Suma de los valores de la columna Ventas_NA");
        btnSumaVentasNA.addActionListener(e -> {
            int sumaVentasNA = videojuegos.stream().mapToInt(v -> v.getVentasNA()).sum();
            resultados.setText("La suma de los valores de la columna Ventas_NA es: "+Integer.toString(sumaVentasNA));
        });
        panelBotones.add(btnSumaVentasNA);

        // Botón 4: Obtener los valores máximo y mínimo de Ventas_JP
        JButton btnMinMaxVentasJP = new JButton("Obtener los valores máximo y mínimo de Ventas_JP");
        btnMinMaxVentasJP.addActionListener(e -> {
            int maxVentasJP = videojuegos.stream().mapToInt(v -> v.getVentasJP()).max().orElse(0);
            int minVentasJP = videojuegos.stream().mapToInt(v -> v.getVentasJP()).min().orElse(0);
            resultados.setText("Valor máximo de Ventas_JP: " + maxVentasJP + "\nValor mínimo de Ventas_JP: " + minVentasJP);
        });
        panelBotones.add(btnMinMaxVentasJP);
        // Botón 5: Obtener el promedio de las ventas globales
        JButton btnPromedioVentasGlobales = new JButton("Obtener el promedio de las ventas globales");
        btnPromedioVentasGlobales.addActionListener(e -> {
            double promedioVentasGlobales = videojuegos.stream().mapToInt(v -> v.getVentasGlobales()).average().orElse(0);
            resultados.setText("El promedio de las ventas globales es: " + promedioVentasGlobales);
        });
        panelBotones.add(btnPromedioVentasGlobales);

// Botón 6: Mostrar solo las columnas Titulo y Plataforma
        JButton btnMostrarTituloPlataforma = new JButton("Mostrar solo las columnas Titulo y Plataforma");
        btnMostrarTituloPlataforma.addActionListener(e -> {
            String[] columnas = {"Titulo", "Plataforma"};
            Object[][] data = videojuegos.stream()
                    .map(v -> new Object[]{v.getTitulo(), v.getPlataforma()})
                    .toArray(Object[][]::new);
            JTable tablaTituloPlataforma = new JTable(data, columnas);
            JScrollPane scrollPane = new JScrollPane(tablaTituloPlataforma);
            tablaTituloPlataforma.setFillsViewportHeight(true);
            resultados.removeAll();
            resultados.setLayout(new BorderLayout());
            resultados.add(scrollPane, BorderLayout.CENTER);
            resultados.revalidate();
        });
        panelBotones.add(btnMostrarTituloPlataforma);

        // Botón 7: Salir
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> System.exit(0));
        panelBotones.add(btnSalir);

        panelTabla.add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);

        panel.add(panelBotones, BorderLayout.NORTH);
        panel.add(panelTabla, BorderLayout.CENTER);

        resultados.setEditable(false);

        add(panel, BorderLayout.CENTER);
        add(resultados, BorderLayout.SOUTH);

        setTitle("Consultas Videojuegos");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        ConsultasVideojuegos consultas = new ConsultasVideojuegos();
        consultas.setVisible(true);
    }

}

