package klaseak;

import java.util.ArrayList;

public class BDLangileKlasea {
	
	public ArrayList<LangileKlasea> langile;
	
	public BDLangileKlasea() {
		this.langile = new ArrayList<>();
	}
	
	/**
	 * ArrayListean objektuak sartzen ditu.
	 * @param lan
	 */
	public void addKlasea(LangileKlasea lan) {
		langile.add(lan);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(LangileKlasea object : langile) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
