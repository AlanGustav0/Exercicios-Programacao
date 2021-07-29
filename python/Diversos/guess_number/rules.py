import start


def validate(valid, first_time):
    if valid == "y":
        start.start(first_time)

    elif valid == "n":
        print('Good Bye!')
        exit()
    else:
        print('Invalid option')


def remake(number, pc_number, first_time):
    done = False
    if number == pc_number:
        print('You win! It was this number! \n')
    else:
        print('Oops, you lose! The number was {} try again!\n'.format(pc_number))

    while not done:
        valid = str(input('Do you want try again? Insert (Y) for Yes and ?(N) for No: ')).lower()
        validate(valid, first_time)
