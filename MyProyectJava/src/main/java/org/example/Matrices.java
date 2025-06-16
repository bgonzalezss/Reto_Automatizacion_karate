package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matriz[][] ={{1,2,3,4},{10,20,30,40},{9,19,29,39}};
        for (int i=0; i<3; i++){        //Número de filas
            for (int j=0; j<4; j++){    //Número de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        Scanner entrada = new Scanner(System.in);
        int matrizuser [][],nfilas, ncolumnas;
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        ncolumnas= Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));

        matrizuser = new int[nfilas][ncolumnas];
        System.out.println("Digite la matriz: ");
        for (int ifila=0; ifila<nfilas; ifila++){
            for (int jcolumna=0; jcolumna<ncolumnas; jcolumna++){
                System.out.print("Mi matriz: ["+ifila+"]["+jcolumna+"]");
                matrizuser[ifila][jcolumna]=entrada.nextInt();
            }
        }
        System.out.println("Mi matriz es: ");
        for (int ifila=0; ifila<nfilas; ifila++){
            for (int jcolumna=0; jcolumna<ncolumnas; jcolumna++){
                System.out.print(matrizuser[ifila][jcolumna]);
            }
            System.out.println("");
        }
    }
}
