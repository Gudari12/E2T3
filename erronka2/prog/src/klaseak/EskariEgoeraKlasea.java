package erronka2;

public class EskariEgoeraKlasea {
	
	protected String id;
	protected String deskribapena;
	
	public EskariEgoeraKlasea() {}
	public EskariEgoeraKlasea(String ida, String desk) {
		this.id = ida;
		this.deskribapena = desk;
	}
	
	public String getIdEE() {
		return id;
	}
	
	public void setIdEE(String ida) {
		this.id = ida;
	}
	
	public String getDeskEE() {
		return deskribapena;
	}
	
	public void setDeskEE(String des) {
		this.deskribapena = des;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nEgoera: "+deskribapena;
	}

}
