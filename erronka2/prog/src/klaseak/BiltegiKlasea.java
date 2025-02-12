package erronka2;

public class BiltegiKlasea {
	
	protected String id;
	protected String izena;
	protected String idKokaleku;
	
	public BiltegiKlasea() {}
	public BiltegiKlasea(String ida, String iz, String idk) {
		this.id = ida;
		this.izena = iz;
		this.idKokaleku = idk;
	}
	
	public String getIdB() {
		return id;
	}
	
	public void setIdB(String i) {
		this.id = i;
	}
	
	public String getIzenaB() {
		return izena;
	}
	
	public void setIzenaB(String izen) {
		this.izena = izen;
	}
	
	public String getKokalekuarenID() {
		return idKokaleku;
	}
	
	public void setKokalekuarenID(String idko) {
		this.idKokaleku = idko;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nKokalekuaren IDa: "+idKokaleku;
	}
	
}
