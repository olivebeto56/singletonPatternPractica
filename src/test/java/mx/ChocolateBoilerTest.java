package mx;


import mx.iteso.Boiler1;
import mx.iteso.ChocolateBoiler;
import org.junit.Before;
import org.junit.Test;


public class ChocolateBoilerTest {
    public ChocolateBoiler boiler;

    @Before
    public void Init() {
         boiler = Boiler1.getInstance();
    }

    @Test
    public void TetsFill() {
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }

    @Test
    public void TestBoil() {
        boiler.boil();
        boiler.drain();
        boiler.fill();

    }

    @Test
    public void TetsDrain() {
        boiler.drain();
        boiler.boil();
        boiler.fill();

    }






}
