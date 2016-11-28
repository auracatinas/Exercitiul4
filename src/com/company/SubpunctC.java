package com.company;

/*Read a number N from the keyboard. Then read N numbers from the keyboard and
        c) Compute their product and print it at the end on the screen
       */


import java.util.Scanner;

public class SubpunctC {
    public static void main(String[] args) {
            int N;
            System.out.print("Cate numere introduce-ti" + "  : ");
            N = new Scanner(System.in). nextInt();
            int product = 1;
            int N1;
            for( int i = 1; i<=N ;i++){
                System.out.print("Dati numarul : ");
                N1 = new Scanner(System.in). nextInt();
                product= product *N1 ;

            }
            System.out.println(product);
        }
    }

