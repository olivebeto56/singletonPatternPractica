package mx;


import mx.iteso.Boiler1;
import mx.iteso.ChocolateBoiler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Boiler1Test {

    @Test
    public void Test() {
        ChocolateBoiler boiler = Boiler1.getInstance();
        assertEquals(Boiler1.getInstance().hashCode(), boiler.hashCode());
    }

    @Test
    public void TestSameObject() {
        ChocolateBoiler boiler1 = Boiler1.getInstance();
        ChocolateBoiler boiler2 = Boiler1.getInstance();

        assertEquals(boiler1.hashCode(), boiler2.hashCode());
    }





}
