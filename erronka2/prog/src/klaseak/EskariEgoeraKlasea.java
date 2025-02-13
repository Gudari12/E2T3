package klaseak;

public class EskariEgoeraKlasea {
	
	protected String id;
	protected String deskribapena;
	
	public EskariEgoeraKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param desk
	 */
	public EskariEgoeraKlasea(String ida, String desk) {
		this.id = ida;
		this.deskribapena = desk;
	}
	/**
	 * id bueltatu
	 * @return id
	 */
	public String getIdEE() {
		return id;
	}
	/**
	 * ida aldatu
	 * @param ida
	 */
	public void setIdEE(String ida) {
		this.id = ida;
	}
	/**
	 * deskribapena bueltatu
	 * @return deskribapena
	 */
	public String getDeskEE() {
		return deskribapena;
	}
	/**
	 * des aldatu
	 * @param des
	 */
	public void setDeskEE(String des) {
		this.deskribapena = des;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nEgoera: "+deskribapena;
	}

}
