package klaseak;

import java.util.ArrayList;

public class BDKontinenteKlasea {
	
	public ArrayList<KontinenteKlasea> kontinente;
	
	public BDKontinenteKlasea() {
		this.kontinente = new ArrayList<>();
	}
	
	public void addKlasea(KontinenteKlasea kon) {
		kontinente.add(kon);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(KontinenteKlasea object : kontinente) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
