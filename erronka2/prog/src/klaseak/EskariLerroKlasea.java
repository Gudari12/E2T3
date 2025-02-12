package erronka2;

public class EskariLerroKlasea {
	
	protected String idEskari;
	protected String idLerro;
	protected String idProduktu;
	protected String kopurua;
	protected String salneurria;
	
	public EskariLerroKlasea() {}
	public EskariLerroKlasea(String ides, String idel, String idpro, String kop, String saln) {
		this.idEskari = ides;
		this.idLerro = idel;
		this.idProduktu = idpro;
		this.kopurua = kop;
		this.salneurria = saln;
	}
	
	public String getIdEL() {
		return idEskari;
	}
	
	public void setIdEL(String ide) {
		this.idEskari = ide;
	}
	
	public String getIdL() {
		return idLerro;
	}
	
	public void setIdL(String idl) {
		this.idLerro = idl;
	}
	
	public String getIdProdEL() {
		return idProduktu;
	}
	
	public void setIdProdEL(String idp) {
		this.idProduktu = idp;
	}
	
	public String getKopEL() {
		return kopurua;
	}
	
	public void setKopEL(String idko) {
		this.kopurua = idko;
	}
	
	public String getSalnEL() {
		return salneurria;
	}
	
	public void setSalnEL(String sal) {
		this.salneurria = sal;
	}
	
	
	@Override
	public String toString() {
		return "\nEskariaren IDa: "+idEskari+"\nLerroaren IDa: "+idLerro+"\nProduktuaren IDa: "+idProduktu+"\nKopurua: "+kopurua+"\nSalneurria: "+salneurria;
	}

}
