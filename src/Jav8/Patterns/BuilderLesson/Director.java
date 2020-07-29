package Jav8.Patterns.BuilderLesson;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("anime");
        builder.setGps(true);
    }
}
