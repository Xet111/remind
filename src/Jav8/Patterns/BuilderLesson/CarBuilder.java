package Jav8.Patterns.BuilderLesson;

public class CarBuilder implements Builder{
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);

    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);

    }

    @Override
    public void setGps(boolean gps) {
        car.setGPS(gps);
    }
    public Car getResult(){
        System.out.println("Car");
        return car;
    }
}
