package Jav8.Patterns.BuilderLesson;

public interface Builder {
    public void reset();
    public void setSeats(int seats);
    public void setEngine(String engine);
    public void setGps(boolean gps);
}
