package mx.iteso;

import java.util.ArrayList;


public class Boiler1 extends ChocolateBoiler {

    private static Boiler1 uniqueInstance;

    private Boiler1(){
        empty = true;
        boiled = false;
    }

    public static Boiler1 getInstance(){
        if(uniqueInstance== null){
            synchronized (Boiler1.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Boiler1();
                }
            }
        }
        return uniqueInstance;
    }


}
