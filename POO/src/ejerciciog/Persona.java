package ejerciciog;

public class Persona {

	//Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //Constantes
    private static final char SEXO_POR_DEFECTO = 'H';

    //Constructor por defecto
    public Persona() {
        this.nombre = ""; 
        this.edad = 0; 
        this.dni = generaDNI(); 
        this.sexo = SEXO_POR_DEFECTO; 
        this.peso = 0; 
        this.altura = 0; 
    }

    //Constructor con nombre, edad y sexo, el resto por defecto
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo); 
        this.dni = generaDNI(); 
        this.peso = 0; 
        this.altura = 0; 
    }

    // Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo); 
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            return SEXO_POR_DEFECTO;
        }
        return sexo;
    }

    private String generaDNI() {
        int numero = (int)(Math.random() * 100000000);
        char letra = calcularLetraDNI(numero);
        return String.format("%08d%c", numero, letra);
    }

    private char calcularLetraDNI(int numero) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[numero % 23];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }
}