package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Doctor;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	Doctor usuarios[]= new Doctor[2]; 
	private JTextField textUsuario;
	private JPasswordField textContraseña;

	public FrameLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameLogin.class.getResource("/resources/hospital.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new GridLayout(1, 4, 0, 0));
		
		JButton btnRegistar = new JButton("Registar");
		btnRegistar.setFont(new Font("Verdana", Font.BOLD, 11));
		panelBotones.add(btnRegistar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new BtnCerraActionListener());
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 11));
		panelBotones.add(btnCerrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setFont(new Font("Verdana", Font.BOLD, 11));
		panelBotones.add(btnLimpiar);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setFont(new Font("Verdana", Font.BOLD, 11));
		panelBotones.add(btnEntrar);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{160, 0, 25, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0, 0, 27, 25, 0, 26, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(FrameLogin.class.getResource("/resources/medicina.png")));
		GridBagConstraints gbc_lblIcon = new GridBagConstraints();
		gbc_lblIcon.gridheight = 7;
		gbc_lblIcon.insets = new Insets(0, 0, 0, 5);
		gbc_lblIcon.gridx = 0;
		gbc_lblIcon.gridy = 0;
		panel_1.add(lblIcon, gbc_lblIcon);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 3;
		panel_1.add(lblUsuario, gbc_lblUsuario);
		
		textUsuario = new JTextField();
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.fill = GridBagConstraints.BOTH;
		gbc_textUsuario.gridwidth = 3;
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.gridx = 3;
		gbc_textUsuario.gridy = 3;
		panel_1.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 5;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 4;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 5;
		panel_1.add(lblContrasea, gbc_lblContrasea);
		textContraseña = new JPasswordField();
		textContraseña.addActionListener(new TextContraseñaActionListener());
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		
		gbc_textContraseña.fill = GridBagConstraints.BOTH;
		gbc_textContraseña.gridwidth = 3;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.gridx = 3;
		gbc_textContraseña.gridy = 5;
		panel_1.add(textContraseña, gbc_textContraseña);
		
		usuarios[0]= new Doctor("fran","1234","Fco. Javier", "González Valle");
		usuarios[1]= new Doctor("miguel","1234","Miguel", "Rodriguez Lorente");
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

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Doctor doctor=esDoctor();
			if(doctor!=null){
				JOptionPane.showMessageDialog(contentPane,"Bienvenido de nuevo Dr."+doctor.getNombre()+" "+doctor.getApellidos());
				Principal ventanaPrincipal = new Principal(doctor);
				ventanaPrincipal.setVisible(true);
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
			Doctor doctor=esDoctor();
			if(isDoctor()){
				JOptionPane.showMessageDialog(contentPane,"Bienvenido de nuevo Dr."+doctor.getNombre()+" "+doctor.getApellidos());
				Principal ventanaPrincipal = new Principal(doctor);
				ventanaPrincipal.setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(contentPane,"Datos de acceso incorrectos. Inténtelo de nuevo.", "Inane error", JOptionPane.ERROR_MESSAGE);	
				limpiar();
			
			}
				
		}
	}
}
