package klaseak;

import java.util.ArrayList;

public class BDKokalekuKlasea {
	
	public ArrayList<KokalekuKlasea> kokaleku;
	
	public BDKokalekuKlasea() {
		this.kokaleku = new ArrayList<>();
	}
	
	/**
	 * ArrayListean objektuak sartzen ditu.
	 * @param kok
	 */
	public void addKlasea(KokalekuKlasea kok) {
		kokaleku.add(kok);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(KokalekuKlasea object : kokaleku) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
