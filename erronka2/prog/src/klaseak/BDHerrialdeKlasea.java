package klaseak;

import java.util.ArrayList;

public class BDHerrialdeKlasea {
	
	public ArrayList<HerrialdeKlasea> herrialdea;
	
	public BDHerrialdeKlasea() {
		this.herrialdea = new ArrayList<>();
	}
	
	/**
	 * ArrayListean objektuak sartzen ditu.
	 * @param herrialde
	 */
	public void addKlasea(HerrialdeKlasea herrialde) {
		herrialdea.add(herrialde);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(HerrialdeKlasea object : herrialdea) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}
}
