package klaseak;

public class KontinenteKlasea {
	
	protected String id;
	protected String izena;
	
	public KontinenteKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param iz
	 */
	public KontinenteKlasea(String ida, String iz) {
		this.id = ida;
		this.izena = iz;
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
	 * izena bueltatu
	 * @return izena
	 */
	public String getIzena() {
		return izena;
	}
	/**
	 * izen aldatu
	 * @param izen
	 */
	public void setIzena(String izen) {
		this.izena = izen;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena;
	}
	
}
