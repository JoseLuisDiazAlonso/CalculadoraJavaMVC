 package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * La clase Vista determinará el aspecto visual del Proyecto.
 */
public class CalculadoraVista extends JFrame {

	/**
	 * En esta clase vamos a implementar los modelos gráficos del proyecto.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton botonPunto;
	private JButton resultado;
	private static JTextField textField;
	ActionListener numeros;
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	private JButton Limpiar;
	private JButton Guardar;
	private JButton Recuperar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraVista frame = new CalculadoraVista();
					CalculadoraModelo modelo = new CalculadoraModelo();
					CalculadoraControlador controlador = new CalculadoraControlador(modelo, frame, textField);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraVista() {
		setTitle("Calculadora Tokio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		// Creamos un textField.

		textField = new JTextField();
		textField.setColumns(10);

		// Creamos un nuevo panel con gridLayout

		JPanel panel = new JPanel();
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 57, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		// Creamos los diferentes botones.

		boton1 = new JButton("1");
		
		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.insets = new Insets(10, 10, 10, 10);
		gbc_boton1.gridx = 0;
		gbc_boton1.gridy = 0;
		panel.add(boton1, gbc_boton1);

		boton2 = new JButton("2");
		
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.insets = new Insets(10, 10, 10, 10);
		gbc_boton2.gridx = 1;
		gbc_boton2.gridy = 0;
		panel.add(boton2, gbc_boton2);

		boton3 = new JButton("3");
		
		GridBagConstraints gbc_boton3 = new GridBagConstraints();
		gbc_boton3.insets = new Insets(10, 10, 10, 10);
		gbc_boton3.gridx = 2;
		gbc_boton3.gridy = 0;
		panel.add(boton3, gbc_boton3);
		
		botonSumar = new JButton("+");
		
		GridBagConstraints gbc_botonSumar = new GridBagConstraints();
		gbc_botonSumar.insets = new Insets(10, 10, 10, 10);
		gbc_botonSumar.gridx = 3;
		gbc_botonSumar.gridy = 0;
		panel.add(botonSumar, gbc_botonSumar);
		
		
		boton4 = new JButton("4");
		
		GridBagConstraints gbc_boton4 = new GridBagConstraints();
		gbc_boton4.insets = new Insets(10, 10, 10, 10);
		gbc_boton4.gridx = 0;
		gbc_boton4.gridy = 1;
		panel.add(boton4, gbc_boton4);

		boton5 = new JButton("5");
		
		GridBagConstraints gbc_boton5 = new GridBagConstraints();
		gbc_boton5.insets = new Insets(10, 10, 10, 10);
		gbc_boton5.gridx = 1;
		gbc_boton5.gridy = 1;
		panel.add(boton5, gbc_boton5);

		boton6 = new JButton("6");
		
		GridBagConstraints gbc_boton6 = new GridBagConstraints();
		gbc_boton6.insets = new Insets(10, 10, 10, 10);
		gbc_boton6.gridx = 2;
		gbc_boton6.gridy = 1;
		panel.add(boton6, gbc_boton6);
		
		botonRestar = new JButton("-");
		
		GridBagConstraints gbc_botonRestar = new GridBagConstraints();
		gbc_botonRestar.insets = new Insets(10, 10, 10, 10);
		gbc_botonRestar.gridx = 3;
		gbc_botonRestar.gridy = 1;
		panel.add(botonRestar, gbc_botonRestar);
		
		

		boton7 = new JButton("7");
		
		GridBagConstraints gbc_boton7 = new GridBagConstraints();
		gbc_boton7.insets = new Insets(10, 10, 10, 10);
		gbc_boton7.gridx = 0;
		gbc_boton7.gridy = 2;
		panel.add(boton7, gbc_boton7);

		boton8 = new JButton("8");
		
		GridBagConstraints gbc_boton8 = new GridBagConstraints();
		gbc_boton8.insets = new Insets(10, 10, 10, 10);
		gbc_boton8.gridx = 1;
		gbc_boton8.gridy = 2;
		panel.add(boton8, gbc_boton8);

		boton9 = new JButton("9");
		
		GridBagConstraints gbc_boton9 = new GridBagConstraints();
		gbc_boton9.insets = new Insets(10, 10, 10, 10);
		gbc_boton9.gridx = 2;
		gbc_boton9.gridy = 2;
		panel.add(boton9, gbc_boton9);
		
		botonMultiplicar = new JButton("*");
		
		GridBagConstraints gbc_botonMultiplicar = new GridBagConstraints();
		gbc_botonMultiplicar.insets = new Insets(10, 10, 10, 10);
		gbc_botonMultiplicar.gridx = 3;
		gbc_botonMultiplicar.gridy = 2;
		panel.add(botonMultiplicar, gbc_botonMultiplicar);
		
		
		boton0 = new JButton("0");
		
		GridBagConstraints gbc_boton0 = new GridBagConstraints();
		gbc_boton0.insets = new Insets(10, 10, 10, 10);
		gbc_boton0.gridx = 0;
		gbc_boton0.gridy = 3;
		panel.add(boton0, gbc_boton0);

		botonPunto = new JButton(".");
		
		GridBagConstraints gbc_botonPunto = new GridBagConstraints();
		gbc_botonPunto.insets = new Insets(10, 10, 10, 10);
		gbc_botonPunto.gridx = 1;
		gbc_botonPunto.gridy = 3;
		panel.add(botonPunto, gbc_botonPunto);

		resultado = new JButton("=");
		
		GridBagConstraints gbc_resultado = new GridBagConstraints();
		gbc_resultado.insets = new Insets(10, 10, 10, 10);
		gbc_resultado.gridx = 2;
		gbc_resultado.gridy = 3;
		panel.add(resultado, gbc_resultado);
		
		botonDividir = new JButton("/");
		
		GridBagConstraints gbc_botonDividir = new GridBagConstraints();
		gbc_botonDividir.insets = new Insets(10, 10, 10, 10);
		gbc_botonDividir.gridx = 3;
		gbc_botonDividir.gridy = 3;
		panel.add(botonDividir, gbc_botonDividir);
		
		Limpiar = new JButton("Limpiar");
		
		
		Guardar = new JButton("Guardar");
		
		
		Recuperar = new JButton("Recuperar");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Guardar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Recuperar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Limpiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Limpiar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(Guardar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(Recuperar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	//Ahora definimos los diferentes métodos.

	public void mostrar() {
		setVisible(true);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	//Agregamos los Listener de la clase CalculadoraControlador.

	public void agregarListener(ActionListener numeros) {
		boton1.addActionListener(numeros);
		boton2.addActionListener(numeros);
		boton3.addActionListener(numeros);
		boton4.addActionListener(numeros);
		boton5.addActionListener(numeros);
		boton6.addActionListener(numeros);
		boton7.addActionListener(numeros);
		boton8.addActionListener(numeros);
		boton9.addActionListener(numeros);
		boton0.addActionListener(numeros);
		botonPunto.addActionListener(numeros);
		botonSumar.addActionListener(numeros);
		botonRestar.addActionListener(numeros);
		botonMultiplicar.addActionListener(numeros);
		resultado.addActionListener(numeros);
		botonDividir.addActionListener(numeros);
		Limpiar.addActionListener(numeros);
		Guardar.addActionListener(numeros);
		Recuperar.addActionListener(numeros);
		
	}
}
