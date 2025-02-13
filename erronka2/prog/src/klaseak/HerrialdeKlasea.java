package klaseak;

public class HerrialdeKlasea {
	protected String id;
	protected String izena;
	protected String idKontinente;
	
	public HerrialdeKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param iz
	 * @param idkon
	 */
	public HerrialdeKlasea(String ida, String iz, String idkon) {
		this.id = ida;
		this.izena = iz;
		this.idKontinente = idkon;
	}
	/**
	 * id bueltatu
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * ida aladtu
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
	 * izen aladatu
	 * @param izen
	 */
	public void setIzena(String izen) {
		this.izena = izen;
	}
	/**
	 * idKontinente bueltata
	 * @return idKontinente
	 */
	public String getIdkontinente() {
		return idKontinente;
	}
	/**
	 * idk aldatu
	 * @param idk
	 */
	public void setIdKontinente(String idk) {
		this.idKontinente = idk;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nKontinentearen IDa: "+idKontinente;
	}
	
}