package klaseak;

public class BezeroKlasea {

	protected String id;
	protected String izena;
	protected String abizena;
	protected String helbidea;
	protected String emaila;
	
	public BezeroKlasea() {}
	public BezeroKlasea(String ida, String iz, String abiz, String helb, String email) {
		this.id = ida;
		this.izena = iz;
		this.abizena = abiz;
		this.helbidea = helb;
		this.emaila = email;
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
	
	public String getHelb() {
		return helbidea;
	}
	
	public void setHelb(String helbide) {
		this.helbidea = helbide;
	}
	
	public String getEmail() {
		return emaila;
	}
	
	public void setEmail(String email) {
		this.emaila = email;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nAbizena: "+abizena+"\nHelbidea: "+helbidea+"\nEmaila: "+emaila;
	}
	
}
