package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int contador = 0;
        for (Zona zona : zonas) {
            contador += zona.cantidadAnimales();
        }
        return contador;
    }

    public String getNombre() {
        return this.nombre;
    }
}
