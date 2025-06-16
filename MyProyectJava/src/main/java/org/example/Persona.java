package org.example;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    //Metodos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    //Metodo constructor con Variables diferentes a los atributos
/*    public Persona (String _nombre, int _edad){
        nombre=_nombre;
        edad=_edad;
    }

 */
    //Metodo constructor con Variables iguales a los atributos
/*    public Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
 */


/*    public void mostrarDatos (){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
 */
}
