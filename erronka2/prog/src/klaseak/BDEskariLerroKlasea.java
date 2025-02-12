package klaseak;

import java.util.ArrayList;

public class BDEskariLerroKlasea {
	
	public ArrayList<EskariLerroKlasea> eskaLerro;
	
	public BDEskariLerroKlasea() {
		this.eskaLerro = new ArrayList<>();
	}
	
	public void addKlasea(EskariLerroKlasea esl) {
		eskaLerro.add(esl);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(EskariLerroKlasea object : eskaLerro) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	
	}
}
