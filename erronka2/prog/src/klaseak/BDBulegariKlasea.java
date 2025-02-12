package erronka2;

import java.util.ArrayList;

public class BDBulegariKlasea {
	
	public ArrayList<BulegariKlasea> bulegari;
	
	public BDBulegariKlasea() {
		this.bulegari = new ArrayList<>();
	}
	
	public void addKlasea(BulegariKlasea buleg) {
		bulegari.add(buleg);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(BulegariKlasea object : bulegari) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
