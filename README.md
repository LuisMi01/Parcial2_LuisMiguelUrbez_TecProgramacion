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
<br>__a) Programe la clase enumearada CardinalPoints, que contendrá los puntos cardinales: NORTH, EAST, SOUTH y WEST, por este orden.__<br>
__b) Programe la clase Ship.__<br>

<ul>
  <li>Incluya los atributos de esta clase atributos y establezca la visibilidad adecuada (público, privado, protegido). Se aconseja utilizar un punto de partida, el tamaño y el enumerado llamado CardinalPoint para poner la dirección en la que se situa el barco a partir de un punto de partida O utilizar un punto inicial y un punto final y comprobar en el constructor que ambos puntos forman una recta. Se necesitarán más atributos para llevar la cuenta de los toques del barco.</li>
<li>Programe un constructor que reciba los datos necesarios para crear un barco.</li>
<li>Programe los métodos setters y getters para la clase en función de lo que necesite.</li>
<li>Programe el método is_sunk(self) de la clase Ship. Método para saber si el barco ya está
hundido.</li>
<li>Programe el método get_shot(self, shot_point). Implementación recibir disparo. El disparo
afectará al barco si se encuentra entre el punto de partida y el punto final. No se tendrá en cuenta si el disparo ha sido previamente hecho en el mismo punto o no. No es necesario hacer las comprobaciones para ver si el disparo está fuera del tablero de juego.</li>
  <li>Pruebe los objetos de la clase Usuario con los test cases.</li>

</ul>

<br>Para ayudar en el desarrollo de este ejercicio, se le hace entrega de un UML parcialmente completo de la posible implementación de este juego, así como de la clase Point, la cual representa un punto. Se facilitan también los archivos vacios dónde deberían estar implementadas las clases que se piden y que tienen que ser completadas por el alumno. En dichas clases, están ya añadidos los casos de tests de cada una de ellas.<br>
<br>__c) Programe una clase User.__<br>
<ul>
  <li>Incluya los atributos de esta clase y establezca la visibilidad adecuada (público, privado, protegido).</li>
  <li>Programe un constructor que reciba como parámetro los barcos de inicio del usuario (al
menos un barco). El método debe verificar el tipo y valor del parámetro y lanzar la excepción
correspondiente cuando no se cumplan los requisitos.</li>
<li>Programe los métodos setters y getters para la clase en función de lo que necesite. Si no
necesita algún o ningún getter y/o setter, argumente por qué en un comentario del módulo.</li>
<li>Programe el método attack(self, Point shot_point, User user). Este método se utiliza para
realizar un disparo al usuario user en el punto shot_point. El método devolverá True si cualquiera de los barcos que no han sido hundidos ha sido acertado y falso en caso contrario. Se debe hacer el control de excepciones para este método.</li>
<li>Programe el método get_shot(self, shot_point) de la clase Usuario. Este método se utiliza para recibir un disparo en el punto shot_point.</li>
<li>Programe el método is_alive(self) de la clase Usuario. Este método get se utiliza para obtener el atributo is_alive. Este atributo sirve para saber si el usuario aún está vivo.</li>
<li>Programe el método die(self) de la clase Usuario. Este método set se utiliza para establecer el atributo __alive en False. De esta forma, es posible matar al usuario.</li>
<li>Pruebe los objetos de la clase Usuario con los test cases que se le han pasado.</li>
</ul>

//Imagen

<br>__Nota:__<br>
- La diferencia en el Battleship, la frigate y la canoe con el Ship es la forma de ser atacado y el
tamaño fijo de cada uno de ellos.<br>
- Los barcos y los usuarios no guardan las posiciones<br>


### Ejercicio 5:<br>
<br>Se propone una extensión del juego hundir la flota en la que, en vez de jugar con un solo tipo de barco, se pueda jugar con tres tipos de barcos diferentes. Estos tres tipos diferentes de barcos van a ser acorazados (Battleship), fragatas (Frigates), y canoas (Canoes).<br>
<br>En base a estas especificaciones se solicita que:<br>
<br>__Programe una clase Battleship.__ Este barco es grande y fuerte con un tamaño fijo (es decir, su tamaño va a ser igual a 5 posiciones del tablero). Además, este barco especial tiene contenedores aislados, por lo tanto, necesita que toquen todas sus posiciones aisladas para hundirlo y requiere de la creación de los atributos correspondientes para controlar esta casuística. La implementación al ser atacado deberá ser modificada.<br>
<br>__Programe una clase Frigate.__ Este barco es mediano con un tamaño fijo (es decir, su tamaño va a ser igual a 3 posiciones del tablero).<br>
<br>__Programe una clase Canoe.__ Este barco es pequeño con un tamaño fijo (es decir, su tamaño va a ser igual a 1 posiciones del tablero).<br>
<br>Reutilize tanto código como sea posible del ejercicio 4 para hacer esta extensión del juego.<br>
<br>No es necesario implementar el docString correspondiente a las funciones y métodos desarrollados, aunque se recomienda hacerlo para facilitar la comprensión por parte del estudiante.<br>


### Ejercicio 6:<br>

<br>En este ejercicio se pide que se implemente el módulo principal del juego hundir la flota. Este módulo va a implementar la partida que van a jugar los jugadores.<br>
<br>En este módulo main, lo primero que se hace es obtener la configuración deseada de los barcos por parte de cada usuario sobre el tablero. Hay que tener en cuenta, que cada usuario solamente va a tener como máximo tres barcos en el tablero al iniciar la partida. La configuración de cada usuario va a ser introducida por consola.<br>
<br>Seguidamente, una vez que se tienen las configuraciones, el juego puede comenzar entre los jugadores. En cada turno cada jugador va a atacar al otro jugador en una posición aleatoria. Cuando uno de los dos usuarios tenga ya todos sus barcos hundidos al acabar el turno, se acaba el juego y se indica quien es el ganador. En el caso de que los dos acaben sin barcos en el mismo turno, el juego indicará un empate. En cada turno los dos usuarios atacan con independencia de si sus barcos están hundidos.<br>
<br>Recuerde utilizar las clases implementadas tanto en el ejercicio 4 como en el ejercicio 5 para implementar todos los componentes de este juego.<br>
<br>El diagrama de flujo de este módulo principal le ha sido proporcionado a modo de guía.<br>
//Imagen
<br>La acción One User attacks es realmente el ataque secuencial de User1 a user2 y de user2 a user1 (o viceversa).<br>


### Ejercicio 7:<br>
<br>Escribir un algoritmo que permita utilizar tres tablas hash para guardar los datos de barcos, que contemple las siguientes actividades:<br>
<ul>
<li>a. En la primera tabla hash la función hash debe ser sobre el tipo de barco, en la segunda tabla la función hash deberá utilizar el número del barco como clave, mientras que en la tercera el campo clave de la función hash será por el nombre del barco.</li>
<li>b. El tamaño de la primera tabla debe ser lo suficientemente grande como para que pueda almacenar todos los distintos tipos de barcos, debe manejar las colisiones con alguna función de sondeo.</li>
<li>c. El tamaño de cada una de las segundas tablas debe ser 15.</li>
<li>d. El algoritmo debe permitir cargar tipos de barcos en la primera tabla y crear su respectiva segunda tabla, en el caso de que no exista.</li>
<li>e. Si el barco es de más de un tipo deberá cargarlo en cada una de las tablas que indiquen estos tipos.</li>
<li>f. Deberá permitir cargar barcos de los cuales se dispone de su número, nombre, tipo y nivel.</li>
  </ul>
