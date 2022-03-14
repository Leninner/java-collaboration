**ÍNDICE**

- [Introducción a Java](#introducción-a-java)
  - [Tipos de Datos](#tipos-de-datos)
- [Creación de programas en Java](#creación-de-programas-en-java)
- [Entrada y salida de datos](#entrada-y-salida-de-datos)
  - [Scanner](#scanner)
  - [JOptionPane](#joptionpane)
- [Operadores](#operadores)
  - [Aritméticos](#aritméticos)
  - [Lógicos](#lógicos)
  - [Relacionales](#relacionales)
- [Clase Math](#clase-math)

# Introducción a Java

¿Qué es Java?
¿Para qué sirve?

## Tipos de Datos

- Primitivos
- No primitivos

### Datos Primitivos

Existen 8 tipos de datos primitivos en Java:

- char => Puede almacenar un solo caractér y se lo declara con comillas simples ''
- boolean => Puede tomar el valor de true or false
- byte => is an 8-bit signed integer.
- short => is a 16-bit signed integer.
- int => is a 32-bit signed integer.
- long => is a 64-bit signed integer.
- float 
- double

# Creación de programas en Java

Para poder crear un programa en Java, primero debemos **crear una clase**. Para nombrar las clases, tenemos varias reglas:

1. Debe ser nombrada de **igual** forma **que el archivo** en el que está siendo creada
2. No debe tener espacios de por medio
3. Debe estar en **CamelCase**

- Ejemplo de una clase llamada `HolaMundo`

```java
// El nombre del archivo es HolaMundo.java

public class HolaMundo {

}
```

Luego debemos añadirle un **método** `main` que se va a **ejecutar cuando se ejecute el programa**. La sintaxis del método `main` es la siguiente:

```java
// Método main o principal
public static void main(String[] args) {
    System.out.println("Hola Mundo");
}
```

Finalmente, nuestro programa quedaría de la siguiente forma, lo ejecutamos y vamos a poder leer `Hola Mundo` en la terminal:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```

# Entrada y salida de datos

## Scanner

## JOptionPane

# Operadores

## Aritméticos

## Lógicos

## Relacionales

# Clase Math
