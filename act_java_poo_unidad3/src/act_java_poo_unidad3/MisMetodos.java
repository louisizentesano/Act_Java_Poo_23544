package act_java_poo_unidad3;

import java.util.Scanner;

public class MisMetodos {

	// 1. Metodo parámetro un número N, y muestre por consola N veces
	public void mostrarMensaje(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.println("Bienvenidos al curso Full Stack");
		}
	}

	// 2. Metodo como parámetros dos números, y que calcule el máximo
	public int calcularMaximo(int num1, int num2) {
		return Math.max(num1, num2);
	}

	// 3. Metodo promedio3, que reciba como parámetro tres valores y devuelva el
	// promedio de los mismos
	public double promedio3(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	// 4. Metodo que lea notas hasta que ingrese -1 y devuelve el promedio de las
	// notas leídas
	public double calcularPromedioNotas() {
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int suma = 0;
		int nota;

		do {
			System.out.println("Ingrese una nota (-1 para finalizar): ");
			nota = scanner.nextInt();
			if (nota != -1) {
				suma += nota;
				contador++;
			}
		} while (nota != -1);

		if (contador == 0) {
			return 0; // 
		}
		return (double) suma / contador;
	}
	
	// 5. Metodo que se llame doble, que reciba como parámetro un valor, y devuelva el doble
	// del número ingresado como parámetro
	public int metodoDoble(int numero) {
        return numero * 2;
    }
	
	// 6. Metodo que se llame cuadrado, que reciba como parámetro un valor, y devuelva el
	// valor del número ingresado como parámetro elevado al cuadrado
	public int cuadrado(int numero) {
        return numero * numero;
    }
	
	// 7. Metodo que se denomine imprimirValores que dado un número por parámetro,
	// imprima cual es el valor siguiente, el doble y el cuadrado
	public void imprimirValores(int numero) {
        // Calcular el valor siguiente
        int valorSiguiente = numero + 1;

        // Calcular el doble
        int doble = numero * 2;

        // Calcular el cuadrado
        int cuadrado = numero * numero;

        // Imprimir los resultados
        System.out.println("Valor siguiente: " + valorSiguiente);
        System.out.println("Doble: " + doble);
        System.out.println("Cuadrado: " + cuadrado);
    }
	
	// 8. Metodo que dado la longitud de un lado de un cuadrado devuelva el perímetro
	public int calcularPerimetroCuadrado(int lado) {
        return 4 * lado;
    }
	
	// 9. Metodo que dado la longitud de un lado de un cuadrado devuelva la superficie
	 public int calcularSuperficieCuadrado(int lado) {
	        return lado * lado;
	    }
	
	// 10. Metodo que dado el radio de un círculo devuelva la circunferencia (perímetro del círculo)
	 public double calcularCircunferenciaCirculo(double radio1) {
	        return 2 * Math.PI * radio1;
	    }
	 
     // 11. Metodo que dado el radio de un círculo devuelva el área del círculo
	 public double calcularAreaCirculo(double radio2) {
	        return Math.PI * radio2 * radio2;
	    }
	 
	   // 12. Metodo que dado un número de mes y me devuelva la cantidad de días de ese mes
     // (suponiendo que no es un año bisiesto)
	    public int diasEnMes(int numeroMes) {
	        switch (numeroMes) {
	            case 1: // Enero
	            case 3: // Marzo
	            case 5: // Mayo
	            case 7: // Julio
	            case 8: // Agosto
	            case 10: // Octubre
	            case 12: // Diciembre
	                return 31;
	            case 4: // Abril
	            case 6: // Junio
	            case 9: // Septiembre
	            case 11: // Noviembre
	                return 30;
	            case 2: // Febrero
	                return 28; // Suponiendo que no es un año bisiesto
	            default:
	                return 0; // Mes no válido
	        }
	    }
	
}