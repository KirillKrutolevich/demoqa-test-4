package guru.qa;

public class Main {
    public static void main(String... args){
        Car hundai = new Car();
        Fuel fuel = new Fuel();





        System.out.println(" Это машина " + hundai.brandCar + " она " + hundai.yearCar + "го года выпуска" + ", она " + hundai.colorCar  + " цвета " + " и её цена " + hundai.priceCar
               + ", она ездит на " + fuel.typeFuel + " и на " +fuel.anotherType);

    }
}
