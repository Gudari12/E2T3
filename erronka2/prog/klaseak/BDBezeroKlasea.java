package erronka2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

//import erronka.klaseak.BezeroKlasea;

public class BDBezeroKlasea extends BezeroKlasea() {
	
	//objektuen arraya, tostring, addclass
	

	public String getId() {
		return id;
	}
	
	public void setId(String ida) {
		this.id = ida;
	}
	
	public String getIzena() {
		return izena;
	}
	
	public void setIzena(String izen) {
		this.izena = izen;
	}
	
	public String getAbiz() {
		return abizena;
	}
	
	public void setAbiz(String abizen) {
		this.abizena = abizen;
	}
	
	public String getHelb() {
		return helbidea;
	}
	
	public void setHelb(String helbide) {
		this.helbidea = helbide;
	}
	
	public String getEmail() {
		return emaila;
	}
	
	public void setEmail(String email) {
		this.emaila = email;
	}
	
	public static void addKlasea(Object bezeroa) {
		ArrayList<Object> bezeroak = new ArrayList<Object>();
		bezeroak.add(bezeroa);
	}
	

	public String toString() {
		try {
			File bezero = new File("fitxategiak/bezero.csv");
			Scanner scFitx = new Scanner(bezero);
			scFitx.nextLine();
			String taula;
			while(scFitx.hasNext()) {
				String lerro = scFitx.nextLine();
				String[] lerroArray = lerro.split(";");
				System.out.println("\n");
				System.out.println("\nID: "+lerroArray[0]);
				System.out.println("\nIzena: "+lerroArray[1]);
				System.out.println("\nAbizena: "+lerroArray[2]);
				System.out.println("\nHelbidea: "+lerroArray[3]);
				System.out.println("\nEmaila: "+lerroArray[4]);
				
				taula = "\n"+"\nID: "+lerroArray[0]+"\nIzena: "+lerroArray[1]+"\nAbizena: "+lerroArray[2]+"\nHelbidea: "+lerroArray[3]+"\nEmaila: "+lerroArray[4];
				
				//scFitx.close();
				
				//return taula;
			}
			scFitx.close();
			
			return taula;
						
		}catch(FileNotFoundException e) {
			System.out.println("Ez da fitxategia topatu\n");
		}
	}

}
