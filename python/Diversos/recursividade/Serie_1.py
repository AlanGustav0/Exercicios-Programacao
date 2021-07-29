# 1 + 2 + 3+...+(100)

n = 100

def Soma(x):
   
  if (x ==1):
    return x

  else:

    return x + (Soma(x-1))

print(Soma(n))