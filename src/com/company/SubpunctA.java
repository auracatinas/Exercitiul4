package com.company;
/*Read a number N from the keyboard. Then read N numbers from the keyboard and
      a)  Print them on the screen on new lines
        */


import java.util.Scanner;

public class SubpunctA {
    public static void main(String[] args) {

        int N;
        System.out.print("Cate numere introduce-ti : ");
        N = new Scanner(System.in). nextInt();
        int N1;

        for( int i = 1; i<=N ;i++){
            System.out.print("Dati numarul : ");
            N1 = new Scanner(System.in). nextInt();
            System.out.println(N1);
        }

    }
    }

