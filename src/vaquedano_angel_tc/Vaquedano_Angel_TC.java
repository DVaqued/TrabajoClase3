/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_tc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_TC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int op = 0;
        int base = 0;
        int altura = 0;
        double area = 0;
        double areamayor = 0;
        int triangulomayor = 0;
        int contador;

        System.out.println("");

        while (true) {
            op = lea.nextInt();
            switch (op) {
                case 1:
                    for (contador = 1; contador <= 8; contador++) {
                        try {
                            System.out.println("Favor ingrese la base del triangulo numero " + contador);
                            base = lea.nextInt();
                            System.out.println("Favor ingrese la altura del triangulo numero " + contador);
                            altura = lea.nextInt();
                            area = (base * altura) / 2;
                            if (area > 0) {
                                System.out.println("El area del triangulo es " + area);
                            }
                            while (areamayor < area) {
                                areamayor = area;
                                triangulomayor = contador;
                            }

                        } catch (InputMismatchException error) {
                            System.out.println("Favor ingrese un valor numerico");
                            lea.nextLine();
                            contador--;

                        }

                    }
                    System.out.println("El area mayor " + areamayor + " y se ha encontrado en el triangulo " + triangulomayor);
                    break;
                case 2:
                    System.out.println("Bienvenido al programa MCM y MCD!");
                case 3:
            }
        }
    }

}
