# JUnit 5

Las pruebas de caja negra son las más utilizadas en las diferentes fases de desarrollo, utilizando para pruebas de componentes/unitarias, integración o sistema. A partir de las definiciones de los casos de prueba se definen en código utilizando librerías o “frameworks” creados con tal fin, permitiendo la automatización de las pruebas. 

La librería más conocida en Java es JUnit, que actualmente se encuentra en la versión 5. https://junit.org/junit5/ 



![image](https://github.com/pass1enator/DAWAirTemplate/blob/master/portada.png?raw=true)
   
## Enunciado
Se quiere crear pequeño juego, uno de los componentes es una pelota que rebota por la pantalla. La pelota ha de rebotar contra el suelo, el techo y los laterales, ha de afectarle la gravedad y cada vez que toca el suelo rebota con una velocidad igual a la gravedad por un factor (<1), además existe un pequeño rozamiento al desplazarse en el eje x, hasta que la velocidad en ese eje sea menor que una constante. 

Se utiliza JavaFX con las diferentes clases que posee: 

    Point2D. 

    Dimension2D. 

    ... 
Completar el código de los métodos que faltan, diseñar los casos de prueba para los métodos: 

    - public Ball(Point2D position, BallType type, BallColor color) 

    - public void move(Rectangle2D board) 

    - private void stopinY() 

    - private void stopinX() 

    - private void reverseVy() 

    - private void reverseVx() 

    - private void updateVelocity() 

Se ha de tener en cuenta que: 

    - Se han de definir pruebas unitarias. 

    - Algunos de las pruebas han de tener suposiciones. 

    - Se han de utilizar al menos 5 tipos de aserciones. Entre ellas las relacionadas con excepciones. 

    - Definir fuentes de datos, tanto con anotaciones como con ficheros CSV para al menos 2 pruebas, por ejemplo, el constructor sobrecargado y el movimiento con diferentes tableros. 

    - Indicar para cada prueba o conjunto de pruebas la estrategia de caja negra utilizada (particiones, valores límite o conjetura de errores) 