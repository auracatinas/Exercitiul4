package com.company;
/*Read a number N from the keyboard. Then read N numbers from the keyboard and
       d) Detect the maximum number that was read from the keyboard and print it on the screen
        */


import java.util.Scanner;

public class SubpunctD {
    public static void main(String[] args) {
        int N;
        System.out.print("Cate numere introduce-ti" + "  : ");
        N = new Scanner(System.in).nextInt();
        int N1 = 0;
        int maxim = -2137483647;
        for (int i = 1; i <= N; i++) {
            System.out.print("Dati numarul : ");
            N1 = new Scanner(System.in).nextInt();
            if (N1 > maxim) {
                maxim = N1;

            }
        }
        System.out.print(" nr mai mare e: " + maxim);
    }
}



