package erronka2;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
//import java.util.HashMap;
//import java.util.List;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.Marshaller;
//import jakarta.xml.bind.Unmarshaller;
//import java.io.File;

public class Erronka2 {
	
	  public static void main(String[] args) throws IOException {

		  int itxi=0;
		  Scanner scanner = new Scanner(System.in);
		  do {
			  
			  String usuario, contraseña;
			  int errorea=0;
			  int ondo=0;
			  
			  System.out.println("Ongi Etorri. Mesedez, hasi saioa.");
			  do{//loopa egiten du, saioa hasteko informazioa ona izan arte
			//	  File fErabiltzaileak = new File("src/erronka2/files/erabiltzaileak.txt");//Fitxategia irakurtzen du
			//	  Scanner scFitx = new Scanner (fErabiltzaileak);
				    
				    do {
				    	File fErabiltzaileak = new File("files/erabiltzaileak.txt");//Fitxategia irakurtzen du
						Scanner scFitx = new Scanner (fErabiltzaileak);
				    	
				    	System.out.print("Erabiltzailea: ");
						usuario = scanner.next();
				    	System.out.println();
				    	
					    while(scFitx.hasNext()){
							String lerroOsoa = scFitx.nextLine();
						    String[] zutabeak = lerroOsoa.split(";");
						    String erab = zutabeak[0];
						    if (usuario.equals(erab)){
						    	ondo = 1;
						    }
					    }
						scFitx.close();
				    }while(ondo != 1);
				    do{
				    	File fErabiltzaileak = new File("files/erabiltzaileak.txt");//Fitxategia irakurtzen du
						Scanner scFitx = new Scanner (fErabiltzaileak);
				    	System.out.print("Pasahitza: ");
				    	contraseña = scanner.next();
				    	System.out.println();
				    	errorea++;
					    while(scFitx.hasNext()){
							String lerroOsoa = scFitx.nextLine();
						    String[] zutabeak = lerroOsoa.split(";"); 
						    String pas = zutabeak[1];
						    if(usuario.equals(zutabeak[0])) {
							    if(contraseña.equals(pas)) {
						    		errorea = 6;
							    }
						  	}
					    }
					    scFitx.close();
				    }while(errorea<4);
				    if (errorea==4) {
				    	System.exit(0);
				    }
			  }while(errorea != 6); 
			  System.out.println("Ongi etorri!");
			  System.out.println("");
			  String errepikapena;
			  int erantzuna;
			  int irten=0;
			  
			  do {//loopa egiten du saioa itxi arte
					System.out.println("HASIERAKO MENUA");
					System.out.println();
				    System.out.println("- Erabiltzailea gehitu (1)");
				    System.out.println("- XML-a sortu (2)");
				    System.out.println("- Datu-basea eguneratu (3)");
				    System.out.println("- Datuak erakutsi (4)");
				    System.out.println("- Irten (5)");
				    System.out.println();
				    System.out.println("Tekleatu zer egin nahi duzun");
				    erantzuna = scanner.nextInt();
				    System.out.println();
				    
				    switch (erantzuna) {//Menuaren interakzioa
				    	case 1:
				    		erabGehitu(scanner);
				    		System.out.println();
				    		System.out.println("---------------------------------------");
				    		break;
				    		
				    	case 2:
				    		System.out.println("XML sortu");
				    		System.out.println("---------------------------------------");
				    		IdatziXML xml = new IdatziXML();
				    		xml.idatzi();
				    		break;
				    		
				    	case 3:
				    		System.out.println("datu basea eguneratu");
				    		System.out.println("---------------------------------------");
				    		break;
				    		
				    	case 4:
				    		System.out.println("Datuak erakutsi");
				    		System.out.println("---------------------------------------");
				    		break;
				    		
				    	case 5: 
				    		int eran = 1; 
				    		while (eran != 0) {
				    		System.out.println("Ziur irten nahi duzula? (Bai/Ez)");
				    	   	errepikapena = scanner.next();
				  	    	   	if (errepikapena.equals("Ez")||errepikapena.equals("ez")) {//Hasierara bueltatzen da
				  	    	   		System.out.print("");
				  	    	   		break;
				  	    	   	}
				  	    	   	if (errepikapena.equals("Bai")||errepikapena.equals("bai")) {
				  	    	   		System.out.println();
				  	    	   		System.out.println("Hurrengora arte, eskerrik asko.");//Programa amaitzen da
					                System.out.println("Programa irten...");
						  	        eran = 0;
				  	    	   		irten=1000;
				  	    	   	}else {
				  	    	   		System.out.println("Erantzuna 'Bai' edo 'Ez' izan behar da");
				  	    	   		eran ++;
				  	    	   		}
				    		}
				    	   	System.out.println();
				    	   	break;
				    	default:
							System.out.println("Aukera 1 eta 5 arteakoa izan behar du: ");
							System.out.println("---------------------------------------");
					        }
			  }while(irten != 1000);
		  }while (itxi != 1000);
		  scanner.close();
	  }
	  
	  public static void erabGehitu(Scanner scErab) throws IOException {
		  String erab,pas,pas1,pas2,berria = new String();
		  
		  try {
			  System.out.print("Sortu erabiltzaile berria: ");
			  erab = scErab.next();
			  System.out.print("Sortu pasahitza: ");
			  pas1 = scErab.next();
			  System.out.print("Errepikatu pasahitza: ");
			  pas2 = scErab.next();
			  
			  // Irakurri fitxategia.
			  File fErabiltzaileak = new File("src/erronka2/files/erabiltzaileak.txt");
			  try {
					Scanner scFitx = new Scanner(fErabiltzaileak);
					// Edukiak dauden bitartean.
					while (scFitx.hasNext()) {
					      String lerroOsoa = scFitx.nextLine();
					      String[] lerroParteak = lerroOsoa.split(";");
					      String erabF = lerroParteak[0];
					      if(erabF.equals(erab)) {
					    	  System.out.println();
					    	  System.out.println("Erabiltzailea existitzen da");
					    	  erab="";
					    	  pas1="";
					    	  pas2=".";
					      }
					}
					// Itxi fitxategia.
					scFitx.close();
				}catch (Exception e) {
					  System.out.println();
					  System.out.println("ERROREA GERTATU DA ETA KUDEATUKO DUGU");
				}
			  
			  if(pas1.equals(pas2)) {
				  pas=pas2;
				  berria = erab+";"+pas;
				  
				  Path path = Paths.get(fErabiltzaileak.toURI());
				  byte[] strToBytes = (System.lineSeparator()+berria).getBytes();

				  Files.write(path, strToBytes, StandardOpenOption.APPEND);
				  System.out.println();
				  System.out.println("Erabiltzaile gehituta.");
			  }else {
				  if(pas2.equals(".")) {
			    	  System.out.println("Ez da erabiltzailea sortuko");
					  
				  }else {
					  System.out.println();
					  System.out.println("Pasahitzak ez datoz bat");
				  }
			  }
		  }catch (Exception e) {
			  System.out.println();
			  System.out.println("ERROREA GERTATU DA ETA KUDEATUKO DUGU");
		  }

	  }
}