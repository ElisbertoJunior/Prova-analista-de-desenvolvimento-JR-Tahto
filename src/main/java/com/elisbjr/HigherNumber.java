package com.elisbjr;

import java.util.Scanner;

// 5- Faça um programa que peça dois números e imprima o maior deles Dica:
// para realizar a inserção de dados pelo usuário utilize a função input("texto para o usuario")
public class HigherNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();

        int largest = Math.max(firstNumber, secondNumber);

        System.out.println("O maior número digitado foi: " + largest);
    }
}