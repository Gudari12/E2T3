package erronka2;

import java.util.ArrayList;

public class BDKategoriaKlasea {
	
	public ArrayList<KategoriaKlasea> kategoria;
	
	public BDKategoriaKlasea() {
		this.kategoria = new ArrayList<>();
	}
	
	public void addKlasea(KategoriaKlasea kat) {
		kategoria.add(kat);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(KategoriaKlasea object : kategoria) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
