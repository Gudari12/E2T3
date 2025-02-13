package klaseak;

public class BiltegiKlasea {
	
	protected String id;
	protected String izena;
	protected String idKokaleku;
	
	public BiltegiKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param iz
	 * @param idk
	 */
	public BiltegiKlasea(String ida, String iz, String idk) {
		this.id = ida;
		this.izena = iz;
		this.idKokaleku = idk;
	}
	/**
	 * id bueltatu
	 * @return id
	 */
	public String getIdB() {
		return id;
	}
	/**
	 * i aldatu
	 * @param i
	 */
	public void setIdB(String i) {
		this.id = i;
	}
	/**
	 * izena bueltatu
	 * @return izena
	 */
	public String getIzenaB() {
		return izena;
	}
	/**
	 * izen aldatu
	 * @param izen
	 */
	public void setIzenaB(String izen) {
		this.izena = izen;
	}
	/**
	 * idKokaleku bueltatu
	 * @return idKokaleku
	 */
	public String getKokalekuarenID() {
		return idKokaleku;
	}
	/**
	 * idko aldatu
	 * @param idko
	 */
	public void setKokalekuarenID(String idko) {
		this.idKokaleku = idko;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nKokalekuaren IDa: "+idKokaleku;
	}
	
}
