package erronka2;

import java.util.ArrayList;

public class BDSaltzaileKlasea {
	
	public ArrayList<SaltzaileKlasea> saltzaile;
	
	public BDSaltzaileKlasea() {
		this.saltzaile = new ArrayList<>();
	}
	
	public void addKlasea(SaltzaileKlasea sal) {
		saltzaile.add(sal);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(SaltzaileKlasea object : saltzaile) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
