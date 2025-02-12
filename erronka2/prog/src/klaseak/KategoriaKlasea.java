package erronka2;

public class KategoriaKlasea {
	
	protected String id;
	protected String izena;
	
	public KategoriaKlasea() {}
	public KategoriaKlasea(String ida, String iz) {
		this.id = ida;
		this.izena = iz;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String ida) {
		this.id = ida;
	}
	
	public String getIzena() {
		return izena;
	}
	
	public void setIzena(String izen) {
		this.izena = izen;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena;
	}
	
}