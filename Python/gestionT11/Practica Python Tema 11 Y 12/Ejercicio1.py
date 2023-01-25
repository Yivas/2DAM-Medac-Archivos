# 1. Crea una función llamada “contar_palabras” que tome como argumento una cadena
# de texto y cuente la cantidad de palabras que hay en ella.
# 2. Utiliza la librería “re” para eliminar cualquier signo de puntuación de la cadena de
# texto antes de contar las palabras.
# 3. Crea una segunda función llamada “contar_palabras_archivo” que tome como
# argumento el nombre de un archivo de texto y utilice la función “contar_palabras”
# para contar el número de palabras en ese archivo. Utilice la función open() para abrir
# el archivo y la función read() para leer su contenido.
# 4. Utiliza la librería “os” para determinar si el archivo especificado existe en el sistema
# antes de intentar abrirlo y contar las palabras. En caso contrario, imprima un
# mensaje de error indicando que el archivo no existe.
# 5. Llame a la función “contar_palabras_archivo” con el nombre de un archivo de texto
# de su elección y guárdelo en una variable llamada “resultado”. Imprima el resultado.
import os
import re

def contar_palabras(cadena):
    cadena = re.sub(r'[^\w\s]','',cadena)
    return len(cadena.split())

def contar_palabras_archivo(nombre_archivo):
    if os.path.exists(nombre_archivo):
        with open(nombre_archivo, 'r') as archivo:
            return contar_palabras(archivo.read())
    else:
        print("El archivo no existe")


resultado = contar_palabras_archivo("texto.txt")
print(resultado)