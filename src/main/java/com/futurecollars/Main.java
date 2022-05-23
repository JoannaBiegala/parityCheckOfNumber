package com.futurecollars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in) ;
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        System.out.println(isEvenNumber(number));
        System.out.println(isOddNumber(number));
     }
     public static boolean isEvenNumber(int number) {
        int modulo =  number%2;
        return modulo == 0;
    }
    public static boolean isOddNumber(int number) {
        int modulo =  number%2;
        return modulo != 0;
    }
}