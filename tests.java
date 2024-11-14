import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Expression addition = new Addition(deux, trois);
        assertEquals(5, addition.valeur());
    }

    @Test
    public void testSoustraction() {
        Expression dixSept = new Nombre(17);
        Expression deux = new Nombre(2);
        Expression soustraction = new Soustraction(dixSept, deux);
        assertEquals(15, soustraction.valeur());
    }

    @Test
    public void testMultiplication() {
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Expression multiplication = new Multiplication(deux, trois);
        assertEquals(6, multiplication.valeur());
    }

    @Test
    public void testDivision() {
        Expression dix = new Nombre(10);
        Expression deux = new Nombre(2);
        Expression division = new Division(dix, deux);
        assertEquals(5, division.valeur());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero() {
        Expression dix = new Nombre(10);
        Expression zero = new Nombre(0);
        Expression division = new Division(dix, zero);
        division.valeur(); // Doit lancer une ArithmeticException
    }
}
