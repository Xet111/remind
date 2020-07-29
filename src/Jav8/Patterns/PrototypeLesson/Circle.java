package Jav8.Patterns.PrototypeLesson;

public class Circle extends Shape {
    private int rad;
    public Circle(){

    }
    public Circle(Circle circle){
        super(circle);
        this.rad = circle.rad;
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
