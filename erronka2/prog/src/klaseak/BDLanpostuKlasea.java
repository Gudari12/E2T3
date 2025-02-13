package klaseak;

import java.util.ArrayList;

public class BDLanpostuKlasea {
	
	public ArrayList<LanpostuKlasea> lanpostu;
	
	public BDLanpostuKlasea() {
		this.lanpostu = new ArrayList<>();
	}
	
	/**
	 * ArrayListean objektuak sartzen ditu.
	 * @param lanp
	 */
	public void addKlasea(LanpostuKlasea lanp) {
		lanpostu.add(lanp);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(LanpostuKlasea object : lanpostu) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
