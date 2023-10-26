package OOPFundamentals.Builder;

public class RegularCarBuilder implements CarBuilder {

    private int id, height, nbrOfDoors;
    private String brand, model, color, engine;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder height(int height) {
        this.height = height;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, color, height, engine, nbrOfDoors);
    }

}
