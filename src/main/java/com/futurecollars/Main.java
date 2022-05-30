package com.futurecollars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę aby sprawdzić jej parzytość i nieparzystość:");
        int number = scanner.nextInt();
        System.out.println(isEvenNumber(number) ? "Liczba jest parzysta" : "Liczba nie jest parzysta");
        System.out.println(isOddNumber(number) ? "Liczba jest nieparzysta" : "Liczba nie jest nieparzysta");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static boolean isOddNumber(int number) {
        return !isEvenNumber(number);
    }
}