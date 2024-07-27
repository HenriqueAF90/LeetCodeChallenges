 package Java;

import java.util.Scanner;

class AdivinhaNumeroGame {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo da adivinhação");
        int numeroSorteio = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número você acha que o computador pensou? ");
        int chute = sc.nextInt();

        if (chute == numeroSorteio) {
            System.out.println("Numero correto");
        }
        else{
            System.out.println("Infelizmente você errou");
        }

        sc.close();

    }
    
}