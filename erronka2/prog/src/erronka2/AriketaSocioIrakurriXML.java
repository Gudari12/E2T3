package erronka2;

import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class AriketaSocioIrakurriXML {
	 public static void main (String [] args){
		 //XML 
		 JAXBContext c;
		 try{
			 c = JAXBContext.newInstance (XML.class);
			 Unmarshaller um = c.createUnmarshaller();
			 XML s = (XML) um.unmarshal (new File ("./src/test/xml/socio.xml"));
			 System.out.println(s.toString());
			 s = (XML) um.unmarshal (new File ("./src/test/xml/socio1.xml"));
			 System.out.println(s.toString());
		 }catch (Exception e){
			 System.out.println("Errorea irakurtzerakoan");
			 e.printStackTrace(); 
   }
   }
}