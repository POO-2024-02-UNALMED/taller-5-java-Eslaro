package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private ArrayList<Zona> zonas;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zonas = new ArrayList<>();
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public void agregarZona(Zona zona) {
        this.zonas.add(zona);
    }

    public String movimiento() {
        return "desplazarse";
    }

    @Override
    public String toString() {
        if (zonas.isEmpty()) {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
                   " y mi genero es " + genero + ".";
        } else {
            Zona zona = zonas.get(0);
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
                   " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() +
                   ", en el " + zona.getZoo().getNombre() + ".";
        }
    }
}


