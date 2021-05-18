def mutate_string(string, position, character):

    string[position] = character
    new_string = ''.join(string)

    print(new_string)



string = 'abracadabra'
character = 'k'
position = 5
lista = list(string)

mutate_string(lista, position, character)