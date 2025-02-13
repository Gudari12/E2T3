package klaseak;

import java.util.ArrayList;

public class BDProduktuKlasea {
	
	public ArrayList<ProduktuKlasea> produktua;
	
	public BDProduktuKlasea() {
		this.produktua = new ArrayList<>();
	}
	
	public void addKlasea(ProduktuKlasea pro) {
		produktua.add(pro);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(ProduktuKlasea object : produktua) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
