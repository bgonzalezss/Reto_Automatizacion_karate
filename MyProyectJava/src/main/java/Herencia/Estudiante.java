package Herencia;

import java.security.PrivateKey;

public class Estudiante extends Persona {
    private String codigoEstudiante;
    private Float notaFinal;

    //Constructor de clase estudiante heredando atributos de clase Persona
    public Estudiante (String nombre, String apellido, int edad, String codigoEstudiante, Float notaFinal){
        super (nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos (){
        System.out.println("Nombre es: "+getNombre()
        +"/nApellido es:"+getApellido()
        +"/nEdad es: "+getEdad()
        +"/CodigoEstudiante es:"+codigoEstudiante
        +"/notaFinal es: "+notaFinal);
    }
}
