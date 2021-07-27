def jumpingOnClouds(c):
    pos = len(c) - 3
    jump = 0
    i = 0

    while i < len(c)-1:
        if i <= pos:
            if c[i+2] == 0:
                jump += 1
                i += 2
            else:
                jump += 1
                i += 1
        else:
            if c[i+1] == 0:
                jump += 1
                i += 1

    print(jump)

c = [0,0,1,0,0,1,0]
jumpingOnClouds(c)