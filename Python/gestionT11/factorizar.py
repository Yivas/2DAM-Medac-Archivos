# Pregunta un numero al usuario y se hace la suma factorial de dicho numero


# metodo multiplicar
def multiplicar(num):
    if num == 1:
        return 1
    else:
        return num * multiplicar(num-1)

print("Factorizacion de un numero")
print("Introduce un numero")
num = int(input())

for i in range(1, num+1):
    print(i, end=" ")
    if i < num:
        print("*", end=" ")
    else:
        print("=", end=" ")

print(multiplicar(num))

