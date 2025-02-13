package klaseak;

public class LanpostuKlasea {
	
	protected String id;
	protected String deskribapena;
	
	public LanpostuKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param desk
	 */
	public LanpostuKlasea(String ida, String desk) {
		this.id = ida;
		this.deskribapena = desk;
	}
	/**
	 * id bueltatu
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * ida aldatu
	 * @param ida
	 */
	public void setId(String ida) {
		this.id = ida;
	}
	/**
	 * deskribapena bueltatu
	 * @return deskribapena
	 */
	public String getDeskribapena() {
		return deskribapena;
	}
	/**
	 * des aldatu
	 * @param des
	 */
	public void setDeskribapena(String des) {
		this.deskribapena = des;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nDeskribapena: "+deskribapena;
	}
	
}
