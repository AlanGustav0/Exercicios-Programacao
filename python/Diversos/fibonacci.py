ok = False

def validation(number):
    global ok

    if number <= 0:
        print('Error! Invalid number!')
    else:
        ok = True
        return ok

def Fibo(number):
    previous = 1
    current = 1
    auxiliary = 0
    count = 0

    while count < number:
        next = current + previous
        print('- {}'.format(next), end=' ')

        previous = current
        current = next
        count += 1


while ok == False:
    try:
        number = (int(input('Isert the number: ')))
        validation(number)
    except:
        ValueError
        print('Error! Invalid value!')

Fibo(number)
