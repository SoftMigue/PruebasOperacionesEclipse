import java.util.Scanner;

public class StartOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//COMIENZO DEL PROYECTO
		
		
		int num1, num2, resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision, opcion=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el primer n�mero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo n�mero: ");
		num2 = sc.nextInt();
		
		System.out.println("");
		System.out.print("---MEN�---");
		opcion=sc.nextInt();
		System.out.println("");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicaci�n");
		System.out.println("4) Divisi�n");
		System.out.println("");
		System.out.print("Elija una opci�n: ");

		//SUMA
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
