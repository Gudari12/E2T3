package erronka2;

public class LanpostuKlasea {
	
	protected String id;
	protected String deskribapena;
	
	public LanpostuKlasea() {}
	public LanpostuKlasea(String ida, String desk) {
		this.id = ida;
		this.deskribapena = desk;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String ida) {
		this.id = ida;
	}
	
	public String getDeskribapena() {
		return deskribapena;
	}
	
	public void setDeskribapena(String des) {
		this.deskribapena = des;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nDeskribapena: "+deskribapena;
	}
	
}
