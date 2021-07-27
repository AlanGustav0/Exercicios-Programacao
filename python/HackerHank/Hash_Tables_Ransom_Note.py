
def checkMagazine(magazine, note):
    soma =0 
    for n in magazine:
        if n == note:
            soma += 1

    if soma == len(note):
        print('Yes')
    else:
        print('No')


magazine = 'give me one grand today night'.split(' ')
note = 'give me one grand today night'.split(' ')
checkMagazine(magazine, note)
