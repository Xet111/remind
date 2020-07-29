package Jav8.Patterns.AdapterLesson;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;


    public SquarePegAdapter(SquarePeg peg, float e) {
        super(e);
        this.peg = peg;
    }

    @Override
    public float getRadius() {
        return (float)(peg.getWidth() + Math.sqrt(2)/2);
    }

    @Override
    public void setRadius(int radius) {
        super.setRadius(radius);
    }
}
