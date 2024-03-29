/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ies.eed.practicajunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import ies.eed.practicajunit.balls.Ball;
import ies.eed.practicajunit.balls.BallColor;
import ies.eed.practicajunit.balls.BallType;
import javafx.geometry.Point2D;

class AppTest {
    @Test
    void testStopInX1() throws Exception {
        Ball ball = new Ball(new Point2D(40, 40), BallType.BIG, BallColor.BLUE);
        // con parámetros
        // Method privateMethod = Ball.class.getDeclaredMethod("stopinY", int.class);
        //se le pasa el nombre del método privado en este caso stopinY
        Method privateMethod = Ball.class.getDeclaredMethod("stopinY");
        privateMethod.setAccessible(true);
        // con parámetros
        // int result = (int) privateMethod.invoke(TestClass, 10);
        privateMethod.invoke(ball);
        assertEquals(0, ball.getGravity().getY());
        assertEquals(0, ball.getVelocity().getY());
    }
}
