package act_java_poo_unidad3;

public class Main {

	public static void main(String[] args) {
        // Instanciamos un objeto de MisMetodos
        MisMetodos misMetodos = new MisMetodos();

        // 1. Metodo parámetro un número N, y muestre por consola N veces, elegi 3
        misMetodos.mostrarMensaje(3);

        // 2. Metodo como parámetros dos números, y que calcule el máximo
        int maximo = misMetodos.calcularMaximo(5, 8);
        System.out.println("El máximo entre los dos numeros es: " + maximo);

        // 3. Metodo promedio3, que reciba como parámetro tres valores y devuelva el promedio de los mismos        
        double promedioTres = misMetodos.promedio3(5.0, 10.0, 15.0);
        System.out.println("El promedio de los tres numeros es: " + promedioTres);
        
        // 4. Metodo que lea notas hasta que ingrese -1 y devuelve el promedio de las notas leídas
        double promedio2 = misMetodos.calcularPromedioNotas();
        System.out.println("El promedio de las notas ingresadas es: " + promedio2);
	
    	//5. Metodo que se llame doble, que reciba como parámetro un valor, y devuelva el doble
    	// del número ingresado como parámetro
        int resultadoDoble = misMetodos.metodoDoble(6);
        System.out.println("El doble del numero ingresado es: " + resultadoDoble);
        
    	// 6. Metodo que se llame cuadrado, que reciba como parámetro un valor, y devuelva el
    	// valor del número ingresado como parámetro elevado al cuadrado
        int resultadoCuadrado = misMetodos.cuadrado(4);
        System.out.println("El cuadrado del numero es: " + resultadoCuadrado);
        
    	// 7. Metodo que se denomine imprimirValores que dado un número por parámetro,
    	// imprima cual es el valor siguiente, el doble y el cuadrado
        misMetodos.imprimirValores(2);

        // 8. Metodo que dado la longitud de un lado de un cuadrado devuelva el perímetro
        int perimetro = misMetodos.calcularPerimetroCuadrado(4);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        
		// 9. Metodo que dado la longitud de un lado de un cuadrado devuelva la superficie
		int superficie = misMetodos.calcularSuperficieCuadrado(4);
	    System.out.println("La superficie del cuadrado es: " + superficie);
	    
		// 10. Metodo que dado el radio de un círculo devuelva la circunferencia (perímetro del círculo)
	    double circunferencia = misMetodos.calcularCircunferenciaCirculo(6);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
        
        // 11. Metodo que dado el radio de un círculo devuelva el área del círculo
        double area = misMetodos.calcularAreaCirculo(10);
        System.out.println("El área del círculo es: " + area);
        
        // 12. Metodo que dado un número de mes y me devuelva la cantidad de días de ese mes
        // (suponiendo que no es un año bisiesto)
        int cantidadDias = misMetodos.diasEnMes(8);
        if (cantidadDias > 0) {
            System.out.println("El mes tiene " + cantidadDias + " días");
        } else {
            System.out.println("Ingresaste un numero de Mes no válido");
        }
	    
	}
		}