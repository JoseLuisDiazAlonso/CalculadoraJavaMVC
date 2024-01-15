package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

/**
 * La clase calculadoraControlador determinará el método actionPerformed y llamará tanto al modelo como a la vista.
 */
public class CalculadoraControlador implements ActionListener {

	private CalculadoraModelo modelo;
	private CalculadoraVista vista;
	private JTextField textField;

	public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista, JTextField textField) {
		this.modelo = modelo;
		this.vista = vista;
		this.textField = textField;

		this.vista.agregarListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		switch (comando) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
		case ".":
			textField.setText(textField.getText() + comando);
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			double numero1 = Double.parseDouble(textField.getText());
			modelo.setNumero1(numero1);
			modelo.setOperacion(comando);
			textField.setText("");
			break;
		case "=":
			double numero2 = Double.parseDouble(textField.getText());
			double resultado = modelo.realizarOperacion(numero2);
			textField.setText(String.valueOf(resultado));
			break;
		case "Limpiar":
			textField.setText(String.valueOf(modelo.limpiar()));
			break;
		case "Guardar":
			textField.setText(String.valueOf(modelo.guardarMemoria()));
			textField.setText("");
			break;
		case "Recuperar":
			textField.setText(String.valueOf(modelo.recuperarMemoria()));
			break;
		}
	}
}
