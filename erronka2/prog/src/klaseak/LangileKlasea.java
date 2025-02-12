package erronka2;

public class LangileKlasea {
	
	protected String id;
	protected String izena;
	protected String abizena;
	protected String emaila;
	protected String telefonoa;
	protected String kontratazioData;
	protected String idNagusi;
	
	public LangileKlasea() {}
	public LangileKlasea(String ida, String iz, String abiz, String em, String tel, String konDat, String idnag) {
		this.id = ida;
		this.izena = iz;
		this.abizena = abiz;
		this.emaila = em;
		this.telefonoa = tel;
		this.kontratazioData = konDat;
		this.idNagusi = idnag;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String ida) {
		this.id = ida;
	}
	
	public String getIzena() {
		return izena;
	}
	
	public void setIzena(String izen) {
		this.izena = izen;
	}
	
	public String getAbiz() {
		return abizena;
	}
	
	public void setAbiz(String abizen) {
		this.abizena = abizen;
	}
	
	public String getEmaila() {
		return emaila;
	}
	
	public void setEmaila(String e) {
		this.emaila = e;
	}
	
	public String getTelefonoa() {
		return telefonoa;
	}
	
	public void setTelefonoa(String te) {
		this.telefonoa = te;
	}
	
	public String getKontratazioData() {
		return kontratazioData;
	}
	
	public void setKontrataziodata(String kd) {
		this.kontratazioData = kd;
	}
	
	public String getIdnagusi() {
		return idNagusi;
	}
	
	public void getIdNagusi(String idn) {
		this.idNagusi = idn;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nAbizena: "+abizena+"\nEmaila: "+emaila+"\nTelefonoa: "+telefonoa+"\nKontratazio-data: "+kontratazioData+"\nNagusiaren IDa: "+idNagusi;
	}
	
}
