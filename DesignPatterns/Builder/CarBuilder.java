package OOPFundamentals.Builder;

public interface CarBuilder {

    CarBuilder id(int id);
    CarBuilder brand(String brand);
    CarBuilder model(String model);
    CarBuilder color(String color);
    CarBuilder height(int height);
    CarBuilder engine(String engine);
    CarBuilder nbrOfDoors(int nbrOfDoors);
    Car build();
    

}

