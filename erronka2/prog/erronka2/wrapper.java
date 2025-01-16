package erronka2;

import jakarta.xml.bind.annotation.*;
import java.util.Arrays;



@XmlRootElement (name="langile")
public class wrapper {
   @XmlElementWrapper (name="langileak")
   @XmlElement(name = "langile")
   private XML [] langile;
   
   public wrapper (){
      this.langile = new XML [0];
   }
   public void addSocio (XML s){
      this.langile=Arrays.copyOf(this.langile,this.langile.length+1);
      this.langile[this.langile.length-1]=s;
   }
   
}