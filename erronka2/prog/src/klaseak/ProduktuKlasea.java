package klaseak;

public class ProduktuKlasea {
	
	protected String id;
	protected String izena;
	protected String deskribapena;
	protected String balioa;
	protected String salneurria;
	protected String idKategoria;
	
	public ProduktuKlasea() {}
	/**
	 * 
	 * @param ida
	 * @param iz
	 * @param desk
	 * @param bal
	 * @param saln
	 * @param idkat
	 */
	public ProduktuKlasea(String ida, String iz, String desk, String bal, String saln, String idkat) {
		this.id = ida;
		this.izena = iz;
		this.deskribapena = desk;
		this.balioa = bal;
		this.salneurria = saln;
		this.idKategoria = idkat;
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
	/**
	 * deskribapena bueltatu
	 * @return deskribapena
	 */
	public String getDeskribapena() {
		return deskribapena;
	}
	/**
	 * de aldatu
	 * @param de
	 */
	public void setDeskribapena(String de) {
		this.deskribapena = de;
	}
	/**
	 * balioa bueltatu
	 * @return balioa
	 */
	public String getBalioa() {
		return balioa;
	}
	/**
	 * ba aldatu
	 * @param ba
	 */
	public void setBalioa(String ba) {
		this.balioa = ba;
	}
	/**
	 * salneurria bueltatu
	 * @return salneurria
	 */
	public String getSalneurria() {
		return salneurria;
	}
	/**
	 * sa aldatu
	 * @param sa
	 */
	public void setSalneurria(String sa) {
		this.salneurria = sa;
	}
	/**
	 * idKategoria bueltatu
	 * @return idKategoria
	 */
	public String getIdkategoria() {
		return idKategoria;
	}
	/**
	 * ik aldatu
	 * @param ik
	 */
	public void setIdKategoria(String ik) {
		this.idKategoria = ik;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nDeskribapena: "+deskribapena+"\nBalioa: "+balioa+"\nSalneurria: "+salneurria+"\nKategoriaren IDa: "+idKategoria;
	}
	
}