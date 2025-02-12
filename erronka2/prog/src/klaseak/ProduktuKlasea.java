package erronka2;

public class ProduktuKlasea {
	
	protected String id;
	protected String izena;
	protected String deskribapena;
	protected String balioa;
	protected String salneurria;
	protected String idKategoria;
	
	public ProduktuKlasea() {}
	public ProduktuKlasea(String ida, String iz, String desk, String bal, String saln, String idkat) {
		this.id = ida;
		this.izena = iz;
		this.deskribapena = desk;
		this.balioa = bal;
		this.salneurria = saln;
		this.idKategoria = idkat;
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
	
	public String getDeskribapena() {
		return deskribapena;
	}
	
	public void setDeskribapena(String de) {
		this.deskribapena = de;
	}
	
	public String getBalioa() {
		return balioa;
	}
	
	public void setBalioa(String ba) {
		this.balioa = ba;
	}
	
	public String getSalneurria() {
		return salneurria;
	}
	
	public void setSalneurria(String sa) {
		this.salneurria = sa;
	}
	
	public String getIdkategoria() {
		return idKategoria;
	}
	
	public void setIdKategoria(String ik) {
		this.idKategoria = ik;
	}
	
	
	@Override
	public String toString() {
		return "\nID: "+id+"\nIzena: "+izena+"\nDeskribapena: "+deskribapena+"\nBalioa: "+balioa+"\nSalneurria: "+salneurria+"\nKategoriaren IDa: "+idKategoria;
	}
	
}