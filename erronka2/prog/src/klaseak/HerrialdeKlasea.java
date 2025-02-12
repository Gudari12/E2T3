package erronka2;

public class HerrialdeKlasea {
	protected String id;
	protected String izena;
	protected String idKontinente;
	
	public HerrialdeKlasea() {}
	public HerrialdeKlasea(String ida, String iz, String idkon) {
		this.id = ida;
		this.izena = iz;
		this.idKontinente = idkon;
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
	
	public String getIdkontinente() {
		return idKontinente;
	}
	
	public void setIdKontinente(String idk) {
		this.idKontinente = idk;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nKontinentearen IDa: "+idKontinente;
	}
	
}