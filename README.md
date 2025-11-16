# Ordenación básica en Java

## Algoritmos: Inserción, Selección, Burbuja

Este proyecto implementa tres métodos de ordenación in-place sobre arreglos de enteros, siguiendo la estructura solicitada en la práctica de la Unidad 2 de Estructura de Datos.

Incluye:

- Implementaciones independientes de cada algoritmo.

- Versión con trazas (sort(int[], boolean)) para observar el proceso paso a paso.

- Un programa de demostración que permite ejecutar los algoritmos sobre cinco datasets.

- Utilidades para impresión y copia segura de arreglos.

## Estructura del proyecto

<img width="297" height="217" alt="image" src="https://github.com/user-attachments/assets/d0d40074-ed07-4ec1-926b-a647a14974b6" />

### BubbleSort
- Ordena comparando elementos adyacentes.
- Usa un corte temprano mediante una bandera que detecta si hubo intercambios en la pasada.
- Imprime trazas opcionalmente.

### InsertionSort
- Inserta cada elemento en la posición correcta recorriendo hacia atrás.
- Muestra movimientos y el estado del arreglo en cada iteración cuando "mostrar = true".

### SelectionSort
- Busca el menor elemento en la parte restante y lo intercambia con la posición actual.
- Registra la cantidad de intercambios realizados.
- Incluye trazas paso a paso.

### SortingUtils
Clase con metodos auxiliares. 

### SortingDemo
Menú interactivo en consola.

## Cómo ejecutar
1. Tener instalado OpenJDK.
2. Clonar el repositorio.
3. Correr la clase ejecutora "SortingDemo".

## Flujo Básico de Uso
- Al ejecutar SortingDemo, se muestra un menú con las tres técnicas de ordenación y la opción para ejecutar todas en secuencia.
- El usuario elige entre:
  Inserción
  Selección
  Burbuja
  Ejecución conjunta de los tres
- Se presentan los cinco arreglos predefinidos (A–E).
- El usuario selecciona uno y se imprime su estado original.
- Se crea una copia del arreglo original.
- Se ejecuta la función sort con trazas habilitadas.
- Se muestran pasos, intercambios o movimientos, según el método.
- Se imprime el arreglo resultante.
- En Selección, se reporta el total de intercambios.
- En Burbuja, el corte temprano detiene el proceso cuando no hay cambios.
- El menú aparece nuevamente para permitir usar otro algoritmo o salir del programa.

## Licencia
Proyecto académico para uso educativo.
