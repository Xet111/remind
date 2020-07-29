package Jav8.Patterns.FactoryLesson;

public class Factory {
    public Car create(String typeOfCar){
        switch (typeOfCar){
            case ("Toyota"):
                return new Toyota();

            case("Audi"):
                return new Audi();

        }
        return null;

    }
}
