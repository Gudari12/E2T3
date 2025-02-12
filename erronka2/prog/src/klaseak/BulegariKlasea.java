package erronka2;

public class BulegariKlasea {
	
	protected String id;
	protected String idLanpostu;
	
	
	public BulegariKlasea() {}
	public BulegariKlasea(String ida, String idl) {
		this.id = ida;
		this.idLanpostu = idl;
	}
	
	public String getIdBu() {
		return id;
	}
	
	public void setIdBu(String ida) {
		this.id = ida;
	}
	
	public String getIdLanpostu() {
		return idLanpostu;
	}
	
	public void setIdLanpostu(String idl) {
		this.idLanpostu = idl;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nLanpostuaren IDa: "+idLanpostu;
	}
	
}
