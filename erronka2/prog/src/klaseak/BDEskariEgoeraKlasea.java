package erronka2;

import java.util.ArrayList;

public class BDEskariEgoeraKlasea {
	
	public ArrayList<EskariEgoeraKlasea> esk;
	
	public BDEskariEgoeraKlasea() {
		this.esk = new ArrayList<>();
	}
	
	public void addKlasea(EskariEgoeraKlasea es) {
		esk.add(es);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(EskariEgoeraKlasea object : esk) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
