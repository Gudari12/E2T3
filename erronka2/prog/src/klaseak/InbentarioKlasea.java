package klaseak;

public class InbentarioKlasea {
	
	protected String idProduktu;
	protected String idBiltegi;
	protected String kopurua;
	
	public InbentarioKlasea() {}
	/**
	 * Atributuak
	 * @param idp
	 * @param idb
	 * @param kop
	 */
	public InbentarioKlasea(String idp, String idb, String kop) {
		this.idProduktu = idp;
		this.idBiltegi = idb;
		this.kopurua = kop;
	}
	/**
	 * idProduktu bueltatu
	 * @return idProduktu
	 */
	public String getIdProd() {
		return idProduktu;
	}
	/**
	 * idpr aldatu
	 * @param idpr
	 */
	public void setIdProd(String idpr) {
		this.idProduktu = idpr;
	}
	/**
	 * idBiltegi bueltatu
	 * @return idBiltegi
	 */
	public String getIdBil() {
		return idBiltegi;
	}
	/**
	 * idbil aldatu
	 * @param idbil
	 */
	public void setIdBil(String idbil) {
		this.idBiltegi = idbil;
	}
	/**
	 * kopurua bueltatu
	 * @return kopurua
	 */
	public String getKopurua() {
		return kopurua;
	}
	/**
	 * ko aldatu
	 * @param ko
	 */
	public void setKopurua(String ko) {
		this.kopurua = ko;
	}
	
	
	@Override
	public String toString() {
		return "\nProduktuaren IDa: "+idProduktu+"\nBiltegiaren IDa: "+idBiltegi+"\nKopurua: "+kopurua;
	}
}
