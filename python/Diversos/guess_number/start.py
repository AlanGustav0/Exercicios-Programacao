import generate
import levels


def start(first_time):
    choose = False
    if first_time:
        name = str(input('Insert your name: ')).title()
        first_time = False
        print('Hello {}, ready to play? \n'.format(name))
        print('The objective of this game is to guess the number I thought..\n')

    while not choose:

        level = int(input('**Choose the difficult level** \n '
                          '(1) Easy -  (2)Medium - (3)Hard: '))
        
        if level == 1 or level == 2 or level == 3:
            backupLevel = level
            levels.Level(level)
            generate.thinking()
            generate.choice_number(level, first_time, backupLevel)
        else:
            print('Invalid value! Try again!\n')
