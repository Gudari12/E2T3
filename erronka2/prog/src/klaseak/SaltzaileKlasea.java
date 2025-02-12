package erronka2;

public class SaltzaileKlasea {
	
	protected String id;
	protected String erabiltzaile;
	protected String pasahitza;
	
	public SaltzaileKlasea() {}
	public SaltzaileKlasea(String ida, String era, String pasa) {
		this.id = ida;
		this.erabiltzaile = era;
		this.pasahitza = pasa;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String ida) {
		this.id = ida;
	}
	
	public String getErabiltzailea() {
		return erabiltzaile;
	}
	
	public void setErabiltzailea(String er) {
		this.erabiltzaile = er;
	}
	
	public String getPasahitza() {
		return pasahitza;
	}
	
	public void setPasahitza(String pas) {
		this.pasahitza = pas;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nErabiltzailea: "+erabiltzaile+"\nPasahitza: "+pasahitza;
	}
	
}