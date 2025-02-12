package klaseak;

public class BezeroTel {
	
	protected String id;
	protected String idBez;
	protected String zenbakia;
	
	public BezeroTel() {}
	public BezeroTel(String ida, String idab, String zb) {
		this.id = ida;
		this.idBez = idab;
		this.zenbakia = zb;
	}
	
	public String getIdT() {
		return id;
	}
	
	public void setIdT(String i) {
		this.id = i;
	}
	
	public String getIDBez() {
		return idBez;
	}
	
	public void setIDBez(String ib) {
		this.idBez = ib;
	}
	
	public String getZenbakia() {
		return zenbakia;
	}
	
	public void setZenbakia(String zbk) {
		this.zenbakia = zbk;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nBezeroaren IDa: "+idBez+"\nTelefono-zenbakia: "+zenbakia;
	}
	
}
