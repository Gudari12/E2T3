package erronka2;

import java.util.ArrayList;

public class BDEskariKlasea {
	
	public ArrayList<EskariKlasea> eskari;
	
	public BDEskariKlasea() {
		this.eskari = new ArrayList<>();
	}
	
	public void addKlasea(EskariKlasea esk) {
		eskari.add(esk);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(EskariKlasea object : eskari) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
