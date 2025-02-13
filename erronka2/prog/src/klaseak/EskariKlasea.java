package klaseak;

public class EskariKlasea {

	protected String id;
	protected String idBezero;
	protected String idEgoera;
	protected String idSaltzaile;
	protected String eskaeraData;
	
	public EskariKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param idb
	 * @param eg
	 * @param ids
	 * @param eskda
	 */
	public EskariKlasea(String ida, String idb, String eg, String ids, String eskda) {
		this.id = ida;
		this.idBezero = idb;
		this.idEgoera = eg;
		this.idSaltzaile = ids;
		this.eskaeraData = eskda;
	}
	/**
	 * id bueltatu
	 * @return id
	 */
	public String getIdEs() {
		return id;
	}
	/**
	 * i aldatu
	 * @param i
	 */
	public void setIdEs(String i) {
		this.id = i;
	}
	/**
	 * idBezero aldatu
	 * @return idBezero
	 */
	public String getIdBezEs() {
		return idBezero;
	}
	/**
	 * idbe aldatu
	 * @param idbe
	 */
	public void setIdBezEs(String idbe) {
		this.idBezero = idbe;
	}
	/**
	 * idEgorera bueltatu
	 * @return idEgoera
	 */
	public String getIdEg() {
		return idEgoera;
	}
	/**
	 * ideg aldatu
	 * @param ideg
	 */
	public void setIdEg(String ideg) {
		this.idEgoera = ideg;
	}
	/**
	 * idSaltzaile bueltatu
	 * @return idSaltzaile
	 */
	public String getIdSaEs() {
		return idSaltzaile;
	}
	/**
	 * idsal aldatu
	 * @param idsal
	 */
	public void setIdSaEs(String idsal) {
		this.idSaltzaile = idsal;
	}
	/**
	 * eskaeraData bueltatu
	 * @return eskaeraData
	 */
	public String getEskData() {
		return eskaeraData;
	}
	/**
	 * eskda aldatu
	 * @param eskda
	 */
	public void setEskData(String eskda) {
		this.eskaeraData = eskda;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+idBezero+"\nAbizena: "+idEgoera+"\nHelbidea: "+idSaltzaile+"\nEmaila: "+eskaeraData;
	}
}
