package com.letscode.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Entre com o primeiro numero: ");
        int numberOne = numberScanner.nextInt();
        System.out.print("Entre com o segundo numero: ");
        int numberTwo = numberScanner.nextInt();

        System.out.printf("Multiplicação: %d %n", (numberOne * numberTwo));
        System.out.println("Divisão: " + (float) numberOne / numberTwo);
        System.out.printf("Soma: %d %n", (numberOne + numberTwo));
        System.out.printf("Subtração: %d %n", (numberOne - numberTwo));

    }
}
