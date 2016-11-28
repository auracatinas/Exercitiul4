package com.company;
import java.util.Scanner;

/*Read a number N from the keyboard. Then read N numbers from the keyboard and
        Compute their sum and print it at the end on the screen
      */



public class SubpunctB {

    public static void main(String[] args) {
        int N;
        System.out.print("Cate numere introduce-ti" + "  : ");
        N = new Scanner(System.in). nextInt();
        int sum= 0;
        int N1;
        for( int i = 1; i<=N ;i++){
            System.out.print("Dati numarul : ");
            N1 = new Scanner(System.in). nextInt();
            sum=sum+N1;

        }
        System.out.println(sum);
    }
}


