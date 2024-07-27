class AdivinhaNumeroGame:
    numeroSorterio = 1
    print('"Bem vindo ao jogo da adivinhação')
    chute = int(input('Qual o número você acha que o computador pensou? '))
    
    if chute == numeroSorterio:
        print('Número correto')
    else:
        print('Infelizmente você errou')

