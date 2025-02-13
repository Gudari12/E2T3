package klaseak;

public class EskariLerroKlasea {
	
	protected String idEskari;
	protected String idLerro;
	protected String idProduktu;
	protected String kopurua;
	protected String salneurria;
	
	public EskariLerroKlasea() {}
	/**
	 * Atributuak
	 * @param ides
	 * @param idel
	 * @param idpro
	 * @param kop
	 * @param saln
	 */
	public EskariLerroKlasea(String ides, String idel, String idpro, String kop, String saln) {
		this.idEskari = ides;
		this.idLerro = idel;
		this.idProduktu = idpro;
		this.kopurua = kop;
		this.salneurria = saln;
	}
	/**
	 * idEskari bueltatu
	 * @return idEskari
	 */
	public String getIdEL() {
		return idEskari;
	}
	/**
	 * ide aldatu
	 * @param ide
	 */
	public void setIdEL(String ide) {
		this.idEskari = ide;
	}
	/**
	 * idLerro bueltatu
	 * @return idLerro
	 */
	public String getIdL() {
		return idLerro;
	}
	/**
	 * idl aldatu
	 * @param idl
	 */
	public void setIdL(String idl) {
		this.idLerro = idl;
	}
	/**
	 * idProduktu bueltatu
	 * @return idProduktu
	 */
	public String getIdProdEL() {
		return idProduktu;
	}
	/**
	 * idp aldatu
	 * @param idp
	 */
	public void setIdProdEL(String idp) {
		this.idProduktu = idp;
	}
	/**
	 * kopurua bueltatu
	 * @return kopurua
	 */
	public String getKopEL() {
		return kopurua;
	}
	/**
	 * idko aldatu
	 * @param idko
	 */
	public void setKopEL(String idko) {
		this.kopurua = idko;
	}
	/**
	 * salneurria bueltatu
	 * @return salneurria
	 */
	public String getSalnEL() {
		return salneurria;
	}
	/**
	 * sal aldatu
	 * @param sal
	 */
	public void setSalnEL(String sal) {
		this.salneurria = sal;
	}
	
	
	@Override
	public String toString() {
		return "\nEskariaren IDa: "+idEskari+"\nLerroaren IDa: "+idLerro+"\nProduktuaren IDa: "+idProduktu+"\nKopurua: "+kopurua+"\nSalneurria: "+salneurria;
	}

}
