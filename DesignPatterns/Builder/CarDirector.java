package OOPFundamentals.Builder;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car createCar() {
        return carBuilder
                .id(1)
                .brand("Volvo")
                .model("V70")
                .color("Red")
                .height(1600)
                .engine("V8")
                .nbrOfDoors(5)
                .build();
    }

}

   
