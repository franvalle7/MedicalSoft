package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Window.Type;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import dominio.Doctor;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import javax.swing.border.SoftBevelBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private Bienvenida panel1;
	private JTextField textUsuario;
	private BufferedImage image,doctor; 
	Doctor usuarios[]= new Doctor[2]; 
	private JPasswordField textContraseña;

	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/resources/hospital.png")));
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 279);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new MatteBorder(1, 1, 3, 3, (Color) Color.DARK_GRAY));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{23, 164, 100, 100, 92, 0};
		gbl_contentPane.rowHeights = new int[]{41, 60, 60, 43, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		try {
			image= ImageIO.read( new File( "C:/Users/Fran/git/MedicalSoft/MedicalSoft/src/resources/medicina.png" ) );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		JPanelImagen panel = new JPanelImagen(image);
		//JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsuario.gridx = 3;
		gbc_textUsuario.gridy = 1;
		contentPane.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 2;
		contentPane.add(lblContrasea, gbc_lblContrasea);
		
		textContraseña = new JPasswordField();
		textContraseña.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textContraseña.addActionListener(new TextContraseñaActionListener());
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_textContraseña.gridx = 3;
		gbc_textContraseña.gridy = 2;
		contentPane.add(textContraseña, gbc_textContraseña);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setToolTipText("Pincha aqu\u00ED para crear un nuevo usuario.");
		btnRegistrar.setForeground(Color.RED);
		btnRegistrar.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.anchor = GridBagConstraints.NORTH;
		gbc_btnRegistrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegistrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegistrar.gridx = 1;
		gbc_btnRegistrar.gridy = 4;
		contentPane.add(btnRegistrar, gbc_btnRegistrar);
		
		JButton btnCerra = new JButton("Cerrar");
		btnCerra.addActionListener(new BtnCerraActionListener());
		btnCerra.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_btnCerra = new GridBagConstraints();
		gbc_btnCerra.anchor = GridBagConstraints.NORTH;
		gbc_btnCerra.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCerra.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerra.gridx = 2;
		gbc_btnCerra.gridy = 4;
		contentPane.add(btnCerra, gbc_btnCerra);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiar.anchor = GridBagConstraints.NORTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 0, 5);
		gbc_btnLimpiar.gridx = 3;
		gbc_btnLimpiar.gridy = 4;
		contentPane.add(btnLimpiar, gbc_btnLimpiar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.NORTH;
		gbc_btnAceptar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 4;
		contentPane.add(btnAceptar, gbc_btnAceptar);
		
		try {
			doctor=ImageIO.read( new File( "C:/Users/Fran/workspace/yo.png" ) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usuarios[0]= new Doctor("fran","1234","Fco. Javier", "González Valle",doctor);
		usuarios[1]= new Doctor("miguel","1234","Miguel", "Rodriguez Lorente",doctor);
	}
	
	public Doctor esDoctor(){
		Doctor doctor=null;
			for(int i=0;i<usuarios.length;i++){
				if(usuarios[i].getUsuario().equals(textUsuario.getText())&&(usuarios[i].getContraseña().equals(textContraseña.getText()))){
					return usuarios[i];
				}
			}
		return doctor;
	}
	public boolean isDoctor(){
		boolean doctor=false;
			for(int i=0;i<usuarios.length;i++){
				if(usuarios[i].getUsuario().equals(textUsuario.getText())&&(usuarios[i].getContraseña().equals(textContraseña.getText()))){
					doctor=true;
				}
			}
		return doctor;
	}
	public void limpiar(){
		textUsuario.setText("");
		textContraseña.setText("");
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Doctor doctor=esDoctor();
			if(doctor!=null){
				panel1 = new Bienvenida(doctor);
				panel1.setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(contentPane,"Datos de acceso incorrectos. Inténtelo de nuevo.", "Inane error", JOptionPane.ERROR_MESSAGE);	
				limpiar();
			}
		}
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar();
		}
	}
	private class BtnCerraActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class TextContraseñaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(isDoctor()){
				Doctor doctor=esDoctor();
				panel1 = new Bienvenida(doctor);
				panel1.setVisible(true);
				dispose();
			}
				
		}
	}
}
