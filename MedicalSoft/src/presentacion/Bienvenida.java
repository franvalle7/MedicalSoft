package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Doctor;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bienvenida extends JFrame {

	private JPanel contentPane;

	public Bienvenida(Doctor doctor) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Bienvenida.class.getResource("/resources/hospital.png")));
		setTitle("Bienvenido Dr. "+doctor.getNombre());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{39, 261, 130, 130, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanelImagen panel = new JPanelImagen(doctor.getImage());
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 4;
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 1;
		contentPane.add(textArea, gbc_textArea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new BtnSalirActionListener());
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalir.gridx = 2;
		gbc_btnSalir.gridy = 5;
		contentPane.add(btnSalir, gbc_btnSalir);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new BtnContinuarActionListener());
		GridBagConstraints gbc_btnContinuar = new GridBagConstraints();
		gbc_btnContinuar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnContinuar.gridx = 3;
		gbc_btnContinuar.gridy = 5;
		contentPane.add(btnContinuar, gbc_btnContinuar);
		
		String contenido = "Doctor "+doctor.getNombre()+" "+doctor.getApellidos()+"\nBienvenido de nuevo.\n\n\nEmpecemos con el trabajo";
		textArea.setText(contenido);
	}

	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class BtnContinuarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaPrincipal panel =new VentanaPrincipal();
			panel.setVisible(true);
			dispose();
		}
	}
}
