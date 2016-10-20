package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JList;
import dominio.Paciente;


import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panelCardLayout;
	private JButton btnPacientes;

	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/resources/hospital.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		gbl_panelBotones.columnWidths = new int[]{56, 59, 0};
		gbl_panelBotones.rowHeights = new int[]{23, 0};
		gbl_panelBotones.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelBotones.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelBotones.setLayout(gbl_panelBotones);
		
		JButton btnAtras = new JButton("Men\u00FA Principal");
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtras.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAtras.gridx = 0;
		gbc_btnAtras.gridy = 0;
		panelBotones.add(btnAtras, gbc_btnAtras);
		
		panelCardLayout = new JPanel();
		contentPane.add(panelCardLayout, BorderLayout.CENTER);
		panelCardLayout.setLayout(new CardLayout(0, 0));
		
		JPanel panelInicio = new JPanel();
		panelCardLayout.add(panelInicio, "panelInicio");
		GridBagLayout gbl_panelInicio = new GridBagLayout();
		gbl_panelInicio.columnWidths = new int[]{170, 0, 669, 0, 0};
		gbl_panelInicio.rowHeights = new int[]{49, 0, 0, 0, 0, 304, 0};
		gbl_panelInicio.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelInicio.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panelInicio.setLayout(gbl_panelInicio);
		
		JPanel panelIcono = new JPanel();
		GridBagConstraints gbc_panelIcono = new GridBagConstraints();
		gbc_panelIcono.gridheight = 5;
		gbc_panelIcono.insets = new Insets(0, 0, 5, 5);
		gbc_panelIcono.fill = GridBagConstraints.BOTH;
		gbc_panelIcono.gridx = 0;
		gbc_panelIcono.gridy = 0;
		panelInicio.add(panelIcono, gbc_panelIcono);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Principal.class.getResource("/resources/doctor.png")));
		panelIcono.add(label_5);
		
		JLabel lblPanelPrincipal = new JLabel("Panel Principal");
		lblPanelPrincipal.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblPanelPrincipal = new GridBagConstraints();
		gbc_lblPanelPrincipal.anchor = GridBagConstraints.WEST;
		gbc_lblPanelPrincipal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPanelPrincipal.gridx = 2;
		gbc_lblPanelPrincipal.gridy = 0;
		panelInicio.add(lblPanelPrincipal, gbc_lblPanelPrincipal);
		
		JLabel lblNewLabel = new JLabel("Funciones de Uso Frecuente");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 4;
		panelInicio.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panelColumna = new JPanel();
		GridBagConstraints gbc_panelColumna = new GridBagConstraints();
		gbc_panelColumna.insets = new Insets(0, 0, 0, 5);
		gbc_panelColumna.fill = GridBagConstraints.BOTH;
		gbc_panelColumna.gridx = 0;
		gbc_panelColumna.gridy = 5;
		panelInicio.add(panelColumna, gbc_panelColumna);
		panelColumna.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelControles = new JPanel();
		panelControles.setBackground(UIManager.getColor("Button.highlight"));
		panelControles.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Acciones", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_panelControles = new GridBagConstraints();
		gbc_panelControles.insets = new Insets(0, 0, 0, 5);
		gbc_panelControles.fill = GridBagConstraints.BOTH;
		gbc_panelControles.gridx = 2;
		gbc_panelControles.gridy = 5;
		panelInicio.add(panelControles, gbc_panelControles);
		panelControles.setLayout(new GridLayout(2, 3, 30, 30));
		
		btnPacientes = new JButton("Gestión de Pacientes");
		btnPacientes.addActionListener(new BtnPanelActionListener());
		panelControles.add(btnPacientes);
		JButton btnNewButton_1 = new JButton("Gestión de Consultas");
		panelControles.add(btnNewButton_1);
		
		JButton button_1 = new JButton("New button");
		panelControles.add(button_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		panelControles.add(btnNewButton_3);
		
		/*Boton btnNewButton_3 = new Boton("Puta ahí",Color.BLUE, Color.RED,30,30);
		panelControles.add(btnNewButton_3);*/
		
		JButton btnNewButton_2 = new JButton("New button");
		panelControles.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		panelControles.add(btnNewButton_4);
		
		JPanel panelEspecialistas = new JPanel();
		panelCardLayout.add(panelEspecialistas, "panelEspecialistas");
		
		JPanel panelAyuda = new JPanel();
		panelCardLayout.add(panelAyuda, "panelAyuda");
		
		JPanel panelPacientes = new JPanel();
		panelPacientes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panelCardLayout.add(panelPacientes, "panelPacientes");
		
		GridBagLayout gbl_GestióndePacientes = new GridBagLayout();
		gbl_GestióndePacientes.columnWidths = new int[]{120, 53, 37, 42, 0, 41, 0, 80, 0, 0, 90, 0, 56, 29, 42, 25, 0, 0};
		gbl_GestióndePacientes.rowHeights = new int[]{35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 40, 0};
		gbl_GestióndePacientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_GestióndePacientes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelPacientes.setLayout(gbl_GestióndePacientes);
		
		JList<Paciente> list = new JList<Paciente>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Pacientes", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridheight = 16;
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		panelPacientes.add(list, gbc_list);
		
		JLabel label = new JLabel("ID :");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		panelPacientes.add(label, gbc_label);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.gridx = 3;
		gbc_textPane.gridy = 0;
		panelPacientes.add(textPane, gbc_textPane);
		
		JLabel label_1 = new JLabel("Apellidos :");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		panelPacientes.add(label_1, gbc_label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		panelPacientes.add(textField, gbc_textField);
		
		JLabel label_2 = new JLabel("Nombre :");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 8;
		gbc_label_2.gridy = 1;
		panelPacientes.add(label_2, gbc_label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 9;
		gbc_textField_1.gridy = 1;
		panelPacientes.add(textField_1, gbc_textField_1);
		
		JLabel label_3 = new JLabel("Edad :");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 12;
		gbc_label_3.gridy = 1;
		panelPacientes.add(label_3, gbc_label_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_textPane_1.gridx = 13;
		gbc_textPane_1.gridy = 1;
		panelPacientes.add(textPane_1, gbc_textPane_1);
		
		JLabel label_4 = new JLabel("Sexo :");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 14;
		gbc_label_4.gridy = 1;
		panelPacientes.add(label_4, gbc_label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 15;
		gbc_textField_2.gridy = 1;
		panelPacientes.add(textField_2, gbc_textField_2);
		
		JButton button = new JButton("Actualizar datos");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridwidth = 4;
		gbc_button.gridx = 13;
		gbc_button.gridy = 15;
		panelPacientes.add(button, gbc_button);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmImprimir = new JMenuItem("Imprimir");
		mnArchivo.add(mntmImprimir);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesi\u00F3n");
		mnArchivo.add(mntmCerrarSesion);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyudaDeMedicalsoft = new JMenuItem("Ayuda de MedicalSoft");
		mnAyuda.add(mntmAyudaDeMedicalsoft);
		
		JSeparator separator_1 = new JSeparator();
		mnAyuda.add(separator_1);
		
		JMenuItem mntmManualDeUsuario = new JMenuItem("Manual de Usuario");
		mnAyuda.add(mntmManualDeUsuario);
		
		JSeparator separator = new JSeparator();
		mnAyuda.add(separator);
		
		JMenuItem mntmAcerca = new JMenuItem("Acerca de MedicalSoft");
		mnAyuda.add(mntmAcerca);
	}

		
	
	private class BtnPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
			cl.show(panelCardLayout, "panelPacientes");

		}
	}
}