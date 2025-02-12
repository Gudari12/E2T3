package erronka2;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import klaseak.BDBezeroKlasea;
import klaseak.BDBezeroTel;
import klaseak.BDBiltegiKlasea;
import klaseak.BDBulegariKlasea;
import klaseak.BDEskariEgoeraKlasea;
import klaseak.BDEskariKlasea;
import klaseak.BDEskariLerroKlasea;
import klaseak.BDHerrialdeKlasea;
import klaseak.BDInbentarioKlasea;
import klaseak.BDKategoriaKlasea;
import klaseak.BDKokalekuKlasea;
import klaseak.BDKontinenteKlasea;
import klaseak.BDLangileKlasea;
import klaseak.BDLanpostuKlasea;
import klaseak.BDProduktuKlasea;
import klaseak.BDSaltzaileKlasea;
import klaseak.BezeroKlasea;
import klaseak.BezeroTel;
import klaseak.BiltegiKlasea;
import klaseak.BulegariKlasea;
import klaseak.EskariEgoeraKlasea;
import klaseak.EskariKlasea;
import klaseak.EskariLerroKlasea;
import klaseak.HerrialdeKlasea;
import klaseak.InbentarioKlasea;
import klaseak.KategoriaKlasea;
import klaseak.KokalekuKlasea;
import klaseak.KontinenteKlasea;
import klaseak.LangileKlasea;
import klaseak.LanpostuKlasea;
import klaseak.ProduktuKlasea;
import klaseak.SaltzaileKlasea;

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
				    		System.out.println("Erabiltzailea gehitu... \n");
				    		erabGehitu(scanner);
				    		System.out.println();
				    		System.out.println("---------------------------------------");
				    		break;
				    		
				    	case 2:
				    		System.out.println("XML sortu... \n");
				    		IdatziXML xml = new IdatziXML();
				    		xml.idatzi();
				    		System.out.println("---------------------------------------");
				    		
				    		break;
				    		
				    	case 3:
				    		System.out.println("Datu basea eguneratu... \n");
				    		System.out.println("---------------------------------------");
				    		gehituEremua(scanner);
				    		// Credenciales de la base de datos Oracle
				    		break;
				    		
				    	case 4:
				    		System.out.println("Datuak erakusten... \n");
				    		datuakErakutsi(scanner);
				    		System.out.println("---------------------------------------");
				    		break;
				    		
				    	case 5: 
				    		int eran = 1; 
				    		while (eran != 0) {
				    		System.out.println("Ziur irten nahi duzula? (Bai/Ez)");
				    	   	errepikapena = scanner.next();
				  	    	   	if (errepikapena.equals("Ez")||errepikapena.equals("ez")) {//Menu nagusira bueltatzen da
				  	    	   		System.out.print("");
				  	    	   		break;
				  	    	   	}
				  	    	   	if (errepikapena.equals("Bai")||errepikapena.equals("bai")) {
				  	    	   		System.out.println();
				  	    	   		System.out.println("Hurrengora arte, eskerrik asko.");//Hasierara bueltatzen da
					                System.out.println("Programatik irtetzen...");
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
	  
	  private static void gehituEremua(Scanner scanner) {
	        
	        // Mostrar el menú
	        System.out.println("Aukeratu:");
	        System.out.println("1. Eremua gehitu");
	        System.out.println("2. Taula eguneratu");

	        int choice = scanner.nextInt();

	        // Procesar la opción seleccionada
	        switch (choice) {
	            case 1:
	                gehituSoldata();
	                break;
	            case 2:
	            	eguneratuSoldata();
	                break;
	            default:
	                System.out.println("Opción no válida.");
	        }
	    }

	    // Método para generar el script SQL para agregar un campo "soldata"
	    private static void gehituSoldata() {
	        String filePath = "files/sql/gehitu_eremua_soldata.sql";
	        String sqlScript = "ALTER TABLE Langileen\n" +
	                           "ADD soldata NUMBER;\n";

	        try (FileWriter writer = new FileWriter(filePath)) {
	            writer.write(sqlScript);
	            System.out.println("Scripta sortu da: " + filePath);
	        } catch (IOException e) {
	            System.out.println("Errorea egon da: " + e.getMessage());
	        }
	    }

	    // Método para generar el script SQL para actualizar las sueldos según el puesto
	    private static void eguneratuSoldata() {
	        String filePath = "files/sql/eguneratu_soldata.sql";
	        String sqlScript = "UPDATE Langileen SET soldata = 30000 WHERE puesto = 'Saltzaile';\n" +
	                           "UPDATE Langileen SET soldata = 30000 WHERE id_puesto = 1;\n" +
	                           "UPDATE Langileen SET soldata = 31000 WHERE id_puesto = 2;\n" +
	                           "UPDATE Langileen SET soldata = 32000 WHERE id_puesto = 3;\n";

	        try (FileWriter writer = new FileWriter(filePath)) {
	            writer.write(sqlScript);
	            System.out.println("Scripta sortu da: " + filePath);
	        } catch (IOException e) {
	            System.out.println("Errorea egon da: " + e.getMessage());
	        }
	    }
	  
	    public static void erabGehitu(Scanner scErab) throws IOException {
	        // Aldagaiak deklaratu
	        String erab, pas, pas1, pas2, berria = new String();
	        
	        try {
	            // Erabiltzaile izena eskatu
	            System.out.print("Sortu erabiltzaile berria: ");
	            erab = scErab.next();
	            
	            // Pasahitza eskatu
	            System.out.print("Sortu pasahitza: ");
	            pas1 = scErab.next();
	            
	            // Pasahitza errepikatu
	            System.out.print("Errepikatu pasahitza: ");
	            pas2 = scErab.next();
	            
	            // Fitxategia irakurri
	            File fErabiltzaileak = new File("files/erabiltzaileak.txt");
	            try {
	                Scanner scFitx = new Scanner(fErabiltzaileak);
	                
	                // Fitxategiko lerroak irakurri
	                while (scFitx.hasNext()) {
	                    String lerroOsoa = scFitx.nextLine();
	                    String[] lerroParteak = lerroOsoa.split(";");
	                    String erabF = lerroParteak[0];
	                    
	                    // Erabiltzailea existitzen den egiaztatu
	                    if(erabF.equals(erab)) {
	                        System.out.println();
	                        System.out.println("Erabiltzailea existitzen da");
	                        erab = ""; // Erabiltzailea ezabatu
	                        pas1 = ""; // Pasahitza ezabatu
	                        pas2 = "."; // Errepikatutako pasahitza ezabatu
	                    }
	                }
	                
	                // Fitxategia itxi
	                scFitx.close();
	            } catch (Exception e) {
	                System.out.println();
	                System.out.println("ERROREA GERTATU DA ETA KUDEATUKO DUGU");
	            }
	            
	            // Pasahitzak berdinak diren egiaztatu
	            if(pas1.equals(pas2)) {
	                pas = pas2;
	                berria = erab + ";" + pas;
	                
	                // Fitxategira erabiltzaile berria gehitu
	                Path path = Paths.get(fErabiltzaileak.toURI());
	                byte[] strToBytes = (System.lineSeparator() + berria).getBytes();
	                
	                Files.write(path, strToBytes, StandardOpenOption.APPEND);
	                System.out.println();
	                System.out.println("Erabiltzaile gehituta.");
	            } else {
	                if(pas2.equals(".")) {
	                    System.out.println("Ez da erabiltzailea sortuko");
	                } else {
	                    System.out.println();
	                    System.out.println("Pasahitzak ez datoz bat, ezin izan da erabiltzailea gehitu.\nHasierarako menura bueltatzen...");
	                }
	            }
	        } catch (Exception e) {
	            System.out.println();
	            System.out.println("ERROREA GERTATU DA ETA KUDEATUKO DUGU");
	        }
	    }
	    
	    public static void datuakErakutsi(Scanner sc) {
			  
			  System.out.println("IKUSI NAHI DUZUN TAULA AUKERATU:");
			  System.out.println("Bezeroak");
			  System.out.println("Bezeroen telefonoa");
			  System.out.println("Biltegiak");
			  System.out.println("Bulegariak");
			  System.out.println("Eskariak");
			  System.out.println("Eskarien egoera");
			  System.out.println("Eskari-lerroa");
			  System.out.println("Herrialdea");
			  System.out.println("Inbentarioa");
			  System.out.println("Kategoria");
			  System.out.println("Kokalekua");
			  System.out.println("Langileak");
			  System.out.println("Kontinentea");
			  System.out.println("Lanpostua");
			  System.out.println("Produktuak");
			  System.out.println("Saltzaileak\n");
			  System.out.print("Idatzi agertzen diren bezala: ");
			  
			  String taula = sc.next();
			  int auk = 1;
			  
			  if (taula.equals("Bezeroak")) {
				  auk = 1;
				  if (taula.equals("Bezeroen telefonoa")) {
					  auk = 2;
					  if (taula.equals("Biltegiak")) {
						  auk = 3;
						  if (taula.equals("Bulegariak")) {
							  auk = 4;
							  if (taula.equals("Eskariak")) {
								  auk = 5;
								  if (taula.equals("Eskarien egoera")) {
									  auk = 6;
									  if (taula.equals("Eskari-lerroa")) {
										  auk = 7;
										  if (taula.equals("Herrialdea")) {
											  auk = 8;
											  if (taula.equals("Inbentarioa")) {
												  auk = 9;
												  if (taula.equals("Kategoria")) {
													  auk = 10;
													  if (taula.equals("Kokalekua")) {
														  auk = 11;
														  if (taula.equals("Langileak")) {
															  auk = 12;
															  if (taula.equals("Kontinentea")) {
																  auk = 13;
																  if (taula.equals("Lanpostua")) {
																	  auk = 14;
																	  if (taula.equals("Produktuak")) {
																		  auk = 15;
																		  if (taula.equals("Saltzaileak")) {
																			  auk = 16;
																		  }
																	  }
																  }
															  }
														  }
													  }
												  }
											  }
										  }
									  }
								  }
							  }
						  }
					  }
				  }
			  }
			  
			  
			  //int auk = sc.nextInt();
			  
			  switch(auk) {
			  	case 1:
			  		BezeroKlasea bezeroa = new BezeroKlasea("", "", "", "", "");
			  						
			  		try {
						File bezero = new File("files/csv/bezero.csv");
						Scanner scFitx = new Scanner(bezero);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							bezeroa.setId(lerroArray[0]);
							bezeroa.setIzena(lerroArray[1]);
							bezeroa.setAbiz(lerroArray[2]);
							bezeroa.setHelb(lerroArray[3]);
							bezeroa.setEmail(lerroArray[4]);
							
							BDBezeroKlasea bdb = new BDBezeroKlasea();
							bdb.addKlasea(bezeroa);
							System.out.println(bdb.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 2:
			  		BezeroTel tel = new BezeroTel("", "", "");
			  						
			  		try {
						File telf = new File("files/csv/bezerotel.csv");
						Scanner scFitx = new Scanner(telf);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							tel.setIdT(lerroArray[0]);
							tel.setIDBez(lerroArray[1]);
							tel.setZenbakia(lerroArray[2]);
							
							BDBezeroTel bdbt = new BDBezeroTel();
							bdbt.addKlasea(tel);
							System.out.println(bdbt.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 3:
			  		BiltegiKlasea bilt = new BiltegiKlasea("", "", "");
			  						
			  		try {
						File bil = new File("files/csv/biltegi.csv");
						Scanner scFitx = new Scanner(bil);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							bilt.setIdB(lerroArray[0]);
							bilt.setIzenaB(lerroArray[1]);
							bilt.setKokalekuarenID(lerroArray[2]);
							
							BDBiltegiKlasea bdbi = new BDBiltegiKlasea();
							bdbi.addKlasea(bilt);
							System.out.println(bdbi.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 4:
			  		BulegariKlasea bul = new BulegariKlasea("", "");
			  						
			  		try {
						File buleg = new File("files/csv/bulegari.csv");
						Scanner scFitx = new Scanner(buleg);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							bul.setIdBu(lerroArray[0]);
							bul.setIdLanpostu(lerroArray[1]);
							
							BDBulegariKlasea bdbu = new BDBulegariKlasea();
							bdbu.addKlasea(bul);
							System.out.println(bdbu.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 5:
			  		EskariKlasea esk = new EskariKlasea("", "", "", "", "");
			  						
			  		try {
						File eska = new File("files/csv/eskari.csv");
						Scanner scFitx = new Scanner(eska);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							esk.setIdEs(lerroArray[0]);
							esk.setIdBezEs(lerroArray[1]);
							esk.setIdEg(lerroArray[2]);
							esk.setIdSaEs(lerroArray[3]);
							esk.setEskData(lerroArray[4]);
							
							BDEskariKlasea bde = new BDEskariKlasea();
							bde.addKlasea(esk);
							System.out.println(bde.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 6:
			  		EskariEgoeraKlasea eskE = new EskariEgoeraKlasea("", "");
			  						
			  		try {
						File ee = new File("files/csv/eskariegoera.csv");
						Scanner scFitx = new Scanner(ee);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							eskE.setIdEE(lerroArray[0]);
							eskE.setDeskEE(lerroArray[1]);
							
							BDEskariEgoeraKlasea bdee = new BDEskariEgoeraKlasea();
							bdee.addKlasea(eskE);
							System.out.println(bdee.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 7:
			  		EskariLerroKlasea eskl = new EskariLerroKlasea("", "", "", "", "");
			  						
			  		try {
						File el = new File("files/csv/eskarilerro.csv");
						Scanner scFitx = new Scanner(el);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							eskl.setIdEL(lerroArray[0]);
							eskl.setIdL(lerroArray[1]);
							eskl.setIdProdEL(lerroArray[2]);
							eskl.setKopEL(lerroArray[3]);
							eskl.setSalnEL(lerroArray[4]);
							
							BDEskariLerroKlasea bdel = new BDEskariLerroKlasea();
							bdel.addKlasea(eskl);
							System.out.println(bdel.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 8:
			  		HerrialdeKlasea her = new HerrialdeKlasea("", "", "");
			  						
			  		try {
						File herri = new File("files/csv/herrialde.csv");
						Scanner scFitx = new Scanner(herri);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							her.setId(lerroArray[0]);
							her.setIzena(lerroArray[1]);
							her.setIdKontinente(lerroArray[2]);
							
							BDHerrialdeKlasea bdh = new BDHerrialdeKlasea();
							bdh.addKlasea(her);
							System.out.println(bdh.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 9:
			  		InbentarioKlasea inb = new InbentarioKlasea("", "", "");
			  						
			  		try {
						File inben = new File("files/csv/inbentario.csv");
						Scanner scFitx = new Scanner(inben);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							inb.setIdProd(lerroArray[0]);
							inb.setIdBil(lerroArray[1]);
							inb.setKopurua(lerroArray[2]);
							
							BDInbentarioKlasea bdin = new BDInbentarioKlasea();
							bdin.addKlasea(inb);
							System.out.println(bdin.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 10:
			  		KategoriaKlasea kateg = new KategoriaKlasea("", "");
			  						
			  		try {
						File kat = new File("files/csv/kategoria.csv");
						Scanner scFitx = new Scanner(kat);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							kateg.setId(lerroArray[0]);
							kateg.setIzena(lerroArray[1]);
							
							BDKategoriaKlasea bdkat = new BDKategoriaKlasea();
							bdkat.addKlasea(kateg);
							System.out.println(bdkat.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 11:
			  		KokalekuKlasea koka = new KokalekuKlasea("", "", "", "", "", "");
			  						
			  		try {
						File kok = new File("files/csv/kokaleku.csv");
						Scanner scFitx = new Scanner(kok);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							koka.setId(lerroArray[0]);
							koka.setHelbidea(lerroArray[1]);
							koka.setPostakodea(lerroArray[2]);
							koka.setUdalerria(lerroArray[3]);
							koka.setProbintzia(lerroArray[4]);
							koka.setIdHerrialde(lerroArray[5]);
							
							BDKokalekuKlasea bdko = new BDKokalekuKlasea();
							bdko.addKlasea(koka);
							System.out.println(bdko.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 12:
			  		KontinenteKlasea kont = new KontinenteKlasea("", "");
			  						
			  		try {
						File kon = new File("files/csv/kontinente.csv");
						Scanner scFitx = new Scanner(kon);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							kont.setId(lerroArray[0]);
							kont.setIzena(lerroArray[1]);
							
							BDKontinenteKlasea bdkon = new BDKontinenteKlasea();
							bdkon.addKlasea(kont);
							System.out.println(bdkon.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 13:
			  		LangileKlasea lang = new LangileKlasea("", "", "", "", "", "", "");
			  						
			  		try {
						File lan = new File("files/csv/langile.csv");
						Scanner scFitx = new Scanner(lan);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							lang.setId(lerroArray[0]);
							lang.setIzena(lerroArray[1]);
							lang.setAbiz(lerroArray[2]);
							lang.setEmaila(lerroArray[3]);
							lang.setTelefonoa(lerroArray[4]);
							lang.setKontrataziodata(lerroArray[5]);
							lang.getIdNagusi(lerroArray[6]);
							
							BDLangileKlasea bdlan = new BDLangileKlasea();
							bdlan.addKlasea(lang);
							System.out.println(bdlan.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 14:
			  		LanpostuKlasea lanpo = new LanpostuKlasea("", "");
			  						
			  		try {
						File lanp = new File("files/csv/lanpostu.csv");
						Scanner scFitx = new Scanner(lanp);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							lanpo.setId(lerroArray[0]);
							lanpo.setDeskribapena(lerroArray[1]);
							
							BDLanpostuKlasea bdlanp = new BDLanpostuKlasea();
							bdlanp.addKlasea(lanpo);
							System.out.println(bdlanp.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 15:
			  		ProduktuKlasea prod = new ProduktuKlasea("", "", "", "", "", "");
			  						
			  		try {
						File pro = new File("files/csv/produktu.csv");
						Scanner scFitx = new Scanner(pro);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							prod.setId(lerroArray[0]);
							prod.setIzena(lerroArray[1]);
							prod.setDeskribapena(lerroArray[2]);
							prod.setBalioa(lerroArray[3]);
							prod.setSalneurria(lerroArray[4]);
							prod.setIdKategoria(lerroArray[5]);
							
							BDProduktuKlasea bdpr = new BDProduktuKlasea();
							bdpr.addKlasea(prod);
							System.out.println(bdpr.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  	case 16:
			  		SaltzaileKlasea salt = new SaltzaileKlasea("", "", "");
			  						
			  		try {
						File saltz = new File("files/csv/saltzaile.csv");
						Scanner scFitx = new Scanner(saltz);
						scFitx.nextLine();
						while(scFitx.hasNext()) {
							String lerro = scFitx.nextLine();
							String[] lerroArray = lerro.split(";");
							
							salt.setId(lerroArray[0]);
							salt.setErabiltzailea(lerroArray[1]);
							salt.setPasahitza(lerroArray[2]);
							
							BDSaltzaileKlasea bdsal = new BDSaltzaileKlasea();
							bdsal.addKlasea(salt);
							System.out.println(bdsal.toString());
						}
						scFitx.close();
					}catch(FileNotFoundException e) {
						System.out.println("Ez da fitxategia topatu\n");
					}
			  		break;
			  }
	    }
}