package erronka2;

public class EskariKlasea {

	protected String id;
	protected String idBezero;
	protected String idEgoera;
	protected String idSaltzaile;
	protected String eskaeraData;
	
	public EskariKlasea() {}
	public EskariKlasea(String ida, String idb, String eg, String ids, String eskda) {
		this.id = ida;
		this.idBezero = idb;
		this.idEgoera = eg;
		this.idSaltzaile = ids;
		this.eskaeraData = eskda;
	}
	
	public String getIdEs() {
		return id;
	}
	
	public void setIdEs(String i) {
		this.id = i;
	}
	
	public String getIdBezEs() {
		return idBezero;
	}
	
	public void setIdBezEs(String idbe) {
		this.idBezero = idbe;
	}
	
	public String getIdEg() {
		return idEgoera;
	}
	
	public void setIdEg(String ideg) {
		this.idEgoera = ideg;
	}
	
	public String getIdSaEs() {
		return idSaltzaile;
	}
	
	public void setIdSaEs(String idsal) {
		this.idSaltzaile = idsal;
	}
	
	public String getEskData() {
		return eskaeraData;
	}
	
	public void setEskData(String eskda) {
		this.eskaeraData = eskda;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+idBezero+"\nAbizena: "+idEgoera+"\nHelbidea: "+idSaltzaile+"\nEmaila: "+eskaeraData;
	}
}
