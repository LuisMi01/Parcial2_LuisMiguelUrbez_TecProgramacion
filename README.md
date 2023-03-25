# Proyecto "Hundir la flota" Luis Miguel Urbez

### Repositorio: https://github.com/LuisMi01/Parcial2_LuisMiguelUrbez_TecProgramacion/tree/main

## Ejercicios a realizar:

### Ejercicio 1:<br>
<br>Responda a las cuestiones:<br>

1) Los elementos que definen a un objeto son:
<ul>
  <li>a) El tipo de visibilidad que tiene asignado: privado o público.</li>  
  <li>b) La identidad, Los atributos que representan su estado y los métodos que representan su comportamiento.✅</li>
</ul>
2) El hecho de que un método pueda recibir un número variable de atributos se denomina: 
<ul>
  <li>a) Herencia</li>
  <li>b) Polimorfismo ✅</li>
  </ul>
3) Imagine que la clase C hereda de la clase B. Y la clase B hereda de la clase A. Cuando se cree un objeto de la clase C, ¿cuál será la secuencia en que se ejecutarán los constructores?
  <ul>
  <li>a) Primero el constructor de C, luego constructor de B y, finalmente, el constructor de A ✅</li>
  <li>b) Primero el constructor de A, luego constructor de B y, finalmente, el constructor de C</li>
  </ul>
4) Para referenciar los atributos de un objeto en un método de la misma clase
    <ul>
  <li>a) Debo utilizar la palabra reservada self como prefijo</li>
  <li>b) Los atributos deben ser públicos, en caso contrario no se pueden referenciar desde métodos que no sean el constructor.étodos que no sean el constructor.étodos que no sean el constructor.✅</li>
  </ul>
5) En el paradigma de la programación orientado a objetos:
      <ul>
  <li>a) Se recomienda que las acciones estén lo más acopladas posibles al código para obtener el mayor rendimiento posible.✅</li>
  <li>b) Se favorece la semántica y la reutilización de código en detrimento del rendimiento.</li>
  </ul>

### Ejercicio 2: <br>
__¿Cuáles son las características de la programación orientada a objetos?__<br>
<br>- Las caracteristicas de la programacion orientada a objetos es el uso de herramientas muy utiles como la abstracción, encapsulación, herencia y polimorfismo. Estas caracteristicas son ampliamente usadas para el uso de un buen codigo, al igual que son usados para el buen uso de los conceptos basicos de la programacion orientada a objetos (POO) como son los objetos, mensajes, clases, instancias y métodos.

### Ejercicio 3:<br>
__¿Qué es la visibilidad de una variable o un método? ¿Qué tipos hay? ¿Cuándo debe utilizarse cada tipo?__<br>
<br>- La visibilidad de una variable/metodo es la forma que tenemos de saber como de "conocido" es este metodo o atributo por el proyecto, es decir, si solo puede ser usado por una sola clase, si puede usarse por varios metodos/clases a la vez, etc. Estas son: Public: Un método o atributo tiene una visibilidad pública cuando todas las demás clases pueden acceder a ellos. Nos referimos a otra clase o una subclase. Private: Tan solo se puede ver y acceder a ellos desde el propio código de la clase. Y por ultimo Protected: Solo desde el propio código de su clase o de sus subclases pueden acceder.

### Ejercicio 4:<br>

El juego hundir la flota, conocido en el mundo anglosajón por su nombre en inglés battleship, es un juego tradicional de estrategia y algo de suerte, que involucra a dos participantes.<br>
<br>En este ejercicio, vamos a hacer una versión programada en Java para que dos jugadores puedan jugar a este juego.
La aplicación va a comenzar permitiendo que cada jugador posicione sus barcos en un único tablero. Cada jugador va a ocupar, según sus preferencias, una misma cantidad de casillas, horizontal y/o verticalmente, en base a las casillas sobre las cuales están representadas sus naves.
Cada jugador va a posicionar como máximo 3 barcos. Así, por ejemplo, cinco casillas consecutivas conforman un portaaviones; tres, una fragata; y una casilla aislada, una canoa.<br>
<br>No es necesario implementar el docString correspondiente a las funciones y métodos desarrollados, aunque se recomienda hacer el diagrama de flujo de los métodos en papel de forma previa a su resolución.
En base a estas especificaciones se solicita que:<br>
<br>a) Programe la clase enumearada CardinalPoints, que contendrá los puntos cardinales: NORTH, EAST, SOUTH y WEST, por este orden.<br>
b) Programe la clase Ship.<br>

