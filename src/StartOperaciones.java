import java.util.Scanner;

public class StartOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//COMIENZO DEL PROYECTO
		
		//SUMAS
		
		int num1, num2, resultado;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el primer número para sumar: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo número para sumar: ");
		num2 = sc.nextInt();
		
		resultado=num1+num2;

		System.out.println("El restultado de "+num1+ " + "+num2+" es: "+resultado);
		
	}

}
