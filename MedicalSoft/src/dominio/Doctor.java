package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Doctor {
	
	private String usuario, contraseña, nombre, apellidos;
	BufferedImage image;
	
	public Doctor(String usuario, String contraseña, String nombre, String apellidos,BufferedImage image) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.image=image;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
}
