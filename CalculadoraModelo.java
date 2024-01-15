package calculadora;

/**
 * En la clase Modelo determinaremos las diferentes funciones del programa.
 */
public class CalculadoraModelo {

	// Variable

	private double resultado;
	private double memoria;
	private double numero1;
	private double numero2;
	private String comando;
	
	//Constructor
	
	public CalculadoraModelo() {
		super();
		
	}



	// Planteamos las diferentes funciones...sumar, restar, multiplicar y dividir.


	public Double sumar(double numero1, double numero2) {

		return resultado = numero1 + numero2;
	}

	

	public Double restar(double numero1, double numero2) {

		return resultado = numero1 - numero2;
	}

	public Double multiplicar(double numero1, double numero2) {

		return resultado = numero1 * numero2;
	}

	public double dividir(double numero1, double numero2) {

		try {
			resultado = numero1 / numero2;// En caso que numero2 sea 0 devolverá un error.
		} catch (Exception e) {
			System.out.println("Error. No se puede dividir entre 0.");
		}
		return resultado;
	}
	
	//Definimos las funciones para limpiar, guardarMemoria y Recuperar

	public String limpiar() {
		
		return "";
	}

	public double guardarMemoria() {
		memoria = resultado;
		return memoria;
	}

	public double getResultado() { // Método getter de resultado.
		return resultado;
	}

	public double recuperarMemoria() {
		return memoria;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
		
	}

	public void setOperacion(String comando) {
		this.comando = comando;
		
	}



	public double realizarOperacion(double numero2) { //Método para cada una de las operaciones.
		switch (comando) {
		case "+":
			resultado = sumar(numero1, numero2);
			break;
		case "-":
			resultado = restar(numero1,numero2);
			break;
		case "*":
			resultado = multiplicar(numero1, numero2);
			break;
		case "/":
			resultado = dividir(numero1, numero2);
			break;
			default:
				System.out.println("Comando invalido");
			
		}
		return resultado;
	}

}
