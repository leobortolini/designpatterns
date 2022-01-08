package builder;

import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.cars.Car;
import builder.cars.Manual;
import builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        //Director pega o builder concreto do código do cliente
        
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

  
        // O objeto é retornado pelo builder, já que o Director nao é dependente 
        // dos builders e dos objetos
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director conhece diversas "receitas" de builders.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
