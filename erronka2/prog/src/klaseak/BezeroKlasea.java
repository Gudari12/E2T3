package klaseak;

public class BezeroKlasea {

	protected String id;
	protected String izena;
	protected String abizena;
	protected String helbidea;
	protected String emaila;
	
	public BezeroKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param iz
	 * @param abiz
	 * @param helb
	 * @param email
	 */
	public BezeroKlasea(String ida, String iz, String abiz, String helb, String email) {
		this.id = ida;
		this.izena = iz;
		this.abizena = abiz;
		this.helbidea = helb;
		this.emaila = email;
	}
	/**
	 * ida bueltatzen du
	 * @return ida 
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
	 * izena bueltatzen du
	 * @return izena 
	 */
	public String getIzena() {
		return izena;
	}
	/**
	 * izena aldatu
	 * @param izen
	 */
	public void setIzena(String izen) {
		this.izena = izen;
	}
	/**
	 * abizena bueltatzen du
	 * @return abizena 
	 */
	public String getAbiz() {
		return abizena;
	}
	/**
	 * abizena aldatu
	 * @param abizen
	 */
	public void setAbiz(String abizen) {
		this.abizena = abizen;
	}
	/**
	 * helbidea bueltatzen du
	 * @return helbidea 
	 */
	public String getHelb() {
		return helbidea;
	}
	/**
	 * helbide aldatu
	 * @param helbide
	 */
	public void setHelb(String helbide) {
		this.helbidea = helbide;
	}
	/**
	 * emaila bueltatzen du
	 * @return emaila 
	 */
	public String getEmail() {
		return emaila;
	}
	/**
	 * email aldatu
	 * @param email
	 */
	public void setEmail(String email) {
		this.emaila = email;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nAbizena: "+abizena+"\nHelbidea: "+helbidea+"\nEmaila: "+emaila;
	}
	
}
