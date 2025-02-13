package klaseak;

public class BulegariKlasea {
	
	protected String id;
	protected String idLanpostu;
	
	
	public BulegariKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param idl
	 */
	public BulegariKlasea(String ida, String idl) {
		this.id = ida;
		this.idLanpostu = idl;
	}
	/**
	 * id bueltatu
	 * @return id
	 */
	public String getIdBu() {
		return id;
	}
	/**
	 * ida aldatu
	 * @param ida
	 */
	public void setIdBu(String ida) {
		this.id = ida;
	}
	/**
	 * idLanpostu bueltatu
	 * @return isLanpostu
	 */
	public String getIdLanpostu() {
		return idLanpostu;
	}
	/**
	 * idl aldatu
	 * @param idl
	 */
	public void setIdLanpostu(String idl) {
		this.idLanpostu = idl;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nLanpostuaren IDa: "+idLanpostu;
	}
	
}
