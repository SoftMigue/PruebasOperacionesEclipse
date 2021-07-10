import java.util.Scanner;

public class StartOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//COMIENZO DEL PROYECTO
		
		//SUMA
		
		int num1, num2, resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el primer número para sumar: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo número para sumar: ");
		num2 = sc.nextInt();
		
		resultadoSuma=num1+num2;

		System.out.println("El restultado de "+num1+ " + "+num2+" es: "+resultadoSuma);
		
		//RESTA
		resultadoResta=num1-num2;
		System.out.println("El restultado de "+num1+ " - "+num2+" es: "+resultadoResta);

		
		//Multiplicacion
		resultadoMultiplicacion=num1*num2;
		System.out.println("El restultado de "+num1+ " * "+num2+" es: "+resultadoMultiplicacion);

		
		//Division
		resultadoDivision=num1/num2;
		System.out.println("El restultado de "+num1+ " / "+num2+" es: "+resultadoDivision);

		
		
		
	}

}
