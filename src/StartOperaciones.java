import java.util.Scanner;

public class StartOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// COMIENZO DEL PROYECTO

		int num1, num2, resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision, opcion = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();

		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();

		do {
			System.out.println("");
			System.out.print("---MENÚ---");
			System.out.println("");
			System.out.println("1) Suma");
			System.out.println("2) Resta");
			System.out.println("3) Multiplicación");
			System.out.println("4) División");
			System.out.println("0) Salir");
			System.out.println("");

			System.out.print("Elija una opción: ");
			System.out.println("");
			opcion = sc.nextInt();

			if (opcion <= 4 && opcion >= 1) {

				if (opcion == 1) {
					// SUMA
					resultadoSuma = num1 + num2;
					System.out.println("El restultado de " + num1 + " + " + num2 + " es: " + resultadoSuma);
				}

				if (opcion == 2) {
					// RESTA
					resultadoResta = num1 - num2;
					System.out.println("El restultado de " + num1 + " - " + num2 + " es: " + resultadoResta);
				}

				if (opcion == 3) {
					// Multiplicacion
					resultadoMultiplicacion = num1 * num2;
					System.out.println("El restultado de " + num1 + " * " + num2 + " es: " + resultadoMultiplicacion);
				}

				if (opcion == 4) {
					// Division
					resultadoDivision = num1 / num2;
					System.out.println("El restultado de " + num1 + " / " + num2 + " es: " + resultadoDivision);
				}
			}
			else if (opcion!=0){
				System.out.println("Introduce una opción válida");
			}

		} while (opcion != 0);

		System.out.println("---Fin del programa---");

	}

}
