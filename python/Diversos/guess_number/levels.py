from random import randint

def Level(level):
    if level == 1:
        pc_number = randint(0, 5)
    elif level == 2:
        pc_number = randint(0, 10)
    elif level == 3:
        pc_number = randint(0, 20)
    return pc_number
