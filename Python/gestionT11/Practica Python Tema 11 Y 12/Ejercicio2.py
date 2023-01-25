# 6. Crea una función llamada "contar_ocurrencias" que tome como argumentos una
# cadena de texto y una lista de palabras y devuelva un diccionario con las palabras de
# la lista como claves y el número de veces que aparecen en la cadena de texto como
# valores. Utilice el método "count()" para contar las ocurrencias de cada palabra en la
# cadena de texto.
# 7. Utiliza la librería "collections" para crear un objeto "Counter" a partir del diccionario
# devuelto por la función "contar_ocurrencias".
# 8. Crea una segunda función llamada "contar_ocurrencias_archivo" que tome como
# argumentos el nombre de un archivo de texto y una lista de palabras. Utilice la
# función "contar_ocurrencias" para contar las ocurrencias de las palabras de la lista
# en el archivo de texto. Utilice la función open() para abrir el archivo y la función
# read() para leer su contenido.
# 9. Utiliza la librería "os" para determinar si el archivo especificado existe en el sistema
# antes de intentar abrirlo y contar las ocurrencias. En caso contrario, imprima un
# mensaje de error indicando que el archivo no existe.
# 10. Llame a la función "contar_ocurrencias_archivo" con el nombre de un archivo de
# texto de su elección y una lista de palabras de su elección, y guárdelo en una
# variable llamada "resultado". Imprima el resultado.
import os

def contar_ocurrencias(cadena, lista):
    diccionario = {}
    for palabra in lista:
        diccionario[palabra] = cadena.count(palabra)
    return diccionario

def contar_ocurrencias_archivo(nombre_archivo, lista):
    if os.path.exists(nombre_archivo):
        with open(nombre_archivo, 'r') as archivo:
            return contar_ocurrencias(archivo.read(), lista)
    else:
        print("El archivo no existe")

resultado = contar_ocurrencias_archivo("texto.txt", ["hola", "mundo", "texto"])
print(resultado)