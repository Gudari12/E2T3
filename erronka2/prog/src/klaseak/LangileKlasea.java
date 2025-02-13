package klaseak;

public class LangileKlasea {
	
	protected String id;
	protected String izena;
	protected String abizena;
	protected String emaila;
	protected String telefonoa;
	protected String kontratazioData;
	protected String idNagusi;
	
	public LangileKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param iz
	 * @param abiz
	 * @param em
	 * @param tel
	 * @param konDat
	 * @param idnag
	 */
	public LangileKlasea(String ida, String iz, String abiz, String em, String tel, String konDat, String idnag) {
		this.id = ida;
		this.izena = iz;
		this.abizena = abiz;
		this.emaila = em;
		this.telefonoa = tel;
		this.kontratazioData = konDat;
		this.idNagusi = idnag;
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
	 * abizen bueltatu
	 * @return abizena
	 */
	public String getAbiz() {
		return abizena;
	}
	/**
	 * abizen aldatu
	 * @param abizen
	 */
	public void setAbiz(String abizen) {
		this.abizena = abizen;
	}
	/**
	 * emaila bueltatu
	 * @return emaila
	 */
	public String getEmaila() {
		return emaila;
	}
	/**
	 * e aldatu
	 * @param e
	 */
	public void setEmaila(String e) {
		this.emaila = e;
	}
	/**
	 * telefonoa bueltatu
	 * @return telefonoa
	 */
	public String getTelefonoa() {
		return telefonoa;
	}
	/**
	 * te aldatu
	 * @param te
	 */
	public void setTelefonoa(String te) {
		this.telefonoa = te;
	}
	/**
	 * kontratazioaData bueltatu
	 * @return kontratazioData
	 */
	public String getKontratazioData() {
		return kontratazioData;
	}
	/**
	 * kd aldatu
	 * @param kd
	 */
	public void setKontrataziodata(String kd) {
		this.kontratazioData = kd;
	}
	/**
	 * idnagusi bueltatu
	 * @return idNagusi
	 */
	public String getIdnagusi() {
		return idNagusi;
	}
	/**
	 * idn aldatu
	 * @param idn
	 */
	public void getIdNagusi(String idn) {
		this.idNagusi = idn;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nAbizena: "+abizena+"\nEmaila: "+emaila+"\nTelefonoa: "+telefonoa+"\nKontratazio-data: "+kontratazioData+"\nNagusiaren IDa: "+idNagusi;
	}
	
}
