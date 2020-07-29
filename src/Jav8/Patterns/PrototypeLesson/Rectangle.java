package Jav8.Patterns.PrototypeLesson;

public class Rectangle extends Shape{
    private int height, width;
    public Rectangle(){

    }
    public Rectangle(Rectangle rectangle){
        super(rectangle);
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
