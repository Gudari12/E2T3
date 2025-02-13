package klaseak;

public class KokalekuKlasea {
	
	protected String id;
	protected String helbidea;
	protected String postakodea;
	protected String udalerria;
	protected String probintzia;
	protected String idHerrialde;
	
	public KokalekuKlasea() {}
	/**
	 * Atributuak
	 * @param ida
	 * @param hel
	 * @param post
	 * @param ud
	 * @param prob
	 * @param idh
	 */
	public KokalekuKlasea(String ida, String hel,  String post, String ud, String prob, String idh) {
		this.id = ida;
		this.helbidea = hel;
		this.postakodea = post;
		this.udalerria = ud;
		this.probintzia = prob;
		this.idHerrialde = idh;
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
	 * helbidea bueltatu
	 * @return helbidea
	 */
	public String getHelbidea() {
		return helbidea;
	}
	/**
	 * he aldatu
	 * @param he
	 */
	public void setHelbidea(String he) {
		this.helbidea = he;
	}
	/**
	 * postakodea bueltatu
	 * @return postakodea
	 */
	public String getPostakodea() {
		return postakodea;
	}
	/**
	 * pos aldatu
	 * @param pos
	 */
	public void setPostakodea(String pos) {
		this.postakodea = pos;
	}
	/**
	 * udaleria bueltatu
	 * @return udalerria
	 */
	public String getUdalerria() {
		return udalerria;
	}
	/**
	 * u aldatu
	 * @param u
	 */
	public void setUdalerria(String u) {
		this.udalerria = u;
	}
	/**
	 * probintzia bueltatu
	 * @return probintzia
	 */
	public String getProbintzia() {
		return probintzia;
	}
	/**
	 * pro aldatu
	 * @param pro
	 */
	public void setProbintzia(String pro) {
		this.probintzia = pro;
	}
	/**
	 * idHerrialde bueltatu
	 * @return idHerrialde
	 */
	public String getIdHerrialde() {
		return idHerrialde;
	}
	/**
	 * idhe aldatu
	 * @param idhe
	 */
	public void setIdHerrialde(String idhe) {
		this.idHerrialde = idhe;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nHelbidea: "+helbidea+"\nPostakodea: "+postakodea+"\nUdalerria: "+udalerria+"\nProbintzia: "+probintzia+"\nHerrialdea: "+idHerrialde;
	}
	
}