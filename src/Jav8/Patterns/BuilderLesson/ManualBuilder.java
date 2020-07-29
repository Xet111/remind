package Jav8.Patterns.BuilderLesson;

public class ManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();

    }

    @Override
    public void setSeats(int seats) {
        manual.setSeats(seats);

    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);

    }

    @Override
    public void setGps(boolean gps) {
        manual.setGPS(gps);


    }
    public Manual getResult(){
        System.out.println("Manual");
        return manual;
    }
}
