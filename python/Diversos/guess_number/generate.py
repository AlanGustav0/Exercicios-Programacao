import rules
from time import sleep


def thinking():
    print('Just a moment, I\'ll think of a number... \n')
    sleep(2)
    print('Great! \n')


def choice_number(pc_number, first_time, backupLevel):
    status_ok = False
    while not status_ok:
        try:

            if backupLevel == 1:
                number = int(input('Well, what number did I think? Insert a number 0 to 5:  '))
                if number < 0 or number > 5:
                    print('Invalid number!')
                else:

                    rules.remake(number, pc_number, first_time)

            elif backupLevel == 2:
                number = int(input('Well, what number did I think? Insert a number 0 to 10:  '))
                if number < 0 or number > 10:
                    print('Invalid number!')
                else:

                    rules.remake(number, pc_number, first_time)

            elif backupLevel == 3:
                number = int(input('Well, what number did I think? Insert a number 0 to 20:  '))
                if number < 0 or number > 20:
                    print('Invalid number!')
                else:

                    rules.remake(number, pc_number, first_time)

        except ValueError:
            print('Invalid option!')
