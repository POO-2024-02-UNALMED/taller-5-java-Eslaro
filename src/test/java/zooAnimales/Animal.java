package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;

    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }
 
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

   
    public String movimiento() {
        return "desplazarse";
    }


    public static String totalPorTipo() {
    
        int mamiferos = Mamifero.cantidadMamiferos();
        int aves = Ave.cantidadAves();
        int reptiles = Reptil.cantidadReptiles();
        int peces = Pez.cantidadPeces();
        int anfibios = Anfibio.cantidadAnfibios();

        return "Mamiferos: " + mamiferos +
               "\nAves: " + aves +
               "\nReptiles: " + reptiles +
               "\nPeces: " + peces +
               "\nAnfibios: " + anfibios;
    }


    @Override
    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + nombre +
                   ", tengo una edad de " + edad +
                   ", habito en " + habitat +
                   " y mi genero es " + genero +
                   ", la zona en la que me ubico es " + zona.getNombre() +
                   ", en el " + zona.getZoo().getNombre() + ".";
        } else {
            return "Mi nombre es " + nombre +
                   ", tengo una edad de " + edad +
                   ", habito en " + habitat +
                   " y mi genero es " + genero + ".";
        }
    }
}

