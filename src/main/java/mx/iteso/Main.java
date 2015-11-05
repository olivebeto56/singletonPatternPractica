package mx.iteso;


public class Main {

    public static void main (String[] args){
        ChocolateBoiler boiler;

        boiler = Boiler1.getInstance();

        pirntBoiler(boiler);

        boiler.fill();
        pirntBoiler(boiler);


        boiler.boil();
        pirntBoiler(boiler);

        boiler.drain();
        pirntBoiler(boiler);


    }

   public static void pirntBoiler(ChocolateBoiler boiler){

            if(boiler.empty)
                System.out.println("Boiler vacio");
            else
                System.out.println("Boiler lleno");

       if(boiler.boiled)
           System.out.println("Boiler hervido");
       else
           System.out.println("Boiler no hervido");

       System.out.println("_____________________________");


   }
}
