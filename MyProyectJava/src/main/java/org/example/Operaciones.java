package org.example;

public class Operaciones {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;


    //métodos
    //Método para sumar ambos número
    public void sumar (int num1, int  num2){
        suma = num1+num2;
    }

    //Método para restar ambos número
    public void restar (int num1, int  num2){
        resta = num1-num2;
    }

    //Método para multiplicar ambos número
    public void multiplicar (int num1, int  num2){
        multiplicacion = num1*num2;
    }

    //Método para dividir ambos número
    public void dividir (int num1, int  num2){
        division = num1/num2;

    }

    //Método para mostrar resultados
    public void resultado (){
        System.out.println("La sumas es: "+suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: "+ division);

    }
}
