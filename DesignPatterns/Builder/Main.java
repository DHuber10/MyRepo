package OOPFundamentals.Builder;

public class Main {

    public static void main(String[] args) {

        CarBuilder builder = new RegularCarBuilder();

        CarDirector director = new CarDirector(builder);

        Car car = director.createCar();

        System.out.println("Car:");
        System.out.println("Id: " + car.getId());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Height: " + car.getHeight());
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Nbr of doors: " + car.getNbrOfDoors());


    
}
}
