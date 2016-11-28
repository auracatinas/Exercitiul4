package com.company;

/*Read a number N from the keyboard. Then read N numbers from the keyboard and

      e)  Detect the minimum number that was read from the keyboard and print it on the screen*/


import java.util.Scanner;

public class SubpunctE {
    public static void main(String[] args) {

        int N;
        System.out.print("Cate numere introduce-ti" + "  : ");
        N = new Scanner(System.in).nextInt();
        int N1 = 0;
        int minim =2137483647;
        for (int i = 1; i <= N; i++) {
            System.out.print("Dati numarul : ");
            N1 = new Scanner(System.in).nextInt();
            if (minim > N1) {
                minim = N1;

            }

        }
        System.out.print(" nr mai mic e: " + minim);
    }
}

