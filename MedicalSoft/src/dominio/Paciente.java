package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Paciente {
	private String nombre, apellidos,nacionalidad,direccion,municipio,alergias,medicación;
	private int id,dni,edad,cp,historia;
	private String sexo;
	BufferedImage image;
	
	public Paciente(int id,String nombre, String apellidos, String nacionalidad, String direccion, String municipio, int cp,String alergias, String medicación,
			int dni, int fechaNacimiento,int historia, String sexo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		this.municipio = municipio;
		this.alergias = alergias;
		this.medicación = medicación;
		this.id = id;
		this.dni = dni;
		this.edad = fechaNacimiento;
		this.cp = cp;
		this.sexo = sexo;
		this.historia=historia;
		try {
			image=ImageIO.read( new File( "C:/Users/Fran/workspace/yo.png" ) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMedicación() {
		return medicación;
	}

	public void setMedicación(String medicación) {
		this.medicación = medicación;
	}
}
