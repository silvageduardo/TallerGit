import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GolondrinaTest {

    Golondrina pepita;

    @BeforeMethod
    public void setUp() {
        pepita = new Golondrina(40, true);
    }

    @Test
    public void test() {
        //Los assert son asi ahora.
        //Los valores van al revez que en wollok,
        //Primero lo que devuelve y despues el resultado esperado
        Assert.assertEquals(pepita.energia(), 40);
    }
}