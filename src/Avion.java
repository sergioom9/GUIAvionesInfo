import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

// Clase base Avion
class Avion {
    private String nombre;
    private int velocidad;

    public Avion(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    // Método para obtener la imagen del avión
    public ImageIcon getImagen() {
        // Debe implementarse para cada tipo de avión
        return null;
    }
}

// Clase hija AvionComercial
class AvionComercial extends Avion {
    public AvionComercial(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public ImageIcon getImagen() {
        // Aquí debes cargar la imagen correspondiente al avión comercial
        ImageIcon originalIcon = new ImageIcon("avionormal3.jpg");
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}

// Clase hija AvionCaza
class AvionCaza extends Avion {
    public AvionCaza(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public ImageIcon getImagen() {
        // Aquí debes cargar la imagen correspondiente al avión de caza
        ImageIcon originalIcon = new ImageIcon("avionrapido.jpg");
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}

// Clase hija AvionCarga
class AvionCarga extends Avion {
    public AvionCarga(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public ImageIcon getImagen() {
        // Aquí debes cargar la imagen correspondiente al avión de carga
        ImageIcon originalIcon = new ImageIcon("avioncaza.png");
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}



