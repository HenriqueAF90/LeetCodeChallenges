 package Java;

import java.util.Random;
import java.util.Scanner;

class AdivinhaNumeroGame {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo da adivinhação");
        Random random = new Random();
        int numeroSorteio = random.nextInt(100);
        int chute = 0;
        int tentativas = 0;
        Scanner sc = new Scanner(System.in);

        while (chute != numeroSorteio) {
            System.out.println("Qual o número você acha que o computador pensou? [0-100] ");
            chute = sc.nextInt();
    
            tentativas ++;
            if (chute > numeroSorteio) {
                System.out.println("O nímero secreto é menor");
            }
            else if (chute < numeroSorteio) {
                System.out.println("O número secreto é maior");   
            }    
        }
        String palavra_tentativas = tentativas > 1 ? " vezes" : " vez";

        System.out.println("Você acertou tentando " + tentativas + palavra_tentativas);

        sc.close();

    }
    
}