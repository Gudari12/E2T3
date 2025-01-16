package erronka2;

import jakarta.xml.bind.annotation.*;

//sortu klasea
@XmlRootElement (name="langile") 
@XmlType (propOrder = {"id", "nombre", "apellido","mail","telefono","fecha","id_nagusi","lanpostu","erabiltzaile","pasahitza"})
@XmlAccessorType (XmlAccessType.FIELD)
public class XML {
	@XmlElement (name="id")
	private String id;
	@XmlElement (name="nombre") 
	private String nombre;
	@XmlElement (name="apellido")
	private String apellido;
	@XmlElement (name="mail")
	private String mail;
	@XmlElement (name="telefono")
	private String telefono;
	@XmlElement (name="fecha")
	private String fecha;
	@XmlElement (name="id_nagusi")
	private String id_nagusi;
	@XmlElement (name="lanpostu")
	private String lanpostu;
	@XmlElement (name="erabiltzaile")
	private String erabiltzaile;
	@XmlElement (name="pasahitza")
	private String pasahitza;
	
	
	public XML() {}
	public XML(String id, String nombre, String apellido, String mail, String telefono, String fecha,
			String id_nagusi, String lanpostu, String erabiltzaile, String pasahitza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
		this.fecha = fecha;
		this.id_nagusi = id_nagusi;
		this.lanpostu= lanpostu;
		this.erabiltzaile=erabiltzaile;
		this.pasahitza=pasahitza;
	}


@Override
public String toString() {
	return "XML [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", telefono="
			+ telefono + ", fecha=" + fecha + ", id_nagusi=" + id_nagusi + ", lanpostu=" + lanpostu + ", erabiltzaile="
			+ erabiltzaile + ", pasahitza=" + pasahitza + "]";
}


}
