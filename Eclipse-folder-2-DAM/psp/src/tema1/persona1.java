package tema1;

import java.util.Random;

public class persona1 {
	private String nombre;
	private int edad;
	private char sexo = 'H';
	private String DNI;
	private float peso;
	private float altura;
	
	//Constructores
	
	public persona1() {
		this.nombre= "";
        this.edad= 0;
        this.sexo= 'H';
        this.DNI= "";
        this.peso= 0;
        this.altura= 0;
	}
	
	public persona1(String nombre, int edad, char sexo) {
		this.nombre= nombre;
        this.edad= edad;
        this.sexo= sexo;
        this.DNI= "";
        this.peso= 0;
        this.altura= 0;
	}
	
	public persona1(String nombre, int edad, char sexo, String DNI) {
		this.nombre= nombre;
        this.edad= edad;
        this.sexo= sexo;
        this.DNI= DNI;
        this.peso= 0;
        this.altura= 0;
	}
	
	public persona1(String nombre, int edad, char sexo, String DNI, float peso, float altura) {
		this.nombre= nombre;
        this.edad= edad;
        this.sexo= sexo;
        this.DNI= DNI;
        this.peso= peso;
        this.altura= altura;
	}
	
	//Metodos

	public boolean MayorEdad() {
		if (edad>=17) {
			return true;
		} else {
			return false;
		}
	}
	
	public String DniAleatorio() {
		String Dni = "";
		char Letra = (char) (new Random().nextInt(26) + 'A');
		for (int i = 0; i < 7; i++) {
			Dni+=new Random().nextInt(9);
		}
		
		Dni = Dni + Letra;
		return Dni;
	}
	
	public boolean equals(persona1 Persona_comparar) {
		boolean Validacion;
		
		if (this.DNI.equals(Persona_comparar.getDNI())) {
			Validacion= true;
		} else {
			Validacion= false;
		}
		
		return Validacion;
		
	}
	
	public double calcularIMC() {
		double resultado;
		double tmp;
		tmp = this.peso/(Math.pow(this.altura/100, 2));
		if (tmp<20) {
			resultado=-1;
		} else if (tmp >= 20 && tmp <= 25) {
			resultado=0;
		} else {
			resultado=1;
		}
		return resultado;
	}
	
	
	
	
	//Get y Set
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char isSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "La persona tiene los siguientes datos:"+"\n"
				+"Nombre:"+this.nombre+"\n"
				+"Edad:"+this.edad+"\n"
				+"DNI:"+this.DNI+"\n"
				+"Sexo:"+this.sexo+"\n"
				+"Peso:"+this.peso+"\n"
				+"Altura:"+this.altura+"\n";
		
	}
	
}
