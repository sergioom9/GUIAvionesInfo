import javax.swing.*;
import java.awt.*;

// Clase para la GUI
public class AvionesGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tipos de Aviones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 4));

        // Crear instancias de los aviones
        Avion avionComercial = new AvionComercial("Boeing 747", 900);
        Avion avionCaza = new AvionCaza("F-16", 1500);
        Avion avionCarga = new AvionCarga("Airbus A300", 800);

        // Agregar las imágenes de los aviones a la GUI
        frame.add(createAvionPanel(avionComercial));
        frame.add(createAvionPanel(avionCaza));
        frame.add(createAvionPanel(avionCarga));

        frame.pack();
        frame.setVisible(true);
    }

    // Método para crear un panel con la imagen y la información del avión
    private static JPanel createAvionPanel(Avion avion) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel nombreLabel = new JLabel("Nombre: " + avion.getNombre());
        JLabel velocidadLabel = new JLabel("Velocidad: " + avion.getVelocidad() + " km/h");
        JLabel imagenLabel = new JLabel(avion.getImagen());

        panel.add(nombreLabel, BorderLayout.NORTH);
        panel.add(velocidadLabel, BorderLayout.CENTER);
        panel.add(imagenLabel, BorderLayout.SOUTH);

        return panel;
    }
}