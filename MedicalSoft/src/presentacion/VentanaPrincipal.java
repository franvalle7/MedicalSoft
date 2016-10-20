package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.border.TitledBorder;

import dominio.Paciente;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private Paciente pacientes[]= new Paciente[2];
	private BufferedImage image, icon;
	private JList<Paciente> list;
	private JTextField textApellidos;
	private JTextField textNombre;
	private JTextPane textPaneId;
	private JTextPane textPaneEdad;
	private JTextField textSexo;


	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/resources/hospital.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelInicio = new JPanel();
		tabbedPane.addTab("Inicio", null, panelInicio, null);
		
		JPanel panelPacientes = new JPanel();
		panelPacientes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tabbedPane.addTab("Pacientes", null, panelPacientes, null);
		GridBagLayout gbl_panelPacientes = new GridBagLayout();
		gbl_panelPacientes.columnWidths = new int[]{120, 53, 37, 42, 0, 41, 0, 80, 0, 0, 90, 0, 56, 29, 42, 25, 0, 0};
		gbl_panelPacientes.rowHeights = new int[]{35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 40, 0};
		gbl_panelPacientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelPacientes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelPacientes.setLayout(gbl_panelPacientes);
		
		try {
			image=ImageIO.read( new File( "C:/Users/Fran/workspace/yo.png" ) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pacientes[0]=new Paciente(1,"Miguel","Contreras Pérez","Española","C/Falsa, 123","Springfield",258763,"Ninguna","Ninguna",66666666,1990,"Hombre",image);
		pacientes[1]=new Paciente(2,"Nicanora","Contreras López","Española","C/Falsa, 127","Springfield",258763,"Todas","Todas",77777777,1987,"Mujer",image);
		
		list = new JList<Paciente>();
		list.addListSelectionListener(new ListListSelectionListener());
		list.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Pacientes", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		actualizarDatos();
		
					
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 16;
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		panelPacientes.add(list, gbc_list);
		
		JLabel lblId = new JLabel("ID :");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 2;
		gbc_lblId.gridy = 0;
		panelPacientes.add(lblId, gbc_lblId);
		
		textPaneId = new JTextPane();
		GridBagConstraints gbc_textPaneId = new GridBagConstraints();
		gbc_textPaneId.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneId.gridx = 3;
		gbc_textPaneId.gridy = 0;
		panelPacientes.add(textPaneId, gbc_textPaneId);
		
		JLabel lblApellidos = new JLabel("Apellidos :");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 1;
		panelPacientes.add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 5;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 3;
		gbc_textApellidos.gridy = 1;
		panelPacientes.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre :");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 8;
		gbc_lblNombre.gridy = 1;
		panelPacientes.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 9;
		gbc_textNombre.gridy = 1;
		panelPacientes.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JButton button = new JButton("Actualizar datos");
		button.addActionListener(new ButtonActionListener());
		
		JLabel lblEdad = new JLabel("Edad :");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 12;
		gbc_lblEdad.gridy = 1;
		panelPacientes.add(lblEdad, gbc_lblEdad);
		
		textPaneEdad = new JTextPane();
		textPaneEdad.setEditable(false);
		GridBagConstraints gbc_textPaneEdad = new GridBagConstraints();
		gbc_textPaneEdad.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneEdad.fill = GridBagConstraints.BOTH;
		gbc_textPaneEdad.gridx = 13;
		gbc_textPaneEdad.gridy = 1;
		panelPacientes.add(textPaneEdad, gbc_textPaneEdad);
		
		JLabel lblSexo = new JLabel("Sexo :");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 14;
		gbc_lblSexo.gridy = 1;
		panelPacientes.add(lblSexo, gbc_lblSexo);
		
		textSexo = new JTextField();
		GridBagConstraints gbc_textSexo = new GridBagConstraints();
		gbc_textSexo.insets = new Insets(0, 0, 5, 5);
		gbc_textSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSexo.gridx = 15;
		gbc_textSexo.gridy = 1;
		panelPacientes.add(textSexo, gbc_textSexo);
		textSexo.setColumns(10);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridwidth = 4;
		gbc_button.gridx = 13;
		gbc_button.gridy = 15;
		panelPacientes.add(button, gbc_button);
	
		
		JPanel panelAyuda = new JPanel();
		tabbedPane.addTab("Ayuda", null, panelAyuda, null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71, 30, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnSalir = new JButton("Salir");
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalir.gridx = 0;
		gbc_btnSalir.gridy = 0;
		panel.add(btnSalir, gbc_btnSalir);
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
	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int i=list.getSelectedIndex();
			pacientes[i].setApellidos(textApellidos.getText());
			pacientes[i].setNombre(textNombre.getText());
			actualizarDatos();
		}
	}
	
}
