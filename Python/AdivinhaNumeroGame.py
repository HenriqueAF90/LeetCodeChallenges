import random

class AdivinhaNumeroGame:
    numeroSorteado = random.randint(1,100)
    print('"Bem vindo ao jogo da adivinhação')
    chute = 0
    tentativas = 0

    while chute != numeroSorteado:
        chute = int(input('Qual o número você acha que o computador pensou? '))
        tentativas += 1
        if chute > numeroSorteado:
            print('O número é menor')
        elif chute < numeroSorteado:
            print('O número é maior')
    
    palavraTentativas = ' tentativa' if tentativas == 1 else ' tentativas'
    print(f'Parabéns você acertou com {tentativas} {palavraTentativas}')

    

