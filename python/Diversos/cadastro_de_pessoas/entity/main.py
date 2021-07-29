def cabecalho(opcao=0):
    if opcao == 1 or opcao == 3:
        print('=' * 30)
        print(f'\033[0;34m{"OPÇÃO":>15} {opcao}\033[m')
        print('=' * 30)

    elif opcao == 2:
        print('=' * 30)
        print(f'\033[0;34m{"PESSOAS CADASTRADAS":>25}\033[m')
        print('=' * 30)
    elif opcao == 0:
        print('=' * 30)
        print(f'\033[0;34m{"MENU":>15}\033[m')
        print('=' * 30)

def menu():
    print(f'1-Cadastrar\n2-Mostra Cadastrados\n3-Encerrar Programa')
    print('='*30)


def cadastrar(opc,arquivo):
    cabecalho(opc)
    try:
        arquivo = open(arquivo, 'at')
    except:
        print('\033[0;31mErro ao cadastrar usuário\033[m')
    else:
        nome = str(input('Digite o nome: '))
        idade = int(input('Digite a Idade: '))
        arquivo.write(f'{nome};{idade}\n')
        arquivo.close()
        print('\033[0;36mUsuário cadastrado com sucesso!\033[m')
        print('='* 30)

def acessar_cadastro(opc,arquivo):
    cabecalho(opc)
    try:
        ar = open(arquivo,'rt')
    except:
        print('Erro ao acessar arquivo')
    else:
        for linha in ar:
            usuario = linha.split(';')
            print(f'NOME:{usuario[0]:<15} IDADE:{usuario[1]}')
    finally:
        print('='*30)
        ar.close()


def encerrar(opcao_menu):
    cabecalho(opcao_menu)
    opc = False
    print(f'\033[0;36m{"Programa Finalizado! Até logo!":>15}\033[m')
    print('=' * 30)
    return opc

def verifica_arquivo(arquivo):
    nome_arquivo = arquivo
    try:
        arquivo = open(arquivo,'rt')
        print(f'O arquivo de nome "{nome_arquivo}" foi aberto com sucesso')
    except:
        arquivo = open(arquivo, 'w')
        print(f'Novo arquivo de nome "{nome_arquivo}" gerado com sucesso')




