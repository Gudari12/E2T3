package erronka2;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IdatziXML {
    public void idatzi() {
        wrapper langileak = new wrapper();

        File langileF = new File("files/csv/LANGILE_DATA_TABLE.csv");
        try (Scanner langileScanner = new Scanner(langileF)) {
        	langileScanner.nextLine();
            while (langileScanner.hasNextLine()) {
                String lerroOsoa = langileScanner.nextLine();
                String[] lerroId = lerroOsoa.split(",", -1);

                // Verificar que la línea tenga al menos 7 elementos
                if (lerroId.length < 7) {
                    System.out.println("Línea inválida en el archivo LANGILE_DATA_TABLE.csv: " + lerroOsoa);
                    continue; // Saltar esta línea
                }
                
                String id = lerroId[0];
                String nombre = lerroId[1];
                String apellido = lerroId[2];
                String mail = lerroId[3];
                String telefono = lerroId[4];
                
                String[] fechaT = lerroId[5].split("/");
                String dia = fechaT [0];
                String mes = fechaT [1];
                String año = fechaT [2];
                String fecha = (año+"-"+mes+"-"+dia);
                
                String id_nagusi = lerroId[6];
                String lanpostu = "nada";
                String erabiltzaile="nada";
                String pasahitza="nada";
                

                // Leer archivo LANPOSTU_DATA_TABLE.csv
                File lanpostuaidF = new File("files/csv/BULEGARI_DATA_TABLE.csv");
                File lanpostuaF = new File ("files/csv/LANPOSTU_DATA_TABLE.csv");
                File egiaztagiriF = new File ("files/csv/SALTZAILE_DATA_TABLE.csv");
                try (Scanner lanpostuaScanner = new Scanner(lanpostuaidF)) {
                    while (lanpostuaScanner.hasNextLine()) {
                        String lerroOsoa2 = lanpostuaScanner.nextLine();
                        String[] lerroId2 = lerroOsoa2.split(",");
                        
                        if (lerroId2.length < 2) {
                            System.out.println("Línea inválida en el archivo LANPOSTU_DATA_TABLE.csv: " + lerroOsoa2);
                            continue; // Saltar esta línea
                        }
                        if (lerroId2[0].equals(id)) {
                            String lanpostuid = lerroId2[1];
                            try(Scanner lanpostuaScanner2 = new Scanner(lanpostuaF)){
                            	while (lanpostuaScanner2.hasNextLine()) {
                            	String lerroOsoa3 = lanpostuaScanner2.nextLine();
                                String[] lerroId3 = lerroOsoa3.split(",");
                                if (lanpostuid.equals(lerroId3[0])) {
                                	lanpostu=lerroId3[1];
                                	}
                            	}
                            }
                            break;
                        }
                    }
                    try (Scanner saltzaileScanner3 = new Scanner(egiaztagiriF)){
                    	 while (saltzaileScanner3.hasNextLine()) {
                             String lerroOsoa4 = saltzaileScanner3.nextLine();
                             String[] lerroId4 = lerroOsoa4.split(",");
                             if(id.equals(lerroId4[0])) {
                            	 erabiltzaile=lerroId4[1];
                            	 pasahitza=lerroId4[2];
                             }
                    	 }
                    }
                }

                // Crear objeto langile y añadirlo a langileak
                if (lanpostu.equals("nada")){
                XML s = new XML(id, nombre, apellido, mail, telefono, fecha, id_nagusi, erabiltzaile, pasahitza);
                langileak.addSocio(s);
                }else {
                	XMLAN b = new XMLAN(id, nombre, apellido, mail, telefono, fecha, id_nagusi,lanpostu);
                    langileak.addSocio2(b);	
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + e.getMessage());
        }
        // Crear XML
        try {
            JAXBContext c = JAXBContext.newInstance(wrapper.class);
            Marshaller m = c.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(langileak, new File("./src/xml/socio1.xml"));
        } catch (Exception e) {
            System.out.println("Error al generar el XML");
            e.printStackTrace();
        }
    }
}
