package org.example;

import Herencia.Estudiante;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Estudiante estudiante = new Estudiante("Ana", "Perez", 25, "520001",3.1416);

        estudiante.mostrarDatos();



/*    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25);
        p1.mostrarDatos();
 */


/*      //Metodo de Operaciones
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite le segundo número: "));

        Operaciones op = new Operaciones();
        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);

        op.resultado();
 */
    }
}