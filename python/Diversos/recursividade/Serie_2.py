# N + (n-1) + (n-2) + (n-3)+...+(1)

n = 0

def Soma(x):
   
  if (x ==1):
    return x

  else:

    return x + (Soma(x-1))

n = int(input("Insira um valor: "))    

print(Soma(n))
