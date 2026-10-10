# Refugio de Mascotas

Sistema de consola en Java para administrar las mascotas de un refugio de animales rescatados, usando una lista ligada implementada desde cero.

## Descripción

Este proyecto es un sistema sencillo para llevar el registro de los perros y gatos de un refugio. Fue desarrollado como ejercicio para aplicar los conceptos de listas ligadas y Programación Orientada a Objetos en Java.

- El problema que resuelve: registrar, consultar y dar de baja mascotas de un refugio sin usar estructuras ya hechas como `ArrayList`.
- Los objetivos principales: implementar una lista ligada propia (clase nodo y clase lista) que almacene objetos de la clase `Mascota`, y permitir manipularla desde la consola.
- El contexto: proyecto individual de la materia de estructuras de datos

## Tecnologías Utilizadas

- Java
- Genéricos de Java (`Node<T>` y `SinglyLinkedList<T>`)

## Requisitos Previos

- Java Development Kit (JDK)
- Editor de código o IDE (IntelliJ IDEA o VS Code)

## Instalación

1. Clona este repositorio:

    - git clone https://github.com/GaelCerrillo/Proyecto_Linked_List.git

2. Navega a la carpeta del proyecto:

    - cd Refugio_Mascotas_Gael_Linked_Lits

3. Compila los archivos Java:

    - java Mascota.java Node.java SinglyLinkedList.java Main.java

## Uso

1. Ejecuta el programa desde la carpeta del proyecto:

    - java Main

2. Selecciona una opción del menú escribiendo el número correspondiente:

    - 1. Agregar mascota
    - 2. Eliminar mascota
    - 3. Mostrar mascotas
    - 4. Calcular edad promedio
    - 0. Salir

3. Sigue las indicaciones en consola:

    - Al agregar, ingresa el nombre, la especie (Perro o Gato) y la edad en meses.
    - Al eliminar, escribe el nombre de la mascota que quieres dar de baja.

## Características

- Clase `Mascota` con los atributos nombre, especie (Perro/Gato) y edad en meses.
- Lista ligada propia con clase nodo (`Node`) y clase lista (`SinglyLinkedList`).
- Menú interactivo por consola para agregar, eliminar y mostrar mascotas.
- Operación extra: cálculo de la edad promedio de las mascotas del refugio, recorriendo la lista y dividiendo la suma de edades entre el total de mascotas.
- Validación de datos: la especie solo acepta Perro o Gato, y la edad debe ser un número entero no negativo.

## Autores

Gael Alejandro Cerrillo Escanero

- Email: gace220106@gmail.com