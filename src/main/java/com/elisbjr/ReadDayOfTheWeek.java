package com.elisbjr;

import java.util.Scanner;

//10 -  Faça um Programa que leia um número e exiba o dia correspondente da semana.
// (1- Domingo , 2- Segunda, etc.) se digitar outro valor deve aparecer “valor inválido)
public class ReadDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfTheWeek = {
                "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
                "Quinta-feira", "Sexta-feira", "Sábado"
        };

        System.out.print("Digite um número (1 a 7): ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 7) {
            String dayOfTheWeek = daysOfTheWeek[number - 1];
            System.out.println("Dia da semana correspondente: " + dayOfTheWeek);
        } else {
            System.out.println("Valor inválido");
        }
    }
}
