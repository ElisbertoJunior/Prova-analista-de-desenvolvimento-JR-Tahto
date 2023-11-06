package com.elisbjr;

import java.util.Scanner;

//8 - Faça um programa que verifique se uma letra digitada é vogal ou consoante.
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letter = scanner.next().charAt(0);

        if (isVowel(letter)) {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        }

        scanner.close();
    }


    //Método que verifica se a letra e uma vogal
    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
