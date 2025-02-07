package erronka2;

import jakarta.xml.bind.annotation.*;
import java.util.Arrays;



@XmlRootElement (name="langileak")
public class wrapper {
   //@XmlElementWrapper (name="langileak")
   @XmlElement(name = "bulegari")
   private XML [] bulegari;
   
   public wrapper (){
	      this.bulegari = new XML [0];
	      this.saltzaile = new XMLAN [0];
	   }
   public void addSocio (XML s){
      this.bulegari=Arrays.copyOf(this.bulegari,this.bulegari.length+1);
      this.bulegari[this.bulegari.length-1]=s;
   }
   @XmlElement(name = "saltzaile")
   
   private XMLAN [] saltzaile;
  
   public void addSocio2 (XMLAN b){
      this.saltzaile=Arrays.copyOf(this.saltzaile,this.saltzaile.length+1);
      this.saltzaile[this.saltzaile.length-1]=b;
   }
   
}

	
	
