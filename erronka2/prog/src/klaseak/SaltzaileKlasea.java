package klaseak;

public class SaltzaileKlasea {
	
	protected String id;
	protected String erabiltzaile;
	protected String pasahitza;
	
	public SaltzaileKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param era
	 * @param pasa
	 */
	public SaltzaileKlasea(String ida, String era, String pasa) {
		this.id = ida;
		this.erabiltzaile = era;
		this.pasahitza = pasa;
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
	 * erabiltzaile bueltatu
	 * @return erabiltzaile
	 */
	public String getErabiltzailea() {
		return erabiltzaile;
	}
	/**
	 * er aldatu
	 * @param er
	 */
	public void setErabiltzailea(String er) {
		this.erabiltzaile = er;
	}
	/**
	 * pasahitza bueltatu
	 * @return pasahitza
	 */
	public String getPasahitza() {
		return pasahitza;
	}
	/**
	 * pas aldatu
	 * @param pas
	 */
	public void setPasahitza(String pas) {
		this.pasahitza = pas;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nErabiltzailea: "+erabiltzaile+"\nPasahitza: "+pasahitza;
	}
	
}