package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
    }

    public int cantidadAnimales() {
        return this.animales.size();
    }

    public Zoologico getZoo() {
        return this.zoo;
    }

    public String getNombre() {
        return this.nombre;
    }
}
