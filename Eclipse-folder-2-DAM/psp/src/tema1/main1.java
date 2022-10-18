package tema1;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		
		String nombre;
		int edad;
		char sexo;
		float peso;
		float altura;
		
		System.out.println("¿Cual es el nombre de la persona?");
		Scanner scanner = new Scanner(System.in);
		nombre = scanner.nextLine();
		
		System.out.println("¿Cual es la edad de la persona?");
		edad = scanner.nextInt();
		
		System.out.println("¿Cual es el sexo de la persona?");
		sexo = scanner.nextLine().charAt(0);
		
		System.out.println("¿Cual es el peso de la persona?");
		peso = scanner.nextFloat();
		
		System.out.println("¿Cual es la altura de la persona?");
		altura = scanner.nextFloat();
		
		
		persona1 Persona1 = new persona1(nombre, edad, sexo, "", peso, altura);
		
		
		
		
		
		System.out.println("¿Cual es el nombre de la segunda persona?");
		nombre = scanner.nextLine();
		
		System.out.println("¿Cual es la edad de la segunda persona?");
		edad = scanner.nextInt();
		
		System.out.println("¿Cual es el sexo de la segunda persona?");
		sexo = scanner.nextLine().charAt(0);
		
		
		persona1 Persona2 = new persona1(nombre, edad, sexo, "");
		
		persona1 Persona3 = new persona1();
		
		System.out.println("¿Cual es el nombre de la tercera persona?");
		Persona3.setNombre(scanner.nextLine());
		
		System.out.println("¿Cual es la edad de la tercera persona?");
		Persona3.setEdad(scanner.nextInt());
		
		System.out.println("¿Cual es el sexo de la tercera persona?");
		Persona3.setSexo(scanner.nextLine().charAt(0));
		
		System.out.println("¿Cual es el peso de la tercera persona?");
		Persona3.setPeso(scanner.nextFloat());
		
		System.out.println("¿Cual es la altura de la tercera persona?");
		Persona3.setAltura(scanner.nextFloat());
		
		if (Persona1.calcularIMC()==1) {
			System.out.println("Persona1 tiene sobrepeso");
		} else {
			System.out.println("Persona1 no tiene sobrepeso");
		}
		
		if (Persona2.calcularIMC()==1) {
			System.out.println("Persona2 tiene sobrepeso");
		} else {
			System.out.println("Persona2 no tiene sobrepeso");
		}
		
		if (Persona3.calcularIMC()==1) {
			System.out.println("Persona3 tiene sobrepeso");
		} else {
			System.out.println("Persona3 no tiene sobrepeso");
		}
		
		
		if (Persona1.getEdad()>=18) {
			System.out.println("Persona1 es mayor de edad");
		} else {
			System.out.println("Persona1 no es mayor de edad");
		}
		
		if (Persona2.getEdad()>=18) {
			System.out.println("Persona2 es mayor de edad");
		} else {
			System.out.println("Persona2 no es mayor de edad");
		}
		
		if (Persona3.getEdad()>=18) {
			System.out.println("Persona3 es mayor de edad");
		} else {
			System.out.println("Persona3 no es mayor de edad");
		}
		
		
		
		
	}

}
