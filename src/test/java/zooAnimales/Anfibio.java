package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso ) {
		super( nombre,  edad,  habitat,  genero, null);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);	
	}
	public Anfibio() {
		super();
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String color) {
		this.colorPiel = color;
	}
	public boolean getVenenoso() {
		return venenoso;
	}
	public void setVenenoso( boolean veneno) {
		this.venenoso = veneno;
	}
	public ArrayList<Anfibio> getListado(){
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado){
		Anfibio.listado = listado;
	}
	public static int cantidadAnfibios() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;;
		return new Anfibio(nombre, edad, "selva", genero, "negro", false );
	}
}
