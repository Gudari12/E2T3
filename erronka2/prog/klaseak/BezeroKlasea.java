package erronka2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BezeroKlasea {
	
	//atributuak eta objetuen arraya, lerro bakoitza objektu bat

	protected String id;
	protected String izena;
	protected String abizena;
	protected String helbidea;
	protected String emaila;
	
	public BezeroKlasea() {}
	public BezeroKlasea(String ida, String iz, String abiz, String helb, String email) {
		this.id = ida;
		this.izena = iz;
		this.abizena = abiz;
		this.helbidea = helb;
		this.emaila = email;
	}
	
	/*public void addClass() {
		BezeroKlasea bezeroa = new BezeroKlasea();
	}*/
	
	public void bezeroaSortu() {
		try {
			File bezero = new File("fitxategiak/bezero.csv");
			Scanner scFitx = new Scanner(bezero);
			scFitx.nextLine();
			while(scFitx.hasNext()) {
				BezeroKlasea bezeroa = new BezeroKlasea();
				String lerro = scFitx.nextLine();
				String[] lerroArray = lerro.split(";");
				//System.out.println("\n");
				this.id = lerroArray[0];
				this.izena = lerroArray[1];
				this.abizena = lerroArray[2];
				this.helbidea = lerroArray[3];
				this.emaila = lerroArray[4];
				/*System.out.println("\nID: "+lerroArray[0]);
				System.out.println("\nIzena: "+lerroArray[1]);
				System.out.println("\nAbizena: "+lerroArray[2]);
				System.out.println("\nHelbidea: "+lerroArray[3]);
				System.out.println("\nEmaila: "+lerroArray[4]);*/
				
				//BezeroKlasea bezeroa = new BezeroKlasea();
				//bezeroa = lerro;
				BDBezeroKlasea.addKlasea(bezeroa);
			}
			scFitx.close();
		}catch(FileNotFoundException e) {
			System.out.println("Ez da fitxategia topatu\n");
		}
	}

}
