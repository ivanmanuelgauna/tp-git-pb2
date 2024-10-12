import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		
		
		
		do{
			System.out.println("Ingrese su operación /n 1 para sumar /n 2 para
					restar /n 3 para multiplicar /n 4 para dividir");
					opcion = teclado.next();
		}while(opcion < 1 && opcion > 4)
			System.out.println("Ingrese el primer numero");
			a = teclado.next();
			System.out.println("Ingrese el segundo numero");
			a = teclado.next();
			
			switch(opcion) {
			case 1:
				this.sumar(a, b);
			case 2: 
				this.restar(a,b);
			case 3:
				this.dividir(a,b);
			}
			
			System.out.println("El resultado es " + resultado.toString());
		}
	
	public double sumar(double a, double b) {
		return a + b;
	}
	
	public double restar(double a, double b) {
		return a - b;
	}
	
	public double dividir(double a, double b) {
		return a / b;
	}
}
