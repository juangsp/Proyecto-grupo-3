
public class Videojuego {

  private int id;
	private String nombre;
	private int precio;
	private int categoria;
	private GregorianCalendar lanzamiento;
	private String imagen;
	
	
	

	public Videojuego() {
		
	}
	public Videojuego(int id,String nombre, int precio, int categoria, GregorianCalendar lanzamiento, String imagen) {
		
		this.id= id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.lanzamiento = lanzamiento;
		this.imagen = imagen;
		
			
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public GregorianCalendar getLanzamiento() {
		return lanzamiento;
	}
	public void setLanzamiento(GregorianCalendar lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	@Override
	public String toString() {
		return "Videojuego [Nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", lanzamiento="
				+ lanzamiento + ", imagen=" + imagen + "]";
	}
	
}
