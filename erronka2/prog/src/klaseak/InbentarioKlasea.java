package klaseak;

public class InbentarioKlasea {
	
	protected String idProduktu;
	protected String idBiltegi;
	protected String kopurua;
	
	public InbentarioKlasea() {}
	public InbentarioKlasea(String idp, String idb, String kop) {
		this.idProduktu = idp;
		this.idBiltegi = idb;
		this.kopurua = kop;
	}
	
	public String getIdProd() {
		return idProduktu;
	}
	
	public void setIdProd(String idpr) {
		this.idProduktu = idpr;
	}
	
	public String getIdBil() {
		return idBiltegi;
	}
	
	public void setIdBil(String idbil) {
		this.idBiltegi = idbil;
	}
	
	public String getKopurua() {
		return kopurua;
	}
	
	public void setKopurua(String ko) {
		this.kopurua = ko;
	}
	
	
	@Override
	public String toString() {
		return "\nProduktuaren IDa: "+idProduktu+"\nBiltegiaren IDa: "+idBiltegi+"\nKopurua: "+kopurua;
	}
}
