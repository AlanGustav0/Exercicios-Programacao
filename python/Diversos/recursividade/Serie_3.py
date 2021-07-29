# (1/1) + (1/2) + (1/3)+...+(1/n)

n = 0

def Soma(x):
   
  if (x ==1):
    return x

  else:

    return (Soma(x-1)) + (1/x)

n = int(input("Insira um valor: "))    

print(Soma(n))