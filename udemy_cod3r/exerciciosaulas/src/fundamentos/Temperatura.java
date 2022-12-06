package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//	(ºF - 32) * 5/9 = ºC -- FORMULA
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double celsius = 68;
		double fahrenheit = 68.0;
		
		
		double celsiusFar = 5*(celsius-32)/9;
		double farCelsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Farenheit para Celsius: " + farCelsius);
		System.out.println("Celsius para Farenheit: " + celsiusFar);
	}
}
