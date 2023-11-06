package com.elisbjr;

import java.util.Scanner;

//6 - Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verifição: ");
        int number = scanner.nextInt();

        String message;

        //Verifica se o número e positivo, negativo ou zero que e um valor nulo
        if (number > 0) {
            message = "positivo";
        } else if (number < 0){
            message = "negativo";
        } else {
            message = "zero";
        }

        //**Exemplo de uma forma consisa e simplificada de chegar ao mesmo resultado
        //String message = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println("O número e: " + message);

        scanner.close();


    }
}