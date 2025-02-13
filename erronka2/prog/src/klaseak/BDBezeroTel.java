package klaseak;

import java.util.ArrayList;

public class BDBezeroTel {
	
	public ArrayList<BezeroTel> telefonoa;
		
		public BDBezeroTel() {
			this.telefonoa = new ArrayList<>();
		}
		
		/**
		 * ArrayListean objektuak sartzen ditu.
		 * @param tel
		 */
		public void addKlasea(BezeroTel tel) {
			telefonoa.add(tel);
		}
		
		//@Override
		public String toString() {		
			StringBuilder sb = new StringBuilder();
			for(BezeroTel object : telefonoa) {
				sb.append(object).append("\n");
			}
			return sb.toString();
		}

}
