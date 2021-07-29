from Cadastro_Pessoas.entity import main

cadastro = True
arquivo = 'arquivo.txt'

main.verifica_arquivo(arquivo)
main.cabecalho()
while cadastro:
    main.menu()
    try:
        opcao_menu = int(input('Escolha a opção desejada: '))
        if opcao_menu == 1:
            main.cadastrar(opcao_menu,arquivo)
        elif opcao_menu == 2:
            main.acessar_cadastro(2,arquivo)
        elif opcao_menu == 3:
            cadastro = main.encerrar(opcao_menu)
        else:
            print('\033[0;31mOpcação inválida!\033[m')
            print('=' * 30)

    except(ValueError,TypeError):
        print('\033[0;31mErro, Digite um valor inteiro válido!\033[m')
        print('=' * 30)





