package com.elisbjr;

import java.util.Scanner;

//9 - Faça um programa para a leitura de duas notas parciais de um aluno.
public class ReadingNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota parcial: ");
        double firstNote = scanner.nextDouble();

        System.out.print("Digite a segunda nota parcial: ");
        double secondNote = scanner.nextDouble();

        System.out.println("Notas lidas: Nota 1 = " + firstNote + ", Nota 2 = " + secondNote);

        scanner.close();
    }
}
