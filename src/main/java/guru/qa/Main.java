package guru.qa;

public class Main {
    public static void main(String... args){
        Car hundai = new Car();
        hundai.brand = "Hyundai";
        hundai.color = "белого";
        hundai.price = 10000;
        hundai.year = 2014;
        Fuel fuel = new Fuel();
        fuel.type = "бензине";
        fuel.anothertype = "дизеле";

        System.out.println(" Это машина " + hundai.brand + " она " + hundai.year+"го года выпуска" + ", она " + hundai.color + " цвета " + " и её цена " +hundai.price
                + ", она ездит на " +fuel.type + " и на " +fuel.anothertype);

    }
}
