# (N/1) + (N-1/2) + (N-2/3)+...+(1/N)

n = 0
a = 1

def Soma(x, y):
   
  if (x ==1):
    return x/y

  else:

    return x/y + Soma(x-1,y+1)

n = int(input("Insira um valor: "))    

print(Soma(n,a))
