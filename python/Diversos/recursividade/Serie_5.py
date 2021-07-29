# (N)! + (N-1)! + (N-2)!+...+(1)!

n = 0

def Ffat(x):
  if (x == 1):
    return x
  else:
    return x * Ffat(x-1)

def Soma(x):
   
  if (x == 1):
    return x

  else:

    return Ffat(x) + Soma(x-1)

n = int(input("Insira o valor a ser somado: "))    

print(Soma(n))