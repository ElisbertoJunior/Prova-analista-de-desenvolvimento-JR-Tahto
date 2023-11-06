package com.elisbjr;

import java.util.Scanner;

//7 - Faça um programa que verifique se uma letra digitada é “F” ou “M”.
// Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.
public class GenderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o gênero (F/M): ");
        String gender = scanner.next();

        if (gender.equalsIgnoreCase("F")) {
            System.out.println("F-  Feminino");
        } else if (gender.equalsIgnoreCase("M")) {
            System.out.println("M- Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        //**Exemplo de uma forma consisa e simplificada de chegar ao mesmo resultado.
        //String message = (gender.equalsIgnoreCase("F")) ? "F- Feminino"
        //       : (gender.equalsIgnoreCase("M")) ? "M- Masculino" : "Sexo inválido";

        //System.out.println(message);

        scanner.close();
    }
}
