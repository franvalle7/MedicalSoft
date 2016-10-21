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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JList;

import dominio.Doctor;
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
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import java.awt.Window.Type;
import java.awt.Frame;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textApellidos;
	private JTextField textNombre;
	private JTextField textSexo;
	private JPanel panelCardLayout;
	private JButton btnPacientes;
	private JPanel panelInicio;
	private JList<Paciente> list;
	private JTextPane textPaneId;
	private JTextPane textPaneEdad;
	private Paciente[] pacientes= new Paciente[2];
	
	public Principal(Doctor doctor) {
		setTitle("MedicalSoft");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/resources/hospital.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pacientes[0]=new Paciente(1,"Miguel","Contreras Pérez","Española","C/Falsa, 123","Springfield",258763,"Ninguna","Ninguna",66666666,1990,65874,"Hombre");
		pacientes[1]=new Paciente(2,"Nicanora","Contreras López","Española","C/Falsa, 127","Springfield",258763,"Todas","Todas",77777777,1987,98652,"Mujer");
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		gbl_panelBotones.columnWidths = new int[]{56, 59, 0};
		gbl_panelBotones.rowHeights = new int[]{23, 0};
		gbl_panelBotones.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelBotones.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelBotones.setLayout(gbl_panelBotones);
		
		panelCardLayout = new JPanel();
		contentPane.add(panelCardLayout, BorderLayout.CENTER);
		panelCardLayout.setLayout(new CardLayout(0, 0));
		
		panelInicio = new JPanel();
		panelCardLayout.add(panelInicio, "panelInicio");
		GridBagLayout gbl_panelInicio = new GridBagLayout();
		gbl_panelInicio.columnWidths = new int[]{32, 833, -319, 0};
		gbl_panelInicio.rowHeights = new int[]{49, 0, 42, 37, 0, 304, 0, 304, 0, 0};
		gbl_panelInicio.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelInicio.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelInicio.setLayout(gbl_panelInicio);
		
		JLabel lblPanelPrincipal = new JLabel("Panel Principal");
		lblPanelPrincipal.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblPanelPrincipal = new GridBagConstraints();
		gbc_lblPanelPrincipal.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPanelPrincipal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPanelPrincipal.gridx = 1;
		gbc_lblPanelPrincipal.gridy = 0;
		panelInicio.add(lblPanelPrincipal, gbc_lblPanelPrincipal);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		panelInicio.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor "+doctor.getNombre()+" "+doctor.getApellidos());
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Funciones de Uso Frecuente");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		panelInicio.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panelControles = new JPanel();
		panelControles.setBackground(UIManager.getColor("Button.highlight"));
		panelControles.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		GridBagConstraints gbc_panelControles = new GridBagConstraints();
		gbc_panelControles.gridheight = 3;
		gbc_panelControles.insets = new Insets(0, 0, 5, 5);
		gbc_panelControles.fill = GridBagConstraints.BOTH;
		gbc_panelControles.gridx = 1;
		gbc_panelControles.gridy = 5;
		panelInicio.add(panelControles, gbc_panelControles);
		panelControles.setLayout(new GridLayout(2, 3,15, 15));
		
		JButton btnCrearPaciente = new JButton("A\u00F1adir Paciente Nuevo");
		panelControles.add(btnCrearPaciente);
		
		JButton btnAgenda = new JButton("Ver Agenda");
		panelControles.add(btnAgenda);
		
		JButton btnConsulta = new JButton("Consulta a Especialistas");
		panelControles.add(btnConsulta);
		
		JButton btnNewButton_3 = new JButton("New button");
		panelControles.add(btnNewButton_3);
		
		/*Boton btnNewButton_3 = new Boton("Puta ahí",Color.BLUE, Color.RED,30,30);
		panelControles.add(btnNewButton_3);*/
		
		JButton btnNewButton_2 = new JButton("New button");
		panelControles.add(btnNewButton_2);
		
		JButton btnCerrar = new JButton("Cerrar Sesi\u00F3n");
		btnCerrar.addActionListener(new BtnCerrarActionListener());
		panelControles.add(btnCerrar);
		
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
		gbl_GestióndePacientes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelPacientes.setLayout(gbl_GestióndePacientes);
		
		list = new JList<Paciente>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListListSelectionListener());
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Pacientes", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		actualizarDatos();
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
		
		textPaneId = new JTextPane();
		GridBagConstraints gbc_textPaneId = new GridBagConstraints();
		gbc_textPaneId.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneId.gridx = 3;
		gbc_textPaneId.gridy = 0;
		panelPacientes.add(textPaneId, gbc_textPaneId);
		
		JLabel lblNHistoria = new JLabel("N\u00BA Historia");
		GridBagConstraints gbc_lblNHistoria = new GridBagConstraints();
		gbc_lblNHistoria.anchor = GridBagConstraints.EAST;
		gbc_lblNHistoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblNHistoria.gridx = 4;
		gbc_lblNHistoria.gridy = 0;
		panelPacientes.add(lblNHistoria, gbc_lblNHistoria);
		
		JTextPane textPaneHistoria = new JTextPane();
		GridBagConstraints gbc_textPaneHistoria = new GridBagConstraints();
		gbc_textPaneHistoria.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneHistoria.gridx = 5;
		gbc_textPaneHistoria.gridy = 0;
		panelPacientes.add(textPaneHistoria, gbc_textPaneHistoria);
		
		JLabel label_1 = new JLabel("Apellidos :");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		panelPacientes.add(label_1, gbc_label_1);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridwidth = 5;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.gridx = 3;
		gbc_textApellidos.gridy = 1;
		panelPacientes.add(textApellidos, gbc_textApellidos);
		
		JLabel label_2 = new JLabel("Nombre :");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 8;
		gbc_label_2.gridy = 1;
		panelPacientes.add(label_2, gbc_label_2);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.gridx = 9;
		gbc_textNombre.gridy = 1;
		panelPacientes.add(textNombre, gbc_textNombre);
		
		JLabel label_3 = new JLabel("Edad :");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 12;
		gbc_label_3.gridy = 1;
		panelPacientes.add(label_3, gbc_label_3);
		
		textPaneEdad = new JTextPane();
		textPaneEdad.setEditable(false);
		GridBagConstraints gbc_textPaneEdad = new GridBagConstraints();
		gbc_textPaneEdad.fill = GridBagConstraints.BOTH;
		gbc_textPaneEdad.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneEdad.gridx = 13;
		gbc_textPaneEdad.gridy = 1;
		panelPacientes.add(textPaneEdad, gbc_textPaneEdad);
		
		JLabel label_4 = new JLabel("Sexo :");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 14;
		gbc_label_4.gridy = 1;
		panelPacientes.add(label_4, gbc_label_4);
		
		textSexo = new JTextField();
		textSexo.setColumns(10);
		GridBagConstraints gbc_textSexo = new GridBagConstraints();
		gbc_textSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSexo.insets = new Insets(0, 0, 5, 5);
		gbc_textSexo.gridx = 15;
		gbc_textSexo.gridy = 1;
		panelPacientes.add(textSexo, gbc_textSexo);
		
		JButton btnGenerarReceta = new JButton("Generar Receta");
		GridBagConstraints gbc_btnGenerarReceta = new GridBagConstraints();
		gbc_btnGenerarReceta.gridwidth = 2;
		gbc_btnGenerarReceta.anchor = GridBagConstraints.SOUTH;
		gbc_btnGenerarReceta.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerarReceta.gridx = 10;
		gbc_btnGenerarReceta.gridy = 15;
		panelPacientes.add(btnGenerarReceta, gbc_btnGenerarReceta);
		
		JButton button = new JButton("Actualizar datos");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.anchor = GridBagConstraints.SOUTHWEST;
		gbc_button.gridwidth = 4;
		gbc_button.gridx = 12;
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
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{210, 12, 0};
		gbl_panel.rowHeights = new int[]{161, 45, 45, 45, 45, 45, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon(Principal.class.getResource("/resources/doctor.png")));
		GridBagConstraints gbc_labelIcon = new GridBagConstraints();
		gbc_labelIcon.fill = GridBagConstraints.BOTH;
		gbc_labelIcon.insets = new Insets(0, 0, 5, 5);
		gbc_labelIcon.gridx = 0;
		gbc_labelIcon.gridy = 0;
		panel.add(labelIcon, gbc_labelIcon);
		
		JButton btnAtras = new JButton("Panel Principal");
		btnAtras.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.fill = GridBagConstraints.BOTH;
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 0;
		gbc_btnAtras.gridy = 1;
		panel.add(btnAtras, gbc_btnAtras);
		btnAtras.addActionListener(new BtnAtrasActionListener());
		
		btnPacientes = new JButton("Gesti\u00F3n de Pacientes");
		btnPacientes.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_btnPacientes = new GridBagConstraints();
		gbc_btnPacientes.fill = GridBagConstraints.BOTH;
		gbc_btnPacientes.insets = new Insets(0, 0, 5, 5);
		gbc_btnPacientes.gridx = 0;
		gbc_btnPacientes.gridy = 2;
		panel.add(btnPacientes, gbc_btnPacientes);
		btnPacientes.addActionListener(new BtnPanelActionListener());
		
		JButton btnGestinDeConsultas = new JButton("Gesti\u00F3n de Consultas");
		btnGestinDeConsultas.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_btnGestinDeConsultas = new GridBagConstraints();
		gbc_btnGestinDeConsultas.fill = GridBagConstraints.BOTH;
		gbc_btnGestinDeConsultas.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestinDeConsultas.gridx = 0;
		gbc_btnGestinDeConsultas.gridy = 3;
		panel.add(btnGestinDeConsultas, gbc_btnGestinDeConsultas);
		JButton btnEspecialistas = new JButton("Especialistas \rAsociados");
		btnEspecialistas.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_btnEspecialistas = new GridBagConstraints();
		gbc_btnEspecialistas.anchor = GridBagConstraints.WEST;
		gbc_btnEspecialistas.fill = GridBagConstraints.VERTICAL;
		gbc_btnEspecialistas.insets = new Insets(0, 0, 5, 5);
		gbc_btnEspecialistas.gridx = 0;
		gbc_btnEspecialistas.gridy = 4;
		panel.add(btnEspecialistas, gbc_btnEspecialistas);
		btnEspecialistas.addActionListener(new BtnNewButton_1ActionListener());
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 5;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JCalendar calendar = new JCalendar();
		GridBagConstraints gbc_calendar = new GridBagConstraints();
		gbc_calendar.gridheight = 2;
		gbc_calendar.insets = new Insets(0, 0, 0, 5);
		gbc_calendar.fill = GridBagConstraints.BOTH;
		gbc_calendar.gridx = 0;
		gbc_calendar.gridy = 7;
		panel.add(calendar, gbc_calendar);
	}
	
	public void actualizarDatos(){
		DefaultListModel modelo = new DefaultListModel();
		for(int i=0;i<pacientes.length;i++){
			modelo.addElement(pacientes[i].getApellidos()+", "+pacientes[i].getNombre());
		}
		list.setModel(modelo);
	}
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			int i=list.getSelectedIndex();
			textNombre.setText(pacientes[i].getNombre());
			textApellidos.setText(pacientes[i].getApellidos());
			textPaneId.setText(""+pacientes[i].getId());
			textPaneEdad.setText(""+(2016-pacientes[i].getEdad()));
			textSexo.setText(pacientes[i].getSexo());
			
			//textID.setText(String.valueOf(paciente.getId()));
		}
	}	
	
	private class BtnPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
			cl.show(panelCardLayout, "panelPacientes");

		}
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
			cl.show(panelCardLayout, "panelEspecialistas");
			
		}
	}
	private class BtnAtrasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(panelCardLayout.getLayout());
			cl.show(panelCardLayout, "panelInicio");
			
		}
	}
	private class BtnCerrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			FrameLogin login = new FrameLogin();
			login.setVisible(true);
			
		}
	}
}