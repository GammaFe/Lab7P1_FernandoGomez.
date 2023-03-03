package com.mycompany.lab7p1_fernandogomez;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab7P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Promedios");
            System.out.println("2. De landscape a portrait");
            System.out.println("3. Higher-Order contains");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    int dado = 0;
                    System.out.println("Ingrese las filas de la Matriz");
                    int M = entrada.nextInt();
                    System.out.println("Ingrese las columas de la Matriz");
                    int N = entrada.nextInt();
                    int[][] matriz = new int[M][N];
                    System.out.println("Matriz Generada");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < N; j++) {
                            dado = new Random().nextInt((99 - 0) + 1) + 0;
                            matriz[i][j] = dado;
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println("");
                    }

                    System.out.println("Calcular el promedio de \n 1.Filas \n 2.Columnas");
                    int prom = entrada.nextInt();
                    while (prom > 2) {
                        System.out.println("Calcular el promedio de \n 1.Filas \n 2.Columnas");
                        prom = entrada.nextInt();
                    }
                    if (prom == 1) {
                        System.out.println("El promedio de Filas de la matriz");
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < N; j++) {
                                System.out.print("[" + matriz[i][j] + "]");
                            }
                            System.out.println("");
                        }
                    } else if (prom == 2) {
                        System.out.println("El promedio de columnas de la matriz");
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < N; j++) {
                                System.out.print("[" + matriz[i][j] + "]");
                            }
                            System.out.println("");
                        }
                    }
                    System.out.println("es");
                    double[] Q = ejercicio1(matriz, prom);
                    for (int i = 0; i < Q.length; i++) {
                        System.out.print("[" + Q[i] + "]");
                    }
                    //JOptionPane.showMessageDialog(parentComponent, matrix);
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    dado = 0;
                    System.out.println("Ingrese las filas de la Matriz");
                    M = entrada.nextInt();
                    System.out.println("Ingrese las columas de la Matriz");
                    N = entrada.nextInt();
                    int[][] pad = new int[M][N];
                    System.out.println("La rotacion de 90 grados a la derecha de");
                    for (int i = 0; i < pad.length; i++) {
                        for (int j = 0; j < N; j++) {
                            dado = new Random().nextInt((9 - 0) + 1) + 0;
                            pad[i][j] = dado;
                            System.out.print("[" + pad[i][j] + "]");
                        }
                        System.out.println("");
                    }
                    System.out.println("es");
                    int[][] pin = ejercicio2(pad);
                    for (int i = 0; i < pin.length; i++) {
                        for (int j = pin[i].length - 1; j >= 0; j--) {
                            System.out.print("[" + pin[i][j] + "]");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    dado = 0;
                    System.out.println("Ingrese las filas de la Matriz");
                    M = entrada.nextInt();
                    System.out.println("Ingrese las columas de la Matriz");
                    N = entrada.nextInt();
                    System.out.println("Ingrese el tamaño del arreglo");
                    int S = entrada.nextInt();
                    int[] arreg = new int[S];
                    int[][] matrix = new int[M][N];
                    System.out.println("Matriz generada");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < N; j++) {
                            dado = new Random().nextInt((9 - 0) + 1) + 0;
                            matrix[i][j] = dado;
                            System.out.print("[" + matrix[i][j] + "]");
                        }
                        System.out.println("");
                    }
                    int cont = 0;
                    int element = 0;
                    while (cont < S) {
                        System.out.println("");
                        System.out.println("ingrese el elemonto [" + cont + "]");
                        element = entrada.nextInt();
                        arreg[cont] = element;
                        for (int i = 0; i < cont; i++) {
                                                    System.out.print("["+arreg[i]+"]");
                        }
                        cont = cont +1;
                        
                    }
                    for (int i = 0; i < cont; i++) {
                                                    System.out.print("["+arreg[i]+"]");
                    }
                    break;
                case 4:
                    // JOptionPane.showMessageDialog(null,"Adios"+null);
                    System.out.println("Adios");
                    System.exit(0);
                    break;
                default:
                    //JOptionPane.MESSAGE_PROPERTY;
                    System.out.println("Ingrese otro numero");
                    break;
            }
        }

    }

    public static double[] ejercicio1(int[][] matriz, int prom) {
        int contfila = 0;
        int contcoluman = 0;
        for (int[] j : matriz) {
            contfila = contfila + 1;
            contcoluman = 0;
            for (int i : j) {
                contcoluman = contcoluman + 1;

            }
        }
        double[] promedio = new double[0];
        double acum = 0;
        if (prom == 1) {
            promedio = new double[contfila];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    acum = acum + matriz[i][j];

                }
                promedio[i] = acum;
                acum = 0;
                promedio[i] = promedio[i] / contfila;
            }
        }
        acum = 0;
        if (prom == 2) {
            promedio = new double[contcoluman];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    acum = acum + matriz[j][i];
                }
                promedio[i] = acum;
                acum = 0;
                promedio[i] = promedio[i] / contfila;
            }
        }
        return promedio;

    }

    public static int[][] ejercicio2(int[][] pad) {
        int contfila = 0;
        int contcoluman = 0;
        for (int[] j : pad) {
            contfila = contfila + 1;
            contcoluman = 0;
            for (int i : j) {
                contcoluman = contcoluman + 1;
            }
        }
        int[][] pin = new int[contcoluman][contfila];
        for (int i = 0; i < pin.length; i++) {
            for (int j = 0; j < pin[i].length; j++) {
                pin[i][j] = pad[j][i];
            }
        }

        return pin;
    }

    public static boolean containsHO(int[][] matrix, int arreg) {
        boolean resp = true;

        
        return resp;
    }
}
