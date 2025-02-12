package erronka2;

import java.util.ArrayList;

public class BDBiltegiKlasea {
	
	public ArrayList<BiltegiKlasea> biltegi;
	
	public BDBiltegiKlasea() {
		this.biltegi = new ArrayList<>();
	}
	
	public void addKlasea(BiltegiKlasea bil) {
		biltegi.add(bil);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(BiltegiKlasea object : biltegi) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
