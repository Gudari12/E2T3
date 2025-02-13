package klaseak;

public class BezeroTel {
	
	protected String id;
	protected String idBez;
	protected String zenbakia;
	
	public BezeroTel() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param idab
	 * @param zb
	 */
	public BezeroTel(String ida, String idab, String zb) {
		this.id = ida;
		this.idBez = idab;
		this.zenbakia = zb;
	}
	/**
	 * id bueltatu
	 * @return id 
	 */
	public String getIdT() {
		return id;
	}
	/**
	 * id aldatu
	 * @param i
	 */
	public void setIdT(String i) {
		this.id = i;
	}
	/**
	 * idBez bueltatu
	 * @return idBez
	 */
	public String getIDBez() {
		return idBez;
	}
	/**
	 * ib aldatu
	 * @param ib
	 */
	public void setIDBez(String ib) {
		this.idBez = ib;
	}
	/**
	 * zenbakia bueltatu
	 * @return zenbakia
	 */
	public String getZenbakia() {
		return zenbakia;
	}
	/**
	 * zbk aldatu
	 * @param zbk
	 */
	public void setZenbakia(String zbk) {
		this.zenbakia = zbk;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nBezeroaren IDa: "+idBez+"\nTelefono-zenbakia: "+zenbakia;
	}
	
}
