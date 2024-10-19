import os

# Crear un archivo README.md con la descripción solicitada
readme_content = """
# Proyecto: Analizador de Gramática

## Descripción del Proyecto
Este proyecto implementa un **analizador léxico** que procesa un archivo de gramática en formato `.txt`, identificando diferentes secciones como `TOKENS`, `SETEO`, y `LISP`. El programa es capaz de reconocer patrones definidos por expresiones regulares y clasifica cada entrada del archivo en diferentes categorías, imprimiendo el resultado en la consola.

El analizador incluye un menú interactivo que permite al usuario procesar el archivo de gramática o salir del programa. El archivo de entrada predeterminado es `GRAMATICA.TXT` y debe estar ubicado en la raíz del proyecto.

## Funcionalidades
- Procesa la sección `TOKENS` y reconoce diferentes patrones definidos.
- Procesa la sección `SETEO` para configuraciones específicas.
- Procesa la sección `LISP` para identificar y evaluar funciones Lisp.
- Imprime en consola el resultado del análisis, incluyendo los tokens reconocidos y cualquier error encontrado.
- Opciones de reiniciar el proceso o salir del programa.

## Expresiones Regulares
El analizador utiliza expresiones regulares para reconocer y clasificar los siguientes elementos:

- Números: `[0-9]+`
- Operadores aritméticos: `[*|/|+|-]`
- Caracteres especiales en las secciones de `SETEO` y `LISP`.

## Palabras Reservadas
Algunas de las palabras reservadas que el programa identifica son:
- `TOKENS`
- `SETEO`
- `LISP`
- `ifito`
- `isc$`

Estas palabras reservadas están definidas en la clase `Token` y ayudan a identificar las secciones del archivo que corresponden a configuraciones específicas de la gramática.

## Instrucciones para Ejecutar
1. Colocar el archivo `GRAMATICA.TXT` en la raíz del proyecto.
2. Ejecutar la clase `MetodosFinal` que contiene el menú principal del programa.
3. Ingresar la opción deseada para procesar el archivo o salir del programa.

## Requisitos
- JDK 8 o superior
- NetBeans o cualquier otro IDE compatible con Java.

## Autor
Proyecto desarrollado por: **Viru154**
"""

# Especificar la ruta de salida
output_file = "/mnt/data/README.md"

# Escribir el contenido en el archivo README.md
with open(output_file, "w") as file:
    file.write(readme_content)

output_file
