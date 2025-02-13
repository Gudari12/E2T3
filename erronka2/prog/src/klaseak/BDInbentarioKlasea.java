package klaseak;

import java.util.ArrayList;

public class BDInbentarioKlasea {
	
	public ArrayList<InbentarioKlasea> inbentario;
	
	public BDInbentarioKlasea() {
		this.inbentario = new ArrayList<>();
	}
	
	/**
	 * ArrayListean objektuak sartzen ditu.
	 * @param inb
	 */
	public void addKlasea(InbentarioKlasea inb) {
		inbentario.add(inb);
	}
	
	//@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		for(InbentarioKlasea object : inbentario) {
			sb.append(object).append("\n");
		}
		return sb.toString();
	}

}
