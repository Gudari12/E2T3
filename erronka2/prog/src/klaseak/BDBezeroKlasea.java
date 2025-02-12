package erronka2;

import java.util.ArrayList;

public class BDBezeroKlasea {
	
	public ArrayList<BezeroKlasea> bezeroak;
	
	public BDBezeroKlasea() {
		this.bezeroak = new ArrayList<>();
	}
	
	public void addKlasea(BezeroKlasea bezeroa) {
		bezeroak.add(bezeroa);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(BezeroKlasea object : bezeroak) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}