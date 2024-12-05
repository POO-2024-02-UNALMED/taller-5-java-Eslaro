package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola ) {
		super( nombre,  edad,  habitat,  genero, null);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);	
	}
	public Pez() {
		super();
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola( int largoCola) {
		this.largoCola = largoCola;
	}
	public ArrayList<Pez> getListado(){
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado){
		Pez.listado = listado;
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6 );
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6 );
	}
	
}


