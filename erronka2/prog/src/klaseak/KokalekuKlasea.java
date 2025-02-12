package erronka2;

public class KokalekuKlasea {
	
	protected String id;
	protected String helbidea;
	protected String postakodea;
	protected String udalerria;
	protected String probintzia;
	protected String idHerrialde;
	
	public KokalekuKlasea() {}
	public KokalekuKlasea(String ida, String hel,  String post, String ud, String prob, String idh) {
		this.id = ida;
		this.helbidea = hel;
		this.postakodea = post;
		this.udalerria = ud;
		this.probintzia = prob;
		this.idHerrialde = idh;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String ida) {
		this.id = ida;
	}
	
	public String getHelbidea() {
		return helbidea;
	}
	
	public void setHelbidea(String he) {
		this.helbidea = he;
	}
	
	public String getPostakodea() {
		return postakodea;
	}
	
	public void setPostakodea(String pos) {
		this.postakodea = pos;
	}
	
	public String getUdalerria() {
		return udalerria;
	}
	
	public void setUdalerria(String u) {
		this.udalerria = u;
	}
	
	public String getProbintzia() {
		return probintzia;
	}
	
	public void setProbintzia(String pro) {
		this.probintzia = pro;
	}
	
	public String getIdHerrialde() {
		return idHerrialde;
	}
	
	public void setIdHerrialde(String idhe) {
		this.idHerrialde = idhe;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nHelbidea: "+helbidea+"\nPostakodea: "+postakodea+"\nUdalerria: "+udalerria+"\nProbintzia: "+probintzia+"\nHerrialdea: "+idHerrialde;
	}
	
}